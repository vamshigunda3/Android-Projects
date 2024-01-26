package com.example.bottomnav.ui.theme.Utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.example.bottomnav.ui.theme.models.BottomNavItem

object Constants {
    val BottomNavItems = listOf(
        BottomNavItem(
            label = "Home",
            icon = Icons.Filled.Home,
            route = "home"
        ),
        BottomNavItem(
            label = "Profile",
            icon = Icons.Filled.Person,
            route = "profile"
        ),
        BottomNavItem(
            label = "Search",
            icon = Icons.Filled.Search,
            route = "search"
        ),
        BottomNavItem(
            label = "Progress",
            icon = Icons.Filled.PlayArrow,
            route = "progress"
        ),
        BottomNavItem(
            label = "Team",
            icon = Icons.Filled.Check,
            route = "team"
        )
    )
}
