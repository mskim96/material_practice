package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeItemBinding
import jp.co.momogo.model.Restaurant

/**
 * [RestaurantHorizontalAdapter] is Adapter for inside horizontal items.
 *
 * Navigate to `DetailFragment` with [Restaurant]'s id if user item clicked,.
 */
class RestaurantHorizontalAdapter(
    private val restaurants: List<Restaurant>,
    private val listener: RestaurantListener
) : RecyclerView.Adapter<HorizontalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) =
        holder.bind(restaurants[position])

    override fun getItemCount() = restaurants.size
}

class HorizontalViewHolder(
    private val binding: HomeItemBinding,
    private val listenerEvent: RestaurantListener
) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Restaurant) {
        binding.apply {
            restaurant = item
            listener = listenerEvent
            executePendingBindings()
        }
    }
}

/**
 * Interface for restaurant click listener.
 */
interface RestaurantListener {

    /**
     * When clicked next button in vertical adapter.
     *
     * @param view stub test ui.
     */
    fun moreRestaurantClicked(view: View)

    /**
     * When restaurant clicks.
     *
     * @param view view for use shared elements.
     * @param restaurant restaurant for detail page need to restaurant id.
     */
    fun onRestaurantClicked(view: View, restaurantId: Int)

    /**
     * **`[Note: Just test ui]`**
     *
     * When restaurant long pressed.
     * Display bottom sheet or dialogs, if restaurant item pressed long.
     */
    fun onRestaurantLongPressed(restaurant: Restaurant): Boolean
}
