package com.juanricardorc.mainmenu

import android.content.Context
import android.os.Build
import com.juanricardorc.R
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

/*
*
* Use la anotación @Inject en el constructor de una clase para decirle a Hilt cómo
* proporcionar instancias de esa clase.
*
* */

class MainDataRepository
@Inject constructor(@ActivityContext var context: Context) : MainRepository {

    fun getNameMainMenu(): String {
        return "Hola, Main Menu :)"
    }

    fun getMainVersion() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            context.resources.getColor(R.color.colorAccent, context.theme)
        }
    }

    override fun getMenuList() {

    }

    override fun getMenuOfList(index: Int) {

    }
}