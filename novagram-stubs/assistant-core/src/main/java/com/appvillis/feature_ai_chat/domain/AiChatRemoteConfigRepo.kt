package com.appvillis.feature_ai_chat.domain

import com.appvillis.feature_ai_chat.domain.entity.EsimSplashData

class AiChatRemoteConfigRepo {
    var isEnabled: Boolean = false
    var maxMessages: Int = 10
    var modelName: String = ""
    var esimSplashData: EsimSplashData? = null
}
