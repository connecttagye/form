package com.form.platform.device

import platform.UIKit.UIDevice

actual fun getDeviceInfo(): DeviceInfo = object : DeviceInfo {
    override val platform = "iOS"
    override val osVersion = UIDevice.currentDevice.systemVersion
    override val model = UIDevice.currentDevice.model
}
