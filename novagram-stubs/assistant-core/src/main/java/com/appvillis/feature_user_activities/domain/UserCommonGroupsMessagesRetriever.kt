package com.appvillis.feature_user_activities.domain

import com.appvillis.feature_user_activities.domain.entities.UserActivityMessage

interface UserCommonGroupsMessagesRetriever {
    suspend fun getCommonGroupsMessages(userId: Long): List<UserActivityMessage>
}
