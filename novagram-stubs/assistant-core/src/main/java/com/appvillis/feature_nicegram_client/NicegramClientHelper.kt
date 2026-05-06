package com.appvillis.feature_nicegram_client

import com.appvillis.feature_nicegram_client.domain.NgClientRemoteConfigRepo

object NicegramClientHelper {
    private val _preferences = Preferences()
    var preferences: Preferences? = _preferences

    @JvmStatic fun getPreferences(): Preferences = _preferences

    @JvmStatic
    fun preparedChatId(chatId: Long): Long = chatId

    @JvmStatic
    fun getReferralDrawDataUseCase(): ReferralDrawUseCase? = null

    class Preferences {
        @JvmField var canShareChannels: Boolean = true
        @JvmField var canShareBots: Boolean = true
        @JvmField var canShareStickers: Boolean = true

        fun getCanShareChannels(): Boolean = canShareChannels
        fun setCanShareChannels(value: Boolean) { canShareChannels = value }
        fun getCanShareBots(): Boolean = canShareBots
        fun setCanShareBots(value: Boolean) { canShareBots = value }
        fun getCanShareStickers(): Boolean = canShareStickers
        fun setCanShareStickers(value: Boolean) { canShareStickers = value }
    }

    class ReferralDrawUseCase {
        operator fun invoke(): NgClientRemoteConfigRepo.ReferralDrawInfo? = null
    }
}
