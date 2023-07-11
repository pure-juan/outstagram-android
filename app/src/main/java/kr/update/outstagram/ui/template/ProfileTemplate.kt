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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kr.update.outstagram.ui.components.TopBar
import kr.update.outstagram.ui.components.icons.BackCaretIcon
import kr.update.outstagram.ui.components.icons.MoreIcon
import kr.update.outstagram.ui.components.icons.NotificationIcon
import kr.update.outstagram.ui.components.icons.VerifiedLabelIcon

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
                        "username", style = TextStyle(
                            fontWeight = FontWeight.Bold
                        )
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