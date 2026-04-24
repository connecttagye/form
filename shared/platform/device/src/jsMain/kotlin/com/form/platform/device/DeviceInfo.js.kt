package com.form.platform.device

actual fun getDeviceInfo(): DeviceInfo = object : DeviceInfo {
    override val platform = "JS/Web"
    override val osVersion = "unknown"
    override val model = "Browser"
}
