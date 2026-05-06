package com.appvillis.core_network.data.body

data class ChannelInfoRequest(
    val groupId: Long = 0,
    val messages: List<MessageInformation>? = null
) {
    data class MessageInformation(
        val id: Int = 0,
        val text: String? = null,
        val fromName: String? = null,
        val date: Long = 0,
        val uploadId: Int? = null
    )

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
