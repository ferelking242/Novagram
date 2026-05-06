package com.appvillis.feature_chat_widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class NgWidgetsView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun setChatId(chatId: Long) {}
    fun setUserId(userId: Long) {}
    fun updateTheme() {}
}
