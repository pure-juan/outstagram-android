package kr.update.outstagram.ui.components.home.post

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.update.outstagram.ui.components.common.icons.CommentIcon
import kr.update.outstagram.ui.components.common.icons.LikeIcon
import kr.update.outstagram.ui.components.common.icons.ShareIcon

@Composable
fun PostInfo() {
    Column(
        Modifier
            .fillMaxWidth()
            .height(215.dp)
    ) {
        PostInfoAction()
        PostInfoContent()
    }
}

@Composable
fun PostInfoAction() {
    Row {
        Row(
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            LikeIcon()
            CommentIcon()
            ShareIcon()
        }
    }
}

@Composable
fun PostInfoContent() {
    Column(
        modifier = Modifier.padding(horizontal = 12.dp)
    ) {
        Text("100 Likes", fontWeight = FontWeight.ExtraBold)
        Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.End) {
            // !TODO: Fix UI
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            fontWeight = FontWeight.SemiBold
                        )
                    ) {
                        append("Username")
                    }
                    append(" ")
                    append("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt")
                },
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f),
            )
            Text(" ")
            Text("more", color = Color(0xFF6E6E6E))
        }
        Text("View all 16 comments", color = Color(0xFF6E6E6E), fontSize = 14.sp)
//            Text("Username", fontWeight = FontWeight.SemiBold)
//            Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt...")
    }
}