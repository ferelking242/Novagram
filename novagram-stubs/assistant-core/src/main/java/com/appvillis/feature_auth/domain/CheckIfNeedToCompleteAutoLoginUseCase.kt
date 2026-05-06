package com.appvillis.feature_auth.domain

class CheckIfNeedToCompleteAutoLoginUseCase {
    suspend operator fun invoke(isTelegramUserAuthorized: Boolean): Boolean = false
}
