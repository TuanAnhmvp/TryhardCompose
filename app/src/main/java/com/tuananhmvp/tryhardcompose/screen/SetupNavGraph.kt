package com.tuananhmvp.tryhardcompose.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            FirstScreen(navHostController = navController)
        }

        composable(route = Screen.Detail.route) {
            SecondScreen(navHostController = navController)
        }
    }
}