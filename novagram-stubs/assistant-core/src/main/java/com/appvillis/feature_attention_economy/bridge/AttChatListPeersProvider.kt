package com.appvillis.feature_attention_economy.bridge

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

interface AttChatListPeersProvider {
    fun updateUsernamesFlow()
    fun usernamesFlow(categories: List<ChatListPeersProviderCategory>): Flow<List<String>>

    enum class ChatListPeersProviderCategory {
        Bots,
        Groups,
        Channels
    }
}
