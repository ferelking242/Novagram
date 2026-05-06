package com.appvillis.core_resources.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class BubbleHintWidget @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun setHint(text: String) {}
    fun show() {}
    fun show(anchor: android.view.View, content: android.view.View, onClickListener: Runnable) {}
    fun hide() {}
}
