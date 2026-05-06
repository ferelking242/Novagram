package com.appvillis.feature_ai_chat_analysis

import com.appvillis.feature_ai_chat_analysis.domain.entities.Session
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface AiAnalysisEntryPoint {
    fun aiChatAnalysisHelper(): Any
    fun getSessionsUseCase(): GetSessionsUseCase
}

class GetSessionsUseCase {
    operator fun invoke(): List<SessionWithSource> = emptyList()
}

data class SessionWithSource(
    val session: Session = Session(),
    val source: SourceRef = SourceRef()
) {
    data class SourceRef(val chatId: Long = 0L)
}
