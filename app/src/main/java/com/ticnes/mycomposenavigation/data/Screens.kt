package com.ticnes.mycomposenavigation.data

sealed class NavigationItem(var route: String)
{
    object Home : NavigationItem("home")
    object Configuration : NavigationItem("config")
    object Players : NavigationItem("players")
    object SignUpPlayers : NavigationItem("signup/{id}")


}
