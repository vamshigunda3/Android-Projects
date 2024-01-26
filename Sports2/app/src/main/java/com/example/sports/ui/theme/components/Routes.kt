package com.example.sports.ui.theme.components

sealed class Routes(val route: String) {
    object Endurance : Routes("endurance")
    object Flexibility : Routes("flexibility")
    object Strength : Routes("strength")
    object Speed : Routes("speed")
    object Balance : Routes("balance")
}

