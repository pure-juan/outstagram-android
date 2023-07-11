package kr.update.outstagram.ui.components.story

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kr.update.outstagram.data.me
import kr.update.outstagram.model.User

@Composable
fun StoryTray(users: List<User>) {
    val scrollState = rememberLazyListState()

    Column(Modifier.shadow(elevation = 1.dp, ambientColor = Color(0x01000000))) {
        LazyRow(
            Modifier
                .padding(6.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            state = scrollState
        ) {
            item {
                StoryUser(user = me, isMe = true)
            }
            items(items = users) { user ->
                StoryUser(user, isMe = false)
            }
        }
        Divider(
            Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(Color(0xFF, 0xFF, 0xFF, 0x1A))
        )
    }
}