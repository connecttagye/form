package com.form.platform.device

actual fun getDeviceInfo(): DeviceInfo = object : DeviceInfo {
    override val platform = "Android"
    override val osVersion = android.os.Build.VERSION.RELEASE
    override val model = android.os.Build.MODEL
}
