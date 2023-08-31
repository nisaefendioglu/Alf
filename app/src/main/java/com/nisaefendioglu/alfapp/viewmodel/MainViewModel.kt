package com.nisaefendioglu.alfapp.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nisaefendioglu.alfapp.data.Alf
import com.nisaefendioglu.alfapp.data.AlfApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val api: AlfApi
) : ViewModel() {

    private val _state = mutableStateOf(AlfState())
    val state: State<AlfState> = _state

    init {
        getRandomAlf()
    }

    fun getRandomAlf() {
        viewModelScope.launch {
            try {
                _state.value = state.value.copy(isLoading = true)
                _state.value = state.value.copy(
                    alf = api.getRandomAlf(),
                    isLoading = false
                )
            } catch (e: Exception) {
                Log.e("MainViewModel", "getRandomAlf: ", e)
                _state.value = state.value.copy(isLoading = false)
            }
        }
    }

    data class AlfState(
        val alf: Alf? = null,
        val isLoading: Boolean = false
    )
}