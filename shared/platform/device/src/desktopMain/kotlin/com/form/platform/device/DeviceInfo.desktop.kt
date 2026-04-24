package com.form.platform.device

actual fun getDeviceInfo(): DeviceInfo = object : DeviceInfo {
    override val platform = "Desktop"
    override val osVersion = System.getProperty("os.version") ?: "unknown"
    override val model = System.getProperty("os.name") ?: "unknown"
}
