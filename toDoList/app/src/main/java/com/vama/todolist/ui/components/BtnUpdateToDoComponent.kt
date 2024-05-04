package com.vama.todolist.ui.components

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.vama.todolist.Activitys.UpdateActivity

@Composable
fun UpdateToDoComponent(context:Context){
    Column(modifier = Modifier.fillMaxWidth()) {
        Button(onClick = {
            val intent = Intent(context, UpdateActivity::class.java)
            intent.putExtra("indexItem", 0)
            context.startActivity(intent)
            (context as Activity)
        }) {
            Text(text = "Modificar tarea.")
        }
    }
}

@Preview
@Composable
private fun GetDataComponentPreview(){
    UpdateToDoComponent(LocalContext.current)
}