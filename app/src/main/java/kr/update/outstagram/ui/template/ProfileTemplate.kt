package kr.update.outstagram.ui.template

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kr.update.outstagram.ui.components.common.TopBar
import kr.update.outstagram.ui.components.common.icons.BackCaretIcon
import kr.update.outstagram.ui.components.common.icons.MoreIcon
import kr.update.outstagram.ui.components.common.icons.NotificationIcon
import kr.update.outstagram.ui.components.common.icons.VerifiedLabelIcon
import kr.update.outstagram.ui.theme.Typography

@Composable
fun ProfileTemplate(content: @Composable () -> Unit) {
    Column {
        TopBar {
            Box(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Row(Modifier.align(Alignment.CenterStart)) {
                    BackCaretIcon()
                }

                Row(
                    Modifier.align(Alignment.Center),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "username",
                        style = Typography.h3
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    VerifiedLabelIcon(Modifier.size(16.dp))
                }

                Row(Modifier.align(Alignment.CenterEnd)) {
                    NotificationIcon()
                    Spacer(modifier = Modifier.width(24.dp))
                    MoreIcon()
                }
            }
        }
        content()
    }
}