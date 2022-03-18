package components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import data.Collector

@Composable
fun InformItem(
    itemText: Collector,
    modifier: Modifier = Modifier
){
    Row (modifier = modifier.fillMaxWidth()
        .border(2.dp, color = MaterialTheme.colors.primary, RoundedCornerShape(15.dp))
        .padding(16.dp)
        ){
        Text(text = itemText.info, modifier= Modifier.align(Alignment.CenterVertically),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
            )
    }
}