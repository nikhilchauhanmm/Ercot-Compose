package com.example.ercotenergysaver.compose

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TopAppBarLayout() {
  TopAppBar(
    title = { Text(text = "ercot") },
    actions = {
      IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Settings, contentDescription = "Settings Icon")
      }
    }
  )
}