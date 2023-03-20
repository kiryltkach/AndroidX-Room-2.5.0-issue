package com.kiryltkach.roomBugTest

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ExampleEntity::class], version = 1)
abstract class ExampleDatabase : RoomDatabase() {
    abstract fun userDao(): ExampleDao
}