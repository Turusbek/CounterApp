package com.example.counterapp.modules

import com.example.counterapp.viewmodel.Repository
import org.koin.dsl.module


val repoModule = module {
    single { Repository() }
}
