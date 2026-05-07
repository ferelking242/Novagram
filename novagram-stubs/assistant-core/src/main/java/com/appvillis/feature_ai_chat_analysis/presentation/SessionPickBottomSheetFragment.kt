package com.appvillis.feature_ai_chat_analysis.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

class SessionPickBottomSheetFragment : DialogFragment() {
    companion object {
        @JvmStatic
        fun create(
            chatId: Long,
            onSession: (com.appvillis.feature_ai_chat_analysis.domain.entities.Session?) -> Unit,
            onHistory: () -> Unit,
            onNewChat: () -> Unit
        ): SessionPickBottomSheetFragment = SessionPickBottomSheetFragment()

        @JvmStatic
        fun create(args: AiChatAnalysisFragmentArgs): SessionPickBottomSheetFragment = SessionPickBottomSheetFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = null
}
