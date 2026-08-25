package com.i34.guard

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.i34.guard.ui.GuardScreen

@Composable
fun I34GuardApp() {
    MaterialTheme {
        Surface {
            GuardScreen()
        }
    }
}
