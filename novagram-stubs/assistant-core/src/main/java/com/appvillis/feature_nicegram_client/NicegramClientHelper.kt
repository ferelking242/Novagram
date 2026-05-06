package com.appvillis.feature_nicegram_client

import com.appvillis.feature_nicegram_client.domain.NgClientRemoteConfigRepo

object NicegramClientHelper {
    private val _preferences = Preferences()

    @JvmStatic fun getPreferences(): Preferences = _preferences

    @JvmStatic
    fun preparedChatId(chatId: Long): Long = chatId

    @JvmStatic
    fun getReferralDrawDataUseCase(): ReferralDrawUseCase? = null

    class Preferences {
        @JvmField var canShareChannels: Boolean = true
        @JvmField var canShareBots: Boolean = true
        @JvmField var canShareStickers: Boolean = true
    }

    class ReferralDrawUseCase {
        operator fun invoke(): NgClientRemoteConfigRepo.ReferralDrawInfo? = null
    }
}
