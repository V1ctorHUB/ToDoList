package com.vama.todolist.Model

class ToDoClass(
    private var topic: String,
    private var toDo: String
) {
    fun GetTopic():String{
        return topic
    }

    fun GetToDo():String{
        return toDo
    }
}