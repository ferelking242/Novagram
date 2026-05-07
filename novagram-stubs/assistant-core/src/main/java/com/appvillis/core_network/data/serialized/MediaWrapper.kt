package com.appvillis.core_network.data.serialized

data class MediaWrapper(
    val data: ByteArray? = null,
    val mimeType: String = ""
) {
    companion object {
        @JvmStatic
        fun from(media: Any?): MediaWrapper = MediaWrapper()
    }
}
