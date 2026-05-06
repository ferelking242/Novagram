package com.appvillis.feature_keywords.presentation.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class KeywordsHintView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    constructor(context: Context, bgColor: Int, textColor: Int) : this(context)

    fun setFolderId(folderId: Int) {}
    fun show() {}
    fun hide() {}
}
