package com.kiryltkach.roomBugTest

import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class ExampleDao : ExampleParent {
    @Query("SELECT * FROM exampleEntity WHERE name = :nameParam")
    abstract suspend fun getAll(nameParam: String): List<ExampleEntity>
}