package components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun InputInformation(
    inputValue:String,
    modifier: Modifier = Modifier,
    onTextChanged:(textTask:String)->Unit,
    onAddClick:()->Unit
){
    Row (modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        OutlinedTextField(
            modifier = Modifier.onKeyEvent {
                if(it.key == Key.Enter){
                    onAddClick()
                }
                true
            },
            value = inputValue,
            onValueChange = onTextChanged,
            label = {Text("Информация")},

        )
        Spacer(Modifier.width(10.dp))
        Button(onClick = {
            onAddClick()
        }){
            Text("Save")
        }
    }
}