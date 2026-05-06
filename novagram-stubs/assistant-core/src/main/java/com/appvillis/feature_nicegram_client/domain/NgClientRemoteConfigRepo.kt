package com.appvillis.feature_nicegram_client.domain

class NgClientRemoteConfigRepo {
    var messagesLimit: Int = 10
    var collectMessageImages: Boolean = true

    data class ReferralDrawInfo(
        val drawId: String = "",
        val title: String = "",
        val description: String = "",
        val prizeCount: Int = 0,
        val endDate: Long = 0L,
        val deeplink: String = ""
    )
}
