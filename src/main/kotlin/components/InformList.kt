package components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.Collector

@Composable
fun InformList(
    infrmations:List<Collector>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier) {
        items(infrmations){
            inform ->
            InformItem(itemText = inform)
            Spacer(Modifier.height(10.dp))
        }
    }

}