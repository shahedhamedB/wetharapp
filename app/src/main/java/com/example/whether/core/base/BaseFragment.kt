package com.example.whether.core.base

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.whether.core.validator.onBackPressedAction
import com.example.whether.utils.Prefs

import java.util.*
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var prefs: Prefs

    fun setLocale(localeName: String) {
        val locale = Locale(localeName)
        Locale.setDefault(locale)
        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.locale = locale
        res.updateConfiguration(conf, dm)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBackPressedAction {
            findNavController().popBackStack()
        }

    }
    fun setApplicationLanguage(newLanguage: String) {
        val activityRes: Resources = resources
        val activityConf: Configuration = activityRes.configuration
        val newLocale = Locale(newLanguage)
        activityConf.setLocale(newLocale)
        activityRes.updateConfiguration(activityConf, activityRes.displayMetrics)
        val applicationRes = requireContext().resources
        //  val applicationRes: Resources = FacebookSdk.getApplicationContext().resources
        val applicationConf: Configuration = applicationRes.configuration
        applicationConf.setLocale(newLocale)
        applicationRes.updateConfiguration(
            applicationConf,
            applicationRes.displayMetrics
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }



}