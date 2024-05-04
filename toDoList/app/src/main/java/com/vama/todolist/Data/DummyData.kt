package com.vama.todolist.Data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.vama.todolist.Model.ToDoClass

val toDo_List: MutableState<MutableList<ToDoClass>> = mutableStateOf(mutableListOf())