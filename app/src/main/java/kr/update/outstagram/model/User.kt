package kr.update.outstagram.model

data class User(
    val id: String,
    val email: String,
    val username: String,
    val hasNewStory: Boolean = false,
) {
}