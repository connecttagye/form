package com.form.platform.messaging

actual fun createMessenger(): Messenger = object : Messenger {
    override fun showMessage(message: String) { console.log("Message: $message") }
    override fun showNotification(title: String, body: String, id: Int) {
        console.log("Notification[$id] $title: $body")
    }
}
