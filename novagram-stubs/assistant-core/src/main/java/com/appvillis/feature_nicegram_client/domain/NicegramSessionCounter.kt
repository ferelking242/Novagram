package com.appvillis.feature_nicegram_client.domain

class NicegramSessionCounter {
    var sessionsCount: Int = 0

    fun getSessionCount(): Int = sessionsCount
    fun incrementSession() { sessionsCount++ }
    fun increaseSessionCount() { sessionsCount++ }
}
