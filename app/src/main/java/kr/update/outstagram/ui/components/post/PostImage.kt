package kr.update.outstagram.ui.components.post

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun PostImageViewer() {
    Box(
        Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .background(Color.Gray)
    )
}