package com.form.platform.messaging

actual fun createMessenger(): Messenger = object : Messenger {
    override fun showMessage(message: String) {
        // TODO: implement with Toast or Snackbar in real app
        println("Message: $message")
    }
    override fun showNotification(title: String, body: String, id: Int) {
        // TODO: implement with NotificationManager
        println("Notification[$id] $title: $body")
    }
}
