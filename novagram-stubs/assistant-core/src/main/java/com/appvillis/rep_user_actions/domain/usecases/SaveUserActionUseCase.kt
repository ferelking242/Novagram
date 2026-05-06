package com.appvillis.rep_user_actions.domain.usecases

import com.appvillis.rep_user_actions.domain.entities.AttUserAction

class SaveUserActionUseCase {
    suspend operator fun invoke(action: AttUserAction) {}
}
