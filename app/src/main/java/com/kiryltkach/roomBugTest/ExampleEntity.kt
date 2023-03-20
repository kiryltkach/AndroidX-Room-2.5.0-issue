package com.kiryltkach.roomBugTest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExampleEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val name: String
)