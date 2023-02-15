package com.example.counterapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.counterapp.model.CounterModel

@Database(entities = [CounterModel::class], version = 1)
abstract class HistoryDB : RoomDatabase() {
    abstract fun historyDao(): Dao
}
