package kr.update.outstagram.ui.components.story

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.update.outstagram.data.users
import kr.update.outstagram.model.User
import kr.update.outstagram.ui.components.avatar.AvatarCircle
import kr.update.outstagram.ui.components.avatar.AvatarCircleSize

@Composable
fun StoryUser(
    user: User,
    isMe: Boolean = false
) {
    Column(Modifier.width(IntrinsicSize.Min)) {
        AvatarCircle(size = AvatarCircleSize.NORMAL, user.hasNewStory, isMe = isMe)
        Text(
            user.username,
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 11.dp, horizontal = 6.dp)
        )
    }
}

@Preview
@Composable
fun StoryUserPreview(@PreviewParameter(SampleStoryUserPreview::class) user: User) {
    StoryUser(user = user)
}

class SampleStoryUserPreview() : PreviewParameterProvider<User> {
    override val values: Sequence<User> = users.asSequence()
}