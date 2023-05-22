package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.BannerItemBinding
import jp.co.momogo.model.Banner

class BannerAdapter(private val bannerList: List<Banner>, val listener: RestaurantListener) :
    RecyclerView.Adapter<BannerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(
            BannerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount() = bannerList.size

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(bannerList[position], listener)
    }
}

class BannerViewHolder(private val binding: BannerItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Banner, listener: RestaurantListener) {
        binding.apply {
            banner = item
            restaurantListener = listener
        }
    }
}