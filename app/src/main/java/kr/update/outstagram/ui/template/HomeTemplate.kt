package kr.update.outstagram.ui.template

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kr.update.outstagram.data.users
import kr.update.outstagram.ui.components.TopBar
import kr.update.outstagram.ui.components.icons.CaretDownIcon
import kr.update.outstagram.ui.components.icons.LikeIcon
import kr.update.outstagram.ui.components.icons.LogoTypographyIcon
import kr.update.outstagram.ui.components.icons.ShareIcon
import kr.update.outstagram.ui.components.story.StoryTray

@Composable
fun HomeTemplate(content: @Composable () -> Unit) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxHeight(),
    ) {
        TopBar {
            // Left
            Row {
                LogoTypographyIcon()
                Spacer(Modifier.width(10.dp))
                CaretDownIcon()
            }

            Spacer(Modifier.weight(1f))

            // Right
            Row(
                modifier = Modifier.height(IntrinsicSize.Min)
            ) {
                LikeIcon()
                Spacer(Modifier.width(20.dp))
                ShareIcon()
            }
        }
        Column(
            Modifier
                .weight(1f)
                .verticalScroll(scrollState)
        ) {
            StoryTray(users)
            content()
        }
    }
}