package kr.update.outstagram.ui.components.post

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.update.outstagram.ui.components.avatar.AvatarCircle
import kr.update.outstagram.ui.components.avatar.AvatarCircleSize
import kr.update.outstagram.ui.components.icons.MoreIcon
import kr.update.outstagram.ui.components.icons.VerifiedLabelIcon
import kr.update.outstagram.ui.theme.OutstagramTheme

@Composable
fun PostUserInfo(verified: Boolean) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        AvatarCircle(AvatarCircleSize.SMALL, hasNewStory = true, isMe = false)
        Spacer(Modifier.width(8.dp))
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "Juan Kim",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                if (verified) {
                    Spacer(Modifier.width(3.dp))
                    VerifiedLabelIcon(Modifier.size(12.dp))
                }
            }
            Text("Sponsored", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PostUserInfoPreview(@PreviewParameter(SamplePostUserHeadProvider::class) verified: Boolean) {
    OutstagramTheme {
        Surface {
            PostUserInfo(verified)
        }
    }
}

@Composable
fun PostUserHead(verified: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .padding(horizontal = 13.dp, vertical = 7.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        PostUserInfo(verified)
        Spacer(Modifier.weight(1f))
        MoreIcon()
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PostUserHeadPreview(@PreviewParameter(SamplePostUserHeadProvider::class) verified: Boolean) {
    OutstagramTheme {
        Surface {
            PostUserHead(verified)
        }
    }
}

class SamplePostUserHeadProvider : PreviewParameterProvider<Boolean> {
    override val values: Sequence<Boolean> = sequenceOf(
        true,
        false
    )
}