package com.form.util.text

fun String.isValidEmail(): Boolean =
    matches(Regex("^[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,}$"))

fun String.isNotBlankOrEmpty(): Boolean = isNotBlank() && isNotEmpty()

fun String.trimAndClean(): String = trim().replace(Regex("\\s+"), " ")

fun String.truncate(maxLength: Int, suffix: String = "..."): String {
    require(maxLength >= suffix.length) { "maxLength must be >= suffix.length" }
    return if (length <= maxLength) this else take(maxLength - suffix.length) + suffix
}

fun String.toSlug(): String = lowercase().replace(Regex("[^a-z0-9]+"), "-").trim('-')
