package com.example.counterapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Repository {

    fun counting(count: Int): LiveData<Int> {
        val livedata = MutableLiveData<Int>()
        livedata.value = count
        return livedata
    }
}
