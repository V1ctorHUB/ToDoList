package com.vama.todolist.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.vama.todolist.ui.components.UpdateToDoComponent

@Composable
fun UpdateScreen(){
    Column {
        UpdateToDoComponent(modifier = Modifier.fillMaxWidth(), context = LocalContext.current, index = 2)
    }
}

@Preview
@Composable
private fun UpdateScreenPreview(){
    UpdateScreen()
}