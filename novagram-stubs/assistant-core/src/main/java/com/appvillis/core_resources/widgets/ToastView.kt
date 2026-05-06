package com.appvillis.core_resources.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class ToastView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun show(text: String) {}
    fun hide() {}

    companion object {
        @JvmStatic
        fun newInstance(context: Context, text: String, iconResId: Int, flag: Boolean): ToastView {
            return ToastView(context)
        }
    }
}
