package com.swu.zzm.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.找到navhostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.containerFragment) as NavHostFragment


        //2.找到NavController
        navController = navHostFragment.navController

        //3.bottomNavigationView和navController关联
        bottomNavigationView.setupWithNavController(navController)

        //4.ActionBar和navController关联
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipesFragment,
                R.id.jokeFragment,
                R.id.favoritesFragment
            )
        )
        setupActionBarWithNavController(navController,appBarConfiguration)
    }
}