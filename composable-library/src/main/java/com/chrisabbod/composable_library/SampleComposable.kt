package com.chrisabbod.composable_library

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SampleComposable(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Text("Sample Composable has been called!")
    }
}