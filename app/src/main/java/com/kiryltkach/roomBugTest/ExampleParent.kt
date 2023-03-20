package com.kiryltkach.roomBugTest

import androidx.room.Query

interface ExampleParent {
    @Query("SELECT * FROM exampleEntity")
    suspend fun getAll(): List<ExampleEntity>
}