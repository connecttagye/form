package com.form.core.log

actual object Logger {
    actual fun d(tag: String, message: String) { console.log("D/$tag: $message") }
    actual fun e(tag: String, message: String, throwable: Throwable?) { console.error("E/$tag: $message") }
    actual fun i(tag: String, message: String) { console.info("I/$tag: $message") }
    actual fun w(tag: String, message: String) { console.warn("W/$tag: $message") }
}
