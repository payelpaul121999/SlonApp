package com.pal.slonapp.ExpenceTracker.NavHost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pal.slonapp.ExpenceTracker.NavScreen.AddExpenseScreen
import com.pal.slonapp.ExpenceTracker.NavScreen.ExHomeScreen

@Composable
fun NavHostScreen() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "/home") {
        composable(route = "/home") {
            ExHomeScreen(navController)
        }

        composable(route = "/add") {
            AddExpenseScreen(navController)
        }
    }

}