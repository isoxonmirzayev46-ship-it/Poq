package com.i34.guard.core

data class GuardState(
    val isActive: Boolean = false,
    val isLocked: Boolean = false,
    val status: String = "Ready"
)
