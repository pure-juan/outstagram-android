package kr.update.outstagram.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kr.update.outstagram.ui.components.avatar.AvatarCircle
import kr.update.outstagram.ui.components.avatar.AvatarCircleSize
import kr.update.outstagram.ui.template.ProfileTemplate

val boldStyle = TextStyle(
    fontWeight = FontWeight.Bold
)

@Composable
fun ProfilePage() {
    ProfileTemplate {
        Row(
            Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
                .padding(horizontal = 12.dp)
        ) {
            AvatarCircle(size = AvatarCircleSize.BIG, hasNewStory = true)
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                    // Posts
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(1.dp)
                    ) {
                        Text("1,234", style = boldStyle)
                        Text("Posts")
                    }
                    // Followers
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(1.dp)
                    ) {
                        Text("5,678", style = boldStyle)
                        Text("Followers")
                    }
                    // Following
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(1.dp)
                    ) {
                        Text("9,101", style = boldStyle)
                        Text("Following")
                    }
                }
            }
        }
    }
}