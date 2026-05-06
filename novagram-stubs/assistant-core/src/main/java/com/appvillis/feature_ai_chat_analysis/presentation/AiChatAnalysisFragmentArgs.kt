package com.appvillis.feature_ai_chat_analysis.presentation

import android.os.Bundle
import com.appvillis.feature_ai_chat_analysis.domain.features.AiChatAnalysisSource

data class AiChatAnalysisFragmentArgs(
    val chat: AiChatAnalysisSource.Chat? = null,
    val session: AiChatAnalysisSource.Session? = null
) {
    fun toBundle(): Bundle = Bundle()
}
