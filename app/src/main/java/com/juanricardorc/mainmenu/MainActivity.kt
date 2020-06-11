package com.juanricardorc.mainmenu

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.juanricardorc.R
import com.juanricardorc.app.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

/*
*
* Hilt puede proporcionar dependencias a otras clases de Android que tengan la
* anotación @AndroidEntryPoint. @AndroidEntryPoint Genera un componente Hilt individual
* para cada clase de Android en su proyecto.
*
* */

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    @Inject
    @Named("author")
    lateinit var author: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onResume() {
        super.onResume()
        Log.v("DaggerToHilt: ", "author -> $author")
    }
}