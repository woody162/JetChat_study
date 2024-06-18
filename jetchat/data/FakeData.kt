/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.data.EMOJIS.EMOJI_CLOUDS
import com.example.compose.jetchat.data.EMOJIS.EMOJI_FLAMINGO
import com.example.compose.jetchat.data.EMOJIS.EMOJI_MELTING
import com.example.compose.jetchat.data.EMOJIS.EMOJI_PINK_HEART
import com.example.compose.jetchat.data.EMOJIS.EMOJI_POINTS
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "me",
        "要不然要約誰",
        "8:07 PM"
    ),
    Message(
        "小吉",
        "每次都約自科",
        "8:06 PM"
    ),
    Message(
        "小吉",
        "不約其他系排嗎?$EMOJI_MELTING",
        "8:05 PM"
    ),
    Message(
        "小吉",
        "蝦 這麼色喔",
        "8:04 PM"
    ),
    Message(
        "me",
        "跟自科約怎麼樣?有紀廷!!$EMOJI_PINK_HEART",
        "8:03 PM",
        R.drawable.sticker
    ),
    Message(
        "me",
        "欸大家要不要約友誼賽",
        "8:02 PM"
    ),
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "資科系排",
    channelMembers = 19
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.dog,
    name = "薛小吉",
    status = "Away",
    displayName = "小吉",
    position = "舉球兼大砲",
    twitter = "不告訴你啊",
    timeZone = "12:25 AM local time (Eastern Daylight Time)",
    commonChannels = "2"
)

/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "me",
    photo = R.drawable.me,
    name = "鍾大頭",
    status = "Online",
    displayName = "隊長",
    position = "全部位置都打",
    twitter = "我沒有",
    timeZone = "In your timezone",
    commonChannels = null
)

object EMOJIS {
    // EMOJI 15
    const val EMOJI_PINK_HEART = "\uD83E\uDE77"

    // EMOJI 14 🫠
    const val EMOJI_MELTING = "\uD83E\uDEE0"

    // ANDROID 13.1 😶‍🌫️
    const val EMOJI_CLOUDS = "\uD83D\uDE36\u200D\uD83C\uDF2B️"

    // ANDROID 12.0 🦩
    const val EMOJI_FLAMINGO = "\uD83E\uDDA9"

    // ANDROID 12.0  👉
    const val EMOJI_POINTS = " \uD83D\uDC49"
}
