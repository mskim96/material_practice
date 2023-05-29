package jp.co.momogo.legacy

import android.os.Parcelable
import androidx.annotation.CallSuper
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import java.lang.ref.WeakReference

/**
 * [NestedRecyclerViewStateRecoverAdapter] for save position to nested item.
 */
abstract class NestedRecyclerViewStateRecoverAdapter<T, VH : RecyclerView.ViewHolder>(
    diffUtil: DiffUtil.ItemCallback<T>
) : ListAdapter<T, VH>(diffUtil) {

    private val layoutManagerStates = hashMapOf<String, Parcelable?>()
    private val visibleScrollableViews = hashMapOf<Int, ViewHolderRef>()

    @CallSuper
    override fun onViewRecycled(holder: VH) {
        if (holder is NestedRecyclerViewViewHolder) {
            // Save the scroll position state
            val state = holder.getLayoutManager()?.onSaveInstanceState()
            layoutManagerStates[holder.getId()] = state

            visibleScrollableViews.remove(holder.hashCode())
        }
        super.onViewRecycled(holder)
    }

    @CallSuper
    override fun onBindViewHolder(holder: VH, position: Int) {
        if (holder is NestedRecyclerViewViewHolder) {
            holder.getLayoutManager()?.let {
                // Retrieve and set the saved LayoutManager state.
                val state: Parcelable? = layoutManagerStates[holder.getId()]
                if (state != null) {
                    it.onRestoreInstanceState(state)
                } else {
                    // Reset the scroll position when no state needs to be restored.
                    it.scrollToPosition(0)
                }
            }
            visibleScrollableViews[holder.hashCode()] = ViewHolderRef(
                holder.getId(),
                WeakReference(holder as NestedRecyclerViewViewHolder)
            )
        }
    }

    @CallSuper
    override fun submitList(list: List<T>?) {
        // Need to save the state from visible views before updating/setting the list to preserve
        // their states
        saveState()
        super.submitList(list)
    }

    private fun saveState() {
        visibleScrollableViews.values.forEach { item ->
            item.reference.get()?.let {
                layoutManagerStates[item.id] = it.getLayoutManager()?.onSaveInstanceState()
            }
        }
        visibleScrollableViews.clear()
    }

    fun clearState() {
        layoutManagerStates.clear()
        visibleScrollableViews.clear()
    }

    private data class ViewHolderRef(
        val id: String,
        val reference: WeakReference<NestedRecyclerViewViewHolder>
    )
}

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