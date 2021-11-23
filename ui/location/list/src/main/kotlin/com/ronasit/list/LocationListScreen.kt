package com.ronasit.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ronasit.core.ui.theme.RickAndMortyTheme

@Composable
fun LocationListScreen() {
    RickAndMortyTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Text(
                text = "Location List Screen"
            )
        }
    }
}
