package com.i34.guard.core

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GuardViewModel : ViewModel() {

    private val _state = MutableStateFlow(GuardState())
    val state: StateFlow<GuardState> = _state.asStateFlow()

    fun activate() {
        _state.value = _state.value.copy(
            isActive = true,
            status = "Active"
        )
    }

    fun deactivate() {
        _state.value = _state.value.copy(
            isActive = false,
            status = "Inactive"
        )
    }

    fun lock() {
        _state.value = _state.value.copy(
            isLocked = true,
            status = "Locked"
        )
    }

    fun unlock() {
        _state.value = _state.value.copy(
            isLocked = false,
            status = "Active"
        )
    }
}
