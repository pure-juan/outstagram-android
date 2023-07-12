package kr.update.outstagram.ui.components.profile

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.update.outstagram.ui.components.common.avatar.AvatarCircle
import kr.update.outstagram.ui.components.common.avatar.AvatarCircleSize
import kr.update.outstagram.ui.page.boldStyle
import kr.update.outstagram.ui.theme.Typography

@Composable
fun ProfileInfo() {
    Column {
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
        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 6.dp),
            verticalArrangement = Arrangement.spacedBy(3.dp)
        ) {
            Text(
                "username", fontSize = 13.sp, style = Typography.h3,
                lineHeight = 16.sp
            )
            Text(
                "Category/Genre text",
                fontSize = 13.sp,
                color = Color(0x80FFFFFF),
                style = Typography.body1,
                lineHeight = 16.sp
            )
            ProfileBio()
            Text("Link goes here")
        }
    }
}