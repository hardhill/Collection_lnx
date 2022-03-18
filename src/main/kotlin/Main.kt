// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import components.InformList
import components.InputInformation
import data.Collector
import java.util.UUID


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Collection", resizable = true
    ) {
        App()
    }
}

@Composable
@Preview
fun App() {

    val informationText = remember { mutableStateOf("") }
    val informList = remember { mutableStateListOf<Collector>() }
    MaterialTheme {
        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 5.dp)) {
            InputInformation(

                inputValue = informationText.value,
                onTextChanged = {informationText.value = it},
                onAddClick = {
                    informList.add(Collector(id = UUID.randomUUID().toString(), info = informationText.value))
                    informationText.value = ""
                }
            )
            Spacer(Modifier.height(16.dp))
            // сортировка по полю info
            InformList(infrmations = informList.sortedBy { it.info },)

        }
    }
}

fun saveData() {

}


