package com.appvillis.feature_user_activities.domain

import com.appvillis.feature_user_activities.domain.entities.UserActivityMessage

interface UserCommonGroupsMessagesRetriever {
    suspend fun getMessagesInCommonGroups(userId: Long): List<UserActivityMessage>
}
