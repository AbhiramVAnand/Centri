package com.abhiram.common

import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.*
import com.abhiram.common.AppWrite.AppwriteRepository
import kotlinx.coroutines.launch

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()
    val coroutineScope = rememberCoroutineScope()
    val appwrite = AppwriteRepository()
    Button(onClick = {
        text = "Hello, ${platformName}"
        coroutineScope.launch {
            appwrite.signIn("username@gmail.com")
            appwrite.get()
        }
    }) {
        Text(text)
    }
}
