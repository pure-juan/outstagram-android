package kr.update.outstagram.ui.components.common.avatar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import kr.update.outstagram.R

enum class AvatarCircleSize(size: String) {
    SMALL("small"),
    NORMAL("normal"),
    BIG("big")
}

@Composable
fun AvatarCircle(size: AvatarCircleSize, hasNewStory: Boolean, isMe: Boolean = false) {
    val sizeModifier = if (AvatarCircleSize.SMALL == size) {
        Modifier.size(36.dp)
    } else if (AvatarCircleSize.BIG == size) {
        Modifier.size(90.dp)
    } else {
        Modifier.size(72.dp)
    }
    val paddingModifier = if (AvatarCircleSize.SMALL == size) {
        Modifier.padding(4.dp)
    } else if (AvatarCircleSize.BIG == size) {
        Modifier.padding(5.dp)
    } else {
        Modifier.padding(5.dp)
    }
    val ringModifier = if (AvatarCircleSize.SMALL == size) {
        Modifier.padding(2.dp)
    } else if (AvatarCircleSize.BIG == size) {
        Modifier.padding(5.dp)
    } else {
        Modifier.padding(3.dp)
    }

    val storyRing = if (hasNewStory) {
        Modifier.border(
            width = 2.dp,
            brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFFD300C4), Color(0xFFFE393C), Color(0xFFFED203)
                ),
                start = Offset(Float.POSITIVE_INFINITY, 0f),
                end = Offset(0f, Float.POSITIVE_INFINITY)
            ),
            shape = CircleShape
        )
    } else {
        Modifier
    }

    Box(
        Modifier
            .width(IntrinsicSize.Min)
            .height(IntrinsicSize.Min)
            .padding(5.dp)
    ) {
        Box(
            Modifier
                .then(sizeModifier)
                .then(storyRing)
                .then(paddingModifier)
                .clip(CircleShape)
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_profile_image),
                contentDescription = "Profile image",
                modifier = Modifier
                    .then(sizeModifier)
                    .fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }
        if (isMe) {
            Surface(
                Modifier
                    .align(Alignment.BottomEnd)
                    .then(ringModifier)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.background)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "Add Story",
                    modifier = Modifier
                        .then(ringModifier)
                        .size(20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AvatarCirclePreview(
    @PreviewParameter(SampleAvatarCircleProvider::class) sizes: AvatarCircleSize
) {
    AvatarCircle(size = sizes, hasNewStory = true, isMe = true)
}

class SampleAvatarCircleProvider : PreviewParameterProvider<AvatarCircleSize> {
    override val values: Sequence<AvatarCircleSize> = sequenceOf(
        AvatarCircleSize.SMALL,
        AvatarCircleSize.NORMAL,
        AvatarCircleSize.BIG
    )
}