package jp.co.momogo.detail

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Viewpager2 adapter for menu and review fragment inside detail page.
 */
class MenuReviewAdapter(fragments: Fragment) : FragmentStateAdapter(fragments) {

    var fragments: ArrayList<Fragment> = ArrayList()

    override fun getItemCount() =
        fragments.size

    override fun createFragment(position: Int) =
        fragments[position]

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
        notifyItemInserted(fragments.size - 1)
    }

    fun removeFragment() {
        fragments.removeLast()
        notifyItemRemoved(fragments.size)
    }
}