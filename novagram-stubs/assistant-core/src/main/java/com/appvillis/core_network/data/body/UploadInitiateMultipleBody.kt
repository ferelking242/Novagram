package com.appvillis.core_network.data.body

data class UploadInitiateMultipleBody(
    val uploads: List<UploadInitiateBody>
) {
    data class UploadInitiateBody(
        val fileName: String?,
        val mimeType: String,
        val size: Long?,
        val context: Context
    )

    sealed class Context {
        data class TelegramChatMessage(
            val chatId: Long,
            val messageId: Int
        ) : Context()
    }
}
