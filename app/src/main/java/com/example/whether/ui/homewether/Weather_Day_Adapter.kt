package com.example.whether.ui.homewether

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.whether.core.base.BaseAdapter
import com.example.whether.core.base.BaseBindingViewHolder
import com.example.whether.databinding.RowWetherDayBinding
import com.example.whether.databinding.RowWheatherStatusBinding
import com.example.whether.medule.WeatherItem


class Weather_Day_Adapter(
    marketCategories: MutableList<WeatherItem>?


    ) :
    BaseAdapter<WeatherItem, Weather_Day_Adapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowWetherDayBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowWetherDayBinding
    ) : BaseBindingViewHolder<WeatherItem>(binding) {
        override fun bind(position: Int, item: WeatherItem?) {
            bind<RowWetherDayBinding> {
                model = item
                space=" "
                setImageUrl(binding.img, item!!.hourly?.get(0)!!.weatherIconUrl?.get(0)!!.value)

            }



        }
    }

    @BindingAdapter("imageUrl")
    fun setImageUrl(imgView: ImageView, imgUrl: String?) {
        imgUrl?.let {
            val imgUri = it.toUri().buildUpon().scheme("http").build()
            Glide.with(imgView.context)
                .load(imgUri)
                .into(imgView)

        }

    }


}