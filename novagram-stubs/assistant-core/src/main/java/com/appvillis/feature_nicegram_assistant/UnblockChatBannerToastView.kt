package com.appvillis.feature_nicegram_assistant

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class UnblockChatBannerToastView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun show() {}
    fun hide() {}

    companion object {
        @JvmStatic
        fun newInstance(context: Context, action: () -> Any?): UnblockChatBannerToastView {
            return UnblockChatBannerToastView(context)
        }
    }
}
