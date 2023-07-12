package kr.update.outstagram.ui.template

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kr.update.outstagram.ui.components.common.NavBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NavTemplate(
    onHomeSelected: () -> Unit,
    onSearchSelected: () -> Unit,
    onAddSelected: () -> Unit,
    onReelsSelected: () -> Unit,
    onProfileSelected: () -> Unit,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(Modifier.weight(1f)) {
            content()
        }
        NavBar(
            onHomeSelected,
            onSearchSelected,
            onAddSelected,
            onReelsSelected,
            onProfileSelected
        )
    }
}