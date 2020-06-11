package com.juanricardorc.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
*
* activa la generación de código de Hilt, incluida una clase base para su aplicación
* que sirve como contenedor de dependencia a nivel de aplicación.
*
* */

@HiltAndroidApp
open class HiltApplication : Application()