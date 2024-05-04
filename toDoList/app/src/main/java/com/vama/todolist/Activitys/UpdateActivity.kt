package com.vama.todolist.Activitys

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vama.todolist.ui.screens.UpdateScreen

class UpdateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UpdateScreen(intent.getIntExtra("index",0))
        }
    }
}

