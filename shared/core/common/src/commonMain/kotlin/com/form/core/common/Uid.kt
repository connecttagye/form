package com.form.core.common

import kotlinx.datetime.Clock

fun generateUid(): String = "${Clock.System.now().toEpochMilliseconds()}-${(0..999999).random()}"
