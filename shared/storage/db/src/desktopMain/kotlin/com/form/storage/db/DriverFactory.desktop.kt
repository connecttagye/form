package com.form.storage.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver

actual class DriverFactory {
    actual fun create(): SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY).also {
        FormDatabase.Schema.create(it)
    }
}
