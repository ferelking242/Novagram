package com.appvillis.rep_user.domain

class AppSessionControlUseCase {
    var appSessionNumber: Int = 0

    suspend operator fun invoke() {}
    fun onAppForeground() {}
    fun onAppBackground() {}
    fun increaseSessionCount() {}
}
