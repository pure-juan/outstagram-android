package kr.update.outstagram.ui.components

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(
    content: @Composable () -> Unit
) {
    Row(
        modifier = Modifier
            .height(IntrinsicSize.Min)
            .padding(15.dp),
        verticalAlignment = Alignment.Top,
        content = { content() }
    )
}