package kr.update.outstagram.ui.components.common.icons

import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kr.update.outstagram.R

@Composable
fun LogoTypographyIcon() {
    Icon(
        modifier = Modifier.height(30.dp),
        painter = painterResource(id = R.drawable.logo_typography),
        contentDescription = null
    )
}