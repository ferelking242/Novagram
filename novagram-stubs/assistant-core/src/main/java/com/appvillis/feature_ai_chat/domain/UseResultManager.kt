package com.appvillis.feature_ai_chat.domain

class UseResultManager {
    var listener: UseResultLister? = null

    interface UseResultLister {
        fun onTextResultUse(text: String)
        fun onImgResultUse(path: String)
    }
}
