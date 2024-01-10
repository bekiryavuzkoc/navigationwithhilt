package com.example.navigationwithhilt.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.navigationwithhilt.ui.screen.INITIAL_ROUTE
import com.example.navigationwithhilt.ui.screen.finalScreen
import com.example.navigationwithhilt.ui.screen.initialScreen
import com.example.navigationwithhilt.ui.screen.navigateToFinalScreen

internal const val INITIAL_GRAPH_ROUTE = "initial_graph"

fun NavGraphBuilder.initialGraph(
    navController: NavController,
) {
    navigation(
        startDestination = INITIAL_ROUTE,
        route = INITIAL_GRAPH_ROUTE,
    ) {
        initialScreen(
            onNavigateButtonClicked = { name, person ->
                navController.navigateToFinalScreen(name, person)
            }
        )
        finalScreen()
    }
}