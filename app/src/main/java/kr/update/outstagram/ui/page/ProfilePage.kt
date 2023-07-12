package kr.update.outstagram.ui.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import kr.update.outstagram.ui.components.profile.ProfileInfo
import kr.update.outstagram.ui.template.ProfileTemplate

val boldStyle = TextStyle(
    fontWeight = FontWeight.Bold
)

@Composable
fun ProfilePage() {
    ProfileTemplate {
        ProfileInfo()
    }
}