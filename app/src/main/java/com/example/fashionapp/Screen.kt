package com.example.fashionapp

sealed class Screen(val router: String) {
    data object Landing: Screen("landing_screen")
    data object Dashboard: Screen("dashboard_screen")
    data object Product : Screen("product_screen")
}