package com.form.platform.messaging

actual fun createMessenger(): Messenger = object : Messenger {
    override fun showMessage(message: String) { println("Message: $message") }
    override fun showNotification(title: String, body: String, id: Int) {
        // TODO: implement with UNUserNotificationCenter
        println("Notification[$id] $title: $body")
    }
}
