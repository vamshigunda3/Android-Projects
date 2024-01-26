package com.example.fitness_testing


import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp



@Composable
fun NavigationBar() {
    val items = listOf(
        NavigationItem(icon = Icons.Default.Home, label = "Home"),
        NavigationItem(icon = Icons.Default.Search, label = "Search"),
        NavigationItem(icon = Icons.Default.Email, label = "Music"),
        NavigationItem(icon = Icons.Default.Lock, label = "Movies"),
        NavigationItem(icon = Icons.Default.Favorite, label = "Favorites"),
        NavigationItem(icon = Icons.Default.Settings, label = "Settings")
    )

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.onSurface,
        elevation = 8.dp
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = false,
                onClick = { /*TODO*/ },
                modifier = Modifier.requiredHeight(56.dp)
            )
        }
    }
}

data class NavigationItem(val icon: ImageVector, val label: String)
