package com.juanricardorc.home

import javax.inject.Inject

class HomeRepository @Inject constructor() {

    fun getName(): String {
        return "Home"
    }

}