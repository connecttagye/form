package com.form.platform.messaging

interface Messenger {
    fun showMessage(message: String)
    fun showNotification(title: String, body: String, id: Int = 0)
}

expect fun createMessenger(): Messenger
