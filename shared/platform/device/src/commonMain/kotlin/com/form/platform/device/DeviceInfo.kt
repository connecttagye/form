package com.form.platform.device

interface DeviceInfo {
    val platform: String
    val osVersion: String
    val model: String
}

expect fun getDeviceInfo(): DeviceInfo
