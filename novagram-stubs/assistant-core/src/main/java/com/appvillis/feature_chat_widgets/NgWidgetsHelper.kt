package com.appvillis.feature_chat_widgets

import android.content.Context

object NgWidgetsHelper {
    @JvmStatic fun isEnabled(context: Context): Boolean = false
    @JvmStatic fun trackWidgetShown(context: Context, chatId: Long) {}
    @JvmStatic fun trackWidgetClicked(context: Context, chatId: Long) {}
}
