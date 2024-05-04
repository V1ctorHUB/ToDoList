package com.vama.todolist.ui.components

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vama.todolist.Data.toDoList
import com.vama.todolist.Model.ToDoClass
import com.vama.todolist.viewModel.ViewModelToDo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@Composable
fun UpdateToDoComponent(modifier: Modifier, context:Context, index:  Int){

    Column(
        modifier = modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val ToDoList: MutableState<MutableList<ToDoClass>> = remember { mutableStateOf(mutableListOf()) }
        val viewmodel = ViewModelToDo()
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
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                disabledTextColor = Color.Black,
                errorTextColor = Color.Black,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.Black,
                errorContainerColor = Color.Red,
                cursorColor = Color.Black,
                errorCursorColor = Color.Black,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.Black,
                disabledIndicatorColor = Color.Black,
                errorIndicatorColor = Color.Black,
                focusedLeadingIconColor = Color.Black,
                unfocusedLeadingIconColor = Color.Black,
                disabledLeadingIconColor = Color.Black,
                errorLeadingIconColor = Color.Black,
                focusedTrailingIconColor = Color.Black,
                unfocusedTrailingIconColor = Color.Black,
                disabledTrailingIconColor = Color.Black,
                errorTrailingIconColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                disabledLabelColor = Color.Black,
                errorLabelColor = Color.Black,
                focusedPlaceholderColor = Color.Black,
                unfocusedPlaceholderColor = Color.Black,
                disabledPlaceholderColor = Color.Black,
                errorPlaceholderColor = Color.Black,
                focusedSupportingTextColor = Color.Black,
                unfocusedSupportingTextColor = Color.White,
                disabledSupportingTextColor = Color.Black,
                errorSupportingTextColor = Color.Black,
                focusedPrefixColor = Color.Black,
                unfocusedPrefixColor = Color.White,
                disabledPrefixColor = Color.Black,
                errorPrefixColor = Color.Black,
                focusedSuffixColor = Color.Black,
                unfocusedSuffixColor = Color.White,
                disabledSuffixColor = Color.Black,
                errorSuffixColor = Color.Black
            ),
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
            maxLines = 2,
            minLines = 1,
            singleLine = false,
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                disabledTextColor = Color.Black,
                errorTextColor = Color.Black,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.Black,
                errorContainerColor = Color.Red,
                cursorColor = Color.Black,
                errorCursorColor = Color.Black,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.Black,
                disabledIndicatorColor = Color.Black,
                errorIndicatorColor = Color.Black,
                focusedLeadingIconColor = Color.Black,
                unfocusedLeadingIconColor = Color.Black,
                disabledLeadingIconColor = Color.Black,
                errorLeadingIconColor = Color.Black,
                focusedTrailingIconColor = Color.Black,
                unfocusedTrailingIconColor = Color.Black,
                disabledTrailingIconColor = Color.Black,
                errorTrailingIconColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                disabledLabelColor = Color.Black,
                errorLabelColor = Color.Black,
                focusedPlaceholderColor = Color.Black,
                unfocusedPlaceholderColor = Color.Black,
                disabledPlaceholderColor = Color.Black,
                errorPlaceholderColor = Color.Black,
                focusedSupportingTextColor = Color.Black,
                unfocusedSupportingTextColor = Color.White,
                disabledSupportingTextColor = Color.Black,
                errorSupportingTextColor = Color.Black,
                focusedPrefixColor = Color.Black,
                unfocusedPrefixColor = Color.White,
                disabledPrefixColor = Color.Black,
                errorPrefixColor = Color.Black,
                focusedSuffixColor = Color.Black,
                unfocusedSuffixColor = Color.White,
                disabledSuffixColor = Color.Black,
                errorSuffixColor = Color.Black
            ),
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
        val toDoData: MutableState<MutableList<ToDoClass>> = remember { mutableStateOf(mutableListOf()) }
        val viewModel = ViewModelToDo()
        Button(modifier = Modifier.padding(bottom = 5.dp), onClick = {
            if (textFieldTitulo.value != "" && textFieldTarea.value != ""){
                val myToDoList = ToDoClass(textFieldTitulo.value, textFieldTarea.value)

                viewModel.setData(myToDoList)
                textFieldTitulo.value = ""
                textFieldTarea.value = ""

                GlobalScope.launch(Dispatchers.IO) {
                    toDoData.value = viewModel.getData()
                    Thread.sleep(2000)
                }
            }
        }) {
            Text(text = "Modificar tareas de la lista")
        }
    }
}
