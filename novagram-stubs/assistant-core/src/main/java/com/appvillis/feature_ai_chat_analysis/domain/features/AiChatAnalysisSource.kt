package com.appvillis.feature_ai_chat_analysis.domain.features

import com.appvillis.feature_ai_chat_analysis.domain.entities.Session
import com.appvillis.feature_ai_chat_analysis.domain.entities.SourceData

sealed class AiChatAnalysisSource {
    data class Chat(
        val sourceData: SourceData = SourceData()
    ) : AiChatAnalysisSource()
    data class User(val userId: Long = 0L) : AiChatAnalysisSource()
    data class Session(
        val session: com.appvillis.feature_ai_chat_analysis.domain.entities.Session = com.appvillis.feature_ai_chat_analysis.domain.entities.Session()
    ) : AiChatAnalysisSource()
}
