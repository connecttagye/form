package com.form.core.log

actual object Logger {
    actual fun d(tag: String, message: String) { println("D/$tag: $message") }
    actual fun e(tag: String, message: String, throwable: Throwable?) { println("E/$tag: $message") }
    actual fun i(tag: String, message: String) { println("I/$tag: $message") }
    actual fun w(tag: String, message: String) { println("W/$tag: $message") }
}
