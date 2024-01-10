package com.example.navigationwithhilt.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
internal fun RootHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = INITIAL_GRAPH_ROUTE
    ) {
        initialGraph(navController)
    }
}