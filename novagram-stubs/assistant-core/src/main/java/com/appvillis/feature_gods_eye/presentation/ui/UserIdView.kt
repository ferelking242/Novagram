package com.appvillis.feature_gods_eye.presentation.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class UserIdView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun setUserId(userId: Long) {}
    fun setData(id: String, showGodsEye: Boolean, accentColor: Int, textColor: Int) {}
    fun setCopyClick(callback: Runnable) {}
    fun setGodsEyeClick(callback: Runnable) {}
}
