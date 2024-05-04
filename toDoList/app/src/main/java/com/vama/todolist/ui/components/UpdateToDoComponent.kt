package com.vama.todolist.ui.components

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vama.todolist.MainActivity
import com.vama.todolist.Model.ToDoClass
import com.vama.todolist.viewModel.ViewModelToDo

@Composable
fun UpdateToDoComponent(modifier: Modifier, context: Context) {

    var index: Int = 0
    val toDoData: MutableState<MutableList<ToDoClass>> =
        remember { mutableStateOf(mutableListOf()) }

    val viewModel = ViewModelToDo()
    Column(
        modifier = modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val textFieldTitulo: MutableState<String> = remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp),
            value = textFieldTitulo.value,
            onValueChange = {
                textFieldTitulo.value = it
            },
            maxLines = 1,
            minLines = 1,
            singleLine = true,
            label = { Text("Ingrese el titulo de la tarea pendiente") },
            placeholder = { Text("Hacer...") },
            supportingText = { Text("Por favor, ingrese un titulo a su tarea.") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Create,
                    contentDescription = "Icono de listas"
                )
            },
            isError = false,
            keyboardActions = KeyboardActions(
                onNext = {},
                onDone = {},
                onGo = {},
                onPrevious = {},
                onSearch = {},
                onSend = {}
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            readOnly = false
        )

        val textFieldTarea: MutableState<String> = remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 20.dp, end = 20.dp, bottom = 18.dp),
            value = textFieldTarea.value,
            onValueChange = {
                textFieldTarea.value = it
            },
            maxLines = 1,
            minLines = 1,
            singleLine = true,
            label = { Text("Ingrese la tarea pendiente") },
            placeholder = { Text("Falta hacer...") },
            supportingText = { Text("Por favor, ingrese una descripcion de su tarea.") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Icono de listas"
                )
            },
            isError = false,
            keyboardActions = KeyboardActions(
                onNext = {},
                onDone = {},
                onGo = {},
                onPrevious = {},
                onSearch = {},
                onSend = {}
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            readOnly = false
        )
        Button(modifier = Modifier.padding(bottom = 5.dp), onClick = {
            if (textFieldTitulo.value.isNotBlank() && textFieldTarea.value.isNotBlank()) {
                val updatedItem = ToDoClass(textFieldTitulo.value, textFieldTarea.value)
                viewModel.updateData(index, updatedItem)
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
                (context as Activity)
            }
        }) {
            Text(text = "Modificar tareas de la lista")
        }
    }
}

@Preview
@Composable
private fun ToDoComponent() {
    UpdateToDoComponent(modifier = Modifier, LocalContext.current)
}