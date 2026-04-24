package com.form.storage.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import java.io.File

actual class DriverFactory {
    actual fun create(): SqlDriver {
        val dbDir = File(System.getProperty("user.home"), ".form")
        dbDir.mkdirs()
        val dbFile = File(dbDir, "form.db")
        val isNewDb = !dbFile.exists() || dbFile.length() == 0L
        val driver = JdbcSqliteDriver("jdbc:sqlite:${dbFile.absolutePath}")
        if (isNewDb) {
            FormDatabase.Schema.create(driver)
        }
        return driver
    }
}
