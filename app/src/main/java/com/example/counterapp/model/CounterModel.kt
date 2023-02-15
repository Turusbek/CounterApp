package com.example.counterapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CounterModel(
        @PrimaryKey(autoGenerate = true)
        var id : Int?  = null,
        val count: String
    )


