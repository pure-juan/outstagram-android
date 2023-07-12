package kr.update.outstagram.ui.components.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kr.update.outstagram.ui.components.common.icons.AddIcon
import kr.update.outstagram.ui.components.common.icons.HomeIcon
import kr.update.outstagram.ui.components.common.icons.ProfileIcon
import kr.update.outstagram.ui.components.common.icons.ReelsIcon
import kr.update.outstagram.ui.components.common.icons.SearchIcon

@Composable
fun NavBar(
    onHomeSelected: () -> Unit,
    onSearchSelected: () -> Unit,
    onAddSelected: () -> Unit,
    onReelsSelected: () -> Unit,
    onProfileSelected: () -> Unit,
) {
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Divider(
            Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(Color(0xFF, 0xFF, 0xFF, 0x1A))
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .weight(1f, false),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            HomeIcon(Modifier.clickable(onClick = onHomeSelected))
            SearchIcon(Modifier.clickable(onClick = onSearchSelected))
            AddIcon(Modifier.clickable(onClick = onAddSelected))
            ReelsIcon(Modifier.clickable(onClick = onReelsSelected))
            ProfileIcon(Modifier.clickable(onClick = onProfileSelected))
        }
    }
}