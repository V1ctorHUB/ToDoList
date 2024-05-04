package com.vama.todolist.viewModel

import androidx.compose.runtime.mutableStateListOf
import com.vama.todolist.Data.toDo_List
import com.vama.todolist.Model.ToDoClass
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ViewModelToDo: ViewModel() {

    private val _toDoList = mutableStateListOf<ToDoClass>()
    val toDoList: List<ToDoClass> get() = _toDoList

    fun setData(myToDoList: ToDoClass) {
        viewModelScope.launch {
            toDo_List.value.add(myToDoList)
        }
    }

    fun getData(): MutableList<ToDoClass> {
        return toDo_List.value
    }

    fun updateData(index: Int, newToDoItem: ToDoClass) {
        if (index >= 0 && index < _toDoList.size) {
            _toDoList[index] = newToDoItem
        }
    }
}

