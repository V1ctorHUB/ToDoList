package com.vama.todolist.Model

class ToDoClass(
    private var topic: String,
    private var toDo: String
) {
    // Getter para `topic`
    fun getTopic(): String {
        return topic
    }

    // Setter para `topic`
    fun setTopic(newTopic: String) {
        topic = newTopic
    }

    // Getter para `toDo`
    fun getToDo(): String {
        return toDo
    }

    // Setter para `toDo`
    fun setToDo(newToDo: String) {
        toDo = newToDo
    }
}
