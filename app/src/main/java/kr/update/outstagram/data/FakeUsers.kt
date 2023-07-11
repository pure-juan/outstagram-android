package kr.update.outstagram.data

import kr.update.outstagram.model.User

val me = User(
    id = "0",
    email = "juan003@naver.com",
    username = "Juan Kim",
    hasNewStory = true,
)

val user1 = User(
    id = "1",
    email = "juan.kim@3i.ai",
    username = "Juan Kim (3i)",
    hasNewStory = true,
)
val user2 = User(
    id = "2",
    email = "test@test.com",
    username = "Test account",
    hasNewStory = false,
)
val user3 = User(
    id = "3",
    email = "lucy.an@3i.ai",
    username = "Lucy An (3i)",
    hasNewStory = false,
)
val user4 = User(
    id = "4",
    email = "kimjuan220@gmail.com",
    username = "Juan Kim (Gmail)",
    hasNewStory = true,
)
val user5 = User(
    id = "5",
    email = "test+5@test.com",
    username = "Test 5",
    hasNewStory = true,
)
val user6 = User(
    id = "6",
    email = "test+6@test.com",
    username = "Test 6",
    hasNewStory = true,
)
val user7 = User(
    id = "7",
    email = "test+7@test.com",
    username = "Test 7 but with long username",
    hasNewStory = true,
)
val users = listOf(user1, user2, user3, user4, user5, user6, user7)