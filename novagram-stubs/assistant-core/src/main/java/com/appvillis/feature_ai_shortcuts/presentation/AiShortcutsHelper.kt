package com.appvillis.feature_ai_shortcuts.presentation

import android.content.Context
import android.view.View

class AiShortcutsHelper {
    fun isEnabled(): Boolean = false
    fun createView(context: Context): View? = null
    fun clean() {}
    fun initWithScope(view: View, bgColor: Int, textColor: Int) {}
    fun setListener(listener: (String) -> Unit?) {}
    fun onTextChange(text: String) {}
}
