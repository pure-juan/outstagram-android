package kr.update.outstagram.ui.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.update.outstagram.ui.components.post.PostCard
import kr.update.outstagram.ui.template.HomeTemplate

@Preview(showBackground = true, backgroundColor = 0x000000)
@Composable
fun HomePage() {
    HomeTemplate() {
        PostCard {
        }
        PostCard {
        }
        PostCard {
        }
        PostCard {
        }
    }
}