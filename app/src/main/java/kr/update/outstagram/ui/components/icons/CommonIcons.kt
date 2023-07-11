package kr.update.outstagram.ui.components.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.update.outstagram.R

val iconModifier = Modifier.size(24.dp)

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun HomeIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.home),
        contentDescription = "Home",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun SearchIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.search),
        contentDescription = "Search",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun AddIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.add),
        contentDescription = "Add",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun ReelsIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.reels),
        contentDescription = "Reels",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun ProfileIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_profile),
        contentDescription = "Profile",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun LikeIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.like),
        contentDescription = "Like",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun ShareIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.share),
        contentDescription = "Share",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun MoreIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.more),
        contentDescription = "More",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun CommentIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.comment),
        contentDescription = "Comment",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun BookmarkIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.bookmark),
        contentDescription = "Bookmark",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun VerifiedLabelIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.verified_label),
        contentDescription = "Verified",
        modifier = modifier.then(iconModifier)
    )
}


@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun NotificationIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.notification),
        contentDescription = "Notification",
        modifier = modifier.then(iconModifier)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 100, heightDp = 100)
@Composable
fun BackCaretIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.back_caret),
        contentDescription = "Back",
        modifier = modifier.then(iconModifier)
    )
}