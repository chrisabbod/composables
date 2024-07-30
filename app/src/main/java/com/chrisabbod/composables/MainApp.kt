package com.chrisabbod.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chrisabbod.composables.ui.theme.ComposablesTheme

@Composable
fun MainApp() {
    ComposablesTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Text(modifier = Modifier.padding(innerPadding),
                text = "Hello, World!")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainAppPreview() {
    MainApp()
}