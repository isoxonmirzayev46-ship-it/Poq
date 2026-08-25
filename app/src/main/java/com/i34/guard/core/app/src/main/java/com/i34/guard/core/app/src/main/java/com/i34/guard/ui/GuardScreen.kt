package com.i34.guard.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.i34.guard.core.GuardViewModel

@Composable
fun GuardScreen(
    viewModel: GuardViewModel = viewModel()
) {
    val state by viewModel.state.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "I34² Guard")
        Text(text = "Status: ${state.status}")

        Button(
            onClick = {
                if (state.isActive) {
                    viewModel.deactivate()
                } else {
                    viewModel.activate()
                }
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = if (state.isActive) {
                    "Deactivate"
                } else {
                    "Activate"
                }
            )
        }
    }
}
