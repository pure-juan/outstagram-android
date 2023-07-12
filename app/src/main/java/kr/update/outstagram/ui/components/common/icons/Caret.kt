package kr.update.outstagram.ui.components.common.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CaretDownIcon(modifier: Modifier? = Modifier) {
    val icon = Icons.Default.ExpandMore

    Icon(
        modifier = modifier ?: Modifier,
        imageVector = icon,
        contentDescription = "More"
    )
}