package com.appvillis.feature_avatar_generator.domain.usecases

class AvatarsOnboardingUseCase {
    var hasSeenWelcome: Boolean = true

    suspend operator fun invoke(): Boolean = false
}
