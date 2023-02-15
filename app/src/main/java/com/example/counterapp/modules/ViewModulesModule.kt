package com.example.counterapp.modules

import com.example.counterapp.viewmodel.CounterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModel = module {
    viewModel { CounterViewModel(get()) }
}