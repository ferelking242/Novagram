package com.appvillis.feature_nicegram_client

import android.content.Context

class HiddenChatsHelper {
    companion object {
        @JvmStatic val INSTANCE: HiddenChatsHelper = HiddenChatsHelper()
    }

    fun isHiddenChatsEnabled(context: Context): Boolean = false
    fun getHiddenChatIds(context: Context): List<Long> = emptyList()
    fun hideChat(context: Context, chatId: Long) {}
    fun showChat(context: Context, chatId: Long) {}
    fun isChatHidden(context: Context, chatId: Long): Boolean = false
}
