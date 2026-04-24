package com.form.util.text

private val EMAIL_REGEX = Regex("^[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,}$")
private val WHITESPACE_REGEX = Regex("\\s+")
private val NON_SLUG_REGEX = Regex("[^a-z0-9]+")

fun String.isValidEmail(): Boolean = matches(EMAIL_REGEX)

fun String.isNotBlankOrEmpty(): Boolean = isNotBlank()

fun String.trimAndClean(): String = trim().replace(WHITESPACE_REGEX, " ")

fun String.truncate(maxLength: Int, suffix: String = "..."): String {
    require(maxLength >= suffix.length) { "maxLength must be >= suffix.length" }
    return if (length <= maxLength) this else take(maxLength - suffix.length) + suffix
}

fun String.toSlug(): String = lowercase().replace(NON_SLUG_REGEX, "-").trim('-')
