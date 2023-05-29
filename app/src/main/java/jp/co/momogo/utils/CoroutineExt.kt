package jp.co.momogo.utils

import androidx.lifecycle.Lifecycle.State
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Collect latest from stateflow with lifecycle.
 *
 * @param owner Lifecycle owners
 * @param minActiveState Lifecycle state
 * @param action action of collectLatest
 */
inline fun <T> StateFlow<T>.lifecycleWithCollectIn(
    owner: LifecycleOwner,
    minActiveState: State = State.STARTED,
    crossinline action: suspend CoroutineScope.(T) -> Unit
) = owner.lifecycleScope.launch {
    owner.repeatOnLifecycle(minActiveState) {
        collectLatest {
            action(it)
        }
    }
}