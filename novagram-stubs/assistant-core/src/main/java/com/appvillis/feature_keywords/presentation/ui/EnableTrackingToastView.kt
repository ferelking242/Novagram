package com.appvillis.feature_keywords.presentation.ui

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.appvillis.core_resources.domain.TgResourceProvider
import com.appvillis.feature_keywords.domain.entities.KeywordsMessage

open class EnableTrackingToastView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    constructor(
        activity: Activity,
        query: String,
        messages: List<KeywordsMessage>,
        theme: TgResourceProvider.ThemeProxy
    ) : this(activity as Context)

    fun show() {}
    fun hide() {}
}
