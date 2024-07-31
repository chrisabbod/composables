package com.chrisabbod.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrisabbod.composable_library.SwipeToDeleteContainer
import com.chrisabbod.composables.ui.theme.ComposablesTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "RememberReturnType")
@Composable
fun MainApp() {
    ComposablesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val programmingLanguages = remember {
                mutableStateListOf(
                    "Kotlin",
                    "Java",
                    "C++",
                    "C#",
                    "C",
                    "Python",
                    "Rust",
                    "Golang",
                    "Swift",
                    "Dart",
                    "Matlab"
                )
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(
                    items = programmingLanguages,
                    key = { it }
                ) { language ->
                    SwipeToDeleteContainer(
                        item = language,
                        onDelete = {
                            programmingLanguages.remove(language)
                        }
                    ) {
                        Text(
                            text = language,
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(MaterialTheme.colorScheme.background)
                                .padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainAppPreview() {
    MainApp()
}