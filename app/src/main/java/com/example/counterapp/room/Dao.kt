package com.example.counterapp.room

import androidx.room.Insert
import androidx.room.Query
import com.example.counterapp.model.CounterModel


@androidx.room.Dao
interface Dao {

        @Query("SELECT * FROM countermodel")
        fun getAllHistory(): List<CounterModel>

        @Insert
        fun insertToHistory(model: CounterModel)
    }
