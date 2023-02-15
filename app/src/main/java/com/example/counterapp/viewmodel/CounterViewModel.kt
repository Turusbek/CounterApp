package com.example.counterapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class CounterViewModel(private val repo: Repository): ViewModel() {

    private var count = MutableLiveData<Int>()


    val counter = count.switchMap {
        repo.counting(it)
    }


    fun increment(counter: Int) {
        count.postValue(counter)
    }

}