package com.example.whether.ui.homewether

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.whether.core.base.BaseAdapter
import com.example.whether.core.base.BaseBindingViewHolder
import com.example.whether.databinding.RowWheatherStatusBinding
import com.example.whether.medule.HourlyItem


class Weather_statusAdapter(
    marketCategories: MutableList<HourlyItem>?


    ) :
    BaseAdapter<HourlyItem, Weather_statusAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowWheatherStatusBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowWheatherStatusBinding
    ) : BaseBindingViewHolder<HourlyItem>(binding) {
        override fun bind(position: Int, item: HourlyItem?) {
            bind<RowWheatherStatusBinding> {
                model = item
                setImageUrl(binding.img, item!!.weatherIconUrl?.get(0)!!.value)

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