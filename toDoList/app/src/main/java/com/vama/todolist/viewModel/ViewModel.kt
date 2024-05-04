package com.vama.todolist.viewModel

import com.vama.todolist.Data.toDoList
import com.vama.todolist.Model.ToDoClass
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ViewModelToDo: ViewModel() {

    fun setData(myToDoList: ToDoClass) {
        viewModelScope.launch {
            toDoList.value.add(myToDoList)
        }
    }

    fun getData(): MutableList<ToDoClass> {
        return toDoList.value
    }
}