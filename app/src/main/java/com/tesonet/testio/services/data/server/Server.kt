package com.tesonet.testio.services.data.server

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "server_table")
data class Server(
    @PrimaryKey(autoGenerate = false)
    val name: String,
    val distance: String
)
