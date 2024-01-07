package com.loc.newsapp.presentation.navgraph

import androidx.navigation.NamedNavArgument

sealed class Route (
    val route : String,
    val arguments : List<NamedNavArgument> = emptyList()
) {
    object OnBoardingScreen : Route(route ="onBoardingScreen")
    object HomeScreen : Route(route ="homeScreen")
    object SearchScreen : Route(route ="searchScreen")
    object BookMarkScreen : Route(route ="bookMarkScreen")
    object DetailScreen : Route(route ="detailScreen")
    object AppStartNavigation : Route(route ="appStartNavigation")
    object NewsNavigation : Route(route ="newsNavigation")
    object NewsNavigatorScreen : Route(route = "newsNavigator")
}