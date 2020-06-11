package com.juanricardorc.mainmenu

interface MainRepository {
    fun getMenuList()
    fun getMenuOfList(index: Int)
}