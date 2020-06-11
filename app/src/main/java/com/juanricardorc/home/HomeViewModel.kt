package com.juanricardorc.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel @ViewModelInject constructor(homeRepository: HomeRepository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment - ${homeRepository.getName()}"
    }
    val text: LiveData<String> = _text
}