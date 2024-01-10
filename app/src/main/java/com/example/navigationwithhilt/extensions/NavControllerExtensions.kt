package com.example.navigationwithhilt.extensions

import android.os.Bundle
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavDestination.Companion.createRoute
import androidx.navigation.NavOptions
import androidx.navigation.Navigator

fun NavController.navigateWithArgs(
    route: String,
    args: Bundle,
    navOptions: NavOptions? = null,
    navigatorExtras: Navigator.Extras? = null,
) {
    val routeLink = NavDeepLinkRequest.Builder.fromUri(createRoute(route).toUri()).build()

    val deeplinkMatch = graph.matchDeepLink(routeLink)
    deeplinkMatch?.let {
        navigate(it.destination.id, args, navOptions, navigatorExtras)
    } ?: navigate(route, navOptions, navigatorExtras)
}
