package com.vama.todolist.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.vama.todolist.ui.components.SetDataComponent

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SetDataComponent(modifier = Modifier.weight(0.5f), LocalContext.current)
    }
}

@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}