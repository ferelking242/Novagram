package com.appvillis.feature_ai_chat_analysis.presentation

import android.os.Bundle
import com.appvillis.feature_ai_chat_analysis.domain.features.ChatFilter

data class SessionsListFragmentArgs(
    val chatFilter: ChatFilter? = null
) {
    fun toBundle(): Bundle = Bundle()
}
