package com.appvillis.core_network.data.body

import com.appvillis.core_network.data.serialized.MediaWrapper

data class ChannelInfoRequest(
    val groupId: Long = 0,
    val messages: List<MessageInformation>? = null
) {
    data class MessageInformation(
        val id: Int = 0,
        val message: String = "",
        val commentsCount: Int = 0,
        val viewsCount: Int = 0,
        val date: Int = 0,
        val author: Author? = null,
        val peerId: Long = 0,
        val groupedId: Long = 0,
        val reactions: List<Reaction> = emptyList(),
        val media: MediaWrapper? = null
    ) {
        sealed class Author {
            data class AuthorChannel(
                val id: Long = 0,
                val title: String? = null,
                val username: String? = null,
                val usernames: List<String> = emptyList()
            ) : Author()

            data class AuthorUser(
                val id: Long = 0,
                val firstName: String? = null,
                val lastName: String? = null,
                val phone: String? = null,
                val username: String? = null,
                val usernames: List<String> = emptyList()
            ) : Author()

            data class AuthorChat(
                val id: Long = 0,
                val title: String? = null,
                val username: String? = null,
                val usernames: List<String> = emptyList()
            ) : Author()
        }

        sealed class Reaction {
            data class Emoji(val emoticon: String = "", val count: Int = 0) : Reaction()
            data class CustomEmoji(val documentId: Long = 0, val count: Int = 0) : Reaction()
            data class Paid(val count: Int = 0) : Reaction()
        }

        sealed class Media {
            data class Photo(
                val id: Long = 0,
                val hasStickers: Boolean = false,
                val date: Int = 0,
                val sizes: ArrayList<PhotoSize> = arrayListOf(),
                val videoSizes: ArrayList<VideoSize> = arrayListOf(),
                val uploadId: Int? = null
            ) : Media()

            data class Audio(
                val duration: Int = 0,
                val title: String? = null
            ) : Media()

            data class Video(val duration: Int = 0) : Media()
        }

        sealed class PhotoSize {
            data class PhotoSizeEmpty(val type: String = "") : PhotoSize()
            data class PhotoSizeRegular(
                val type: String = "",
                val w: Int = 0,
                val h: Int = 0,
                val size: Int = 0
            ) : PhotoSize()

            data class PhotoCachedSize(
                val type: String = "",
                val w: Int = 0,
                val h: Int = 0,
                val bytes: ByteArray? = null
            ) : PhotoSize()

            data class PhotoStrippedSize(
                val type: String = "",
                val bytes: ByteArray? = null
            ) : PhotoSize()

            data class PhotoSizeProgressive(
                val type: String = "",
                val w: Int = 0,
                val h: Int = 0,
                val sizes: ArrayList<Int> = arrayListOf()
            ) : PhotoSize()

            data class PhotoPathSize(
                val type: String = "",
                val bytes: ByteArray? = null
            ) : PhotoSize()
        }

        sealed class VideoSize {
            data class VideoSizeRegular(
                val type: String = "",
                val w: Int = 0,
                val h: Int = 0,
                val size: Int = 0
            ) : VideoSize()

            data class VideoSizeEmojiMarkup(
                val emojiId: Long = 0,
                val backgroundsColors: ArrayList<Int> = arrayListOf()
            ) : VideoSize()

            data class VideoSizeStickerMarkup(
                val stickerId: Long = 0,
                val backgroundsColors: ArrayList<Int> = arrayListOf()
            ) : VideoSize()
        }
    }

    sealed class ChatPhoto {
        object PhotoEmpty : ChatPhoto()
        data class Photo(
            val hasVideo: Boolean = false,
            val strippedThumb: ByteArray? = null,
            val photoId: Long = 0,
            val dcId: Int = 0
        ) : ChatPhoto()
    }
}
