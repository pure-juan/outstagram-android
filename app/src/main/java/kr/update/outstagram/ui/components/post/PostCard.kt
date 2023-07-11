package kr.update.outstagram.ui.components.post

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

//@Preview
@Composable
fun PostCard(
    content: @Composable () -> Unit
) {
    Column {
        PostUserHead(true)
        PostImageViewer()
        PostInfo()
    }
}