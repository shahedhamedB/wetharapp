package com.example.whether.ui.homewether

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.os.Build
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.whether.core.base.BaseFragment
import com.example.whether.core.onClick
import com.example.whether.databinding.FragmentHomeBinding
import com.example.whether.utils.Resource
import com.google.android.gms.location.*
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException
import java.util.*

@AndroidEntryPoint
class HomeFragment : BaseFragment() {
    lateinit var binding: FragmentHomeBinding
    val viewModle: HomeViewModel by viewModels()
    lateinit var adapter: Weather_statusAdapter

    lateinit var adapter1: Weather_Day_Adapter
    private val INTERVAL: Long = 2000
    private val FASTEST_INTERVAL: Long = 1000
    lateinit var mLastLocation: Location
    private var SPLASH_TIME_OUT:Long=3000 // 3 sec
    internal lateinit var mLocationRequest: com.google.android.gms.location.LocationRequest
    private val REQUEST_PERMISSION_LOCATION = 10
    private var mFusedLocationProviderClient: FusedLocationProviderClient? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mLocationRequest = LocationRequest()
        val locationManager by lazy { requireActivity().getSystemService(Context.LOCATION_SERVICE) as LocationManager }
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            buildAlertMessageNoGps()
        }
        if (checkPermissionForLocation(requireContext())) {
            startLocationUpdates()
        }
        setupObservers()
        binding.language.onClick {
            if (prefs.language == "en") {
                setLanguage("ar")
                changeApplicationLanguage("ar")
            }else{
                setLanguage("en")
                changeApplicationLanguage("en")
            }


        }

    }

    private fun setupObservers() {
        viewModle.topAppList("48.834,2.394",5)
        viewModle.topappStatus.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    Log.d("res", it.data!!.data.weather?.get(0)!!.hourly.toString())

                    binding.tvDegree.text= it.data!!.data.currentCondition?.get(0)!!.tempC

                    adapter= Weather_statusAdapter(it.data!!.data.weather?.get(0)!!.hourly)
                    binding.companyMarketRecyclerview.adapter=adapter
                    adapter.notifyDataSetChanged()



                    adapter1= Weather_Day_Adapter(it.data!!.data.weather!!)
                    binding.hotSellingRecyclerView.adapter=adapter1
                    adapter1.notifyDataSetChanged()


                }
                Resource.Status.ERROR -> {

                    Log.d("res", it.message.toString())


                }


            }


        })


    }

    private fun buildAlertMessageNoGps() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id ->
                /*  startActivityForResult(
                      Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS), 11
                  )*/

                val myIntent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(myIntent)
                dialog.cancel()
            }
            .setNegativeButton("No") { dialog, id ->
                dialog.cancel()
                // requireActivity().finish()
            }
        val alert: AlertDialog = builder.create()
        alert.show()
    }


    @SuppressLint("MissingPermission")
    protected fun startLocationUpdates() {
        // Create the location request to start receiving updates
        mLocationRequest!!.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        mLocationRequest!!.setInterval(INTERVAL)
        mLocationRequest!!.setFastestInterval(FASTEST_INTERVAL)
        // Create LocationSettingsRequest object using location request
        val builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(mLocationRequest!!)
        val locationSettingsRequest = builder.build()
        val settingsClient = LocationServices.getSettingsClient(requireContext())
        settingsClient.checkLocationSettings(locationSettingsRequest)
        mFusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())
        // new Google API SDK v11 uses getFusedLocationProviderClient(this)
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        mFusedLocationProviderClient!!.requestLocationUpdates(
            mLocationRequest,
            mLocationCallback,
            Looper.myLooper()
        )

    }

    private val mLocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            // do work here
            locationResult.lastLocation
            onLocationChanged(locationResult.lastLocation)

        }
    }

    fun onLocationChanged(location: Location) {
        // New location has now been determined
        mLastLocation = location
        var cityName: String? = null
        var street: String? = null
        val gcd = Geocoder(requireContext(), Locale.getDefault())
        val addresses: List<Address>
        try {
            addresses = gcd.getFromLocation(
                location.latitude,
                location.longitude, 1
            )
            if (addresses.isNotEmpty()) println(addresses[0].locality)

            if (addresses[0].locality != null) street = addresses[0].thoroughfare
            if (addresses[0].locality != null) cityName = addresses[0].locality
            else if (addresses[0].subAdminArea != null) cityName = addresses[0].subAdminArea

            binding.country.text = cityName



            stoplocationUpdates()
        } catch (e: IOException) {
            e.printStackTrace()
        }


    }

    private fun stoplocationUpdates() {
        mFusedLocationProviderClient!!.removeLocationUpdates(mLocationCallback)
    }

    fun checkPermissionForLocation(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (context.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED
            ) {
                true
            } else {
                // Show the permission request
                ActivityCompat.requestPermissions(
                    requireActivity(), arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_PERMISSION_LOCATION
                )
                false
            }
        } else {
            true
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == REQUEST_PERMISSION_LOCATION) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startLocationUpdates()

            } else {
                Toast.makeText(requireContext(), "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setLanguage(currentLanguage: String) {
        prefs.language = currentLanguage

    }

    private fun changeApplicationLanguage(localeName: String) {
        //setLocale(localeName)
        setApplicationLanguage(localeName)

        Toast.makeText(requireContext(), "this local Language:$localeName", Toast.LENGTH_SHORT).show()


    }


}






