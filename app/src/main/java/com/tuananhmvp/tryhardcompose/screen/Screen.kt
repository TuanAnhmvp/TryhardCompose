package com.tuananhmvp.tryhardcompose.screen


sealed class Screen (val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "Detail_screen")
}