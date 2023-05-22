package jp.co.momogo.utils

import androidx.recyclerview.widget.RecyclerView

/**
 * [NestedRecyclerViewViewHolder] for save position to nested items.
 *
 * - [getId] get item id
 * - [getLayoutManager] get item layoutManager
 */
interface NestedRecyclerViewViewHolder {
    fun getId(): String
    fun getLayoutManager(): RecyclerView.LayoutManager?
}