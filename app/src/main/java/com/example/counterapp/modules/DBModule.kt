package com.example.counterapp.modules

import android.content.Context
import androidx.room.Room
import com.example.counterapp.room.HistoryDB
import org.koin.dsl.module


val dbModule = module {
    single { provideDB(get()) }

}

fun provideDB(applicationContext: Context) : HistoryDB {
    return Room.databaseBuilder(
        applicationContext,
        HistoryDB::class.java,
        "DB"
    ).allowMainThreadQueries().build()
}