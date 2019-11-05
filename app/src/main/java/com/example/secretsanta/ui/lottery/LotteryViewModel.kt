package com.example.secretsanta.ui.lottery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LotteryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is lottery Fragment"
    }
    val text: LiveData<String> = _text
}