package com.appvillis.feature_user_activities.presentation

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class UserActivitiesView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    constructor(
        context: Context,
        currentUserId: Long,
        targetUserId: Long,
        themeProxy: com.appvillis.core_resources.domain.TgResourceProvider.ThemeProxy,
        imagesLoader: com.appvillis.core_resources.domain.TgImagesLoader
    ) : this(context)

    fun setUserId(userId: Long) {}
    fun refresh() {}
}
