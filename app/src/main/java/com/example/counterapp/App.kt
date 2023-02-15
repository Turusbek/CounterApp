package com.example.counterapp

import android.app.Application
import androidx.room.Room
import com.example.counterapp.modules.dbModule
import com.example.counterapp.modules.repoModule
import com.example.counterapp.modules.viewModel
import com.example.counterapp.room.HistoryDB
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    companion object{
        lateinit var db: HistoryDB

    }
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            HistoryDB::class.java,
            "Db").allowMainThreadQueries().build()


        startKoin{
            androidContext(this@App)
            modules(viewModel, repoModule, dbModule)
        }


    }
}