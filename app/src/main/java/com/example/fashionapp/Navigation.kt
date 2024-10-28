package com.example.fashionapp

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fashionapp.screens.DashboardScreen
import com.example.fashionapp.screens.LandingScreen
import com.example.fashionapp.screens.ProductScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Landing.router) {
        composable(route = Screen.Landing.router) {
            LandingScreen(navController = navController)
        }
        composable(route = Screen.Dashboard.router) {
          DashboardScreen(navController = navController)
        }
        composable(route = Screen.Product.router) {
           ProductScreen(navController = navController)
        }
    }
}
