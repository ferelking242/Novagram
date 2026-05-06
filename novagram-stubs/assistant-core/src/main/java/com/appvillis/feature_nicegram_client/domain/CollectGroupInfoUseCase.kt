package com.appvillis.feature_nicegram_client.domain

import com.appvillis.core_network.data.body.ChannelInfoRequest

class CollectGroupInfoUseCase {

    sealed class GroupCollectInfoData {
        data class CollectInfoData(
            val groupId: Long = 0,
            val inviteLinks: List<InviteLink> = emptyList(),
            val iconBase64: String? = null,
            val restrictions: List<Restriction> = emptyList(),
            val verified: Boolean = false,
            val about: String? = null,
            val hasGeo: Boolean = false,
            val title: String = "",
            val fake: Boolean = false,
            val scam: Boolean = false,
            val date: Long = 0,
            val username: String? = null,
            val usernames: List<String> = emptyList(),
            val gigagroup: Boolean = false,
            val lastMessageLang: String? = null,
            val participantsCount: Int = 0,
            val geoLocation: Geo? = null,
            val type: String = "",
            val similarChannels: List<CollectInfoData> = emptyList(),
            val messages: Any? = null,
            val chatPhoto: ChannelInfoRequest.ChatPhoto? = null
        ) : GroupCollectInfoData()

        data class CollectInfoErrorData(
            val username: String? = null,
            val error: String? = null
        ) : GroupCollectInfoData()
    }

    data class Geo(
        val lat: Double = 0.0,
        val lng: Double = 0.0
    )

    data class InviteLink(
        val date: Long = 0,
        val requestNeeded: Boolean = false,
        val adminId: Long = 0,
        val permanent: Boolean = false,
        val revoked: Boolean = false,
        val link: String = ""
    )

    data class Restriction(
        val platform: String = "",
        val text: String = "",
        val reason: String = ""
    )

    data class UsernamesForParsing(
        val usernames: List<String> = emptyList(),
        val requestId: String = ""
    )

    fun canCollectGroup(id: Long): Boolean = false
    fun canCollectGroupPack(): Boolean = false
    fun canCollectBot(id: Long): Boolean = false
    fun getGroupsUsernameForCollect(): UsernamesForParsing = UsernamesForParsing()
    suspend fun collectGroupsInfo(groupInfo: GroupCollectInfoData, requestId: String = "") {}
    suspend fun collectGroup(data: GroupCollectInfoData.CollectInfoData, uploadMap: Map<String, String> = emptyMap()) {}
    suspend fun collectInfo(data: GroupCollectInfoData.CollectInfoData) {}
}
