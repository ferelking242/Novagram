package com.appvillis.feature_ai_chat.domain.usecases

import com.appvillis.feature_ai_chat.domain.entity.AiCommand

class GetChatCommandsUseCase {
    val contextCommands: List<AiCommand> = emptyList()
    suspend operator fun invoke(): List<AiCommand> = emptyList()
}
