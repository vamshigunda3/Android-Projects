package com.example.temperature

import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.vectorResource
//import androidx.compose.ui.unit.dp


data class BarItem(
    val title: String,
    val image: ImageVector,
    val route: String
)


object NavBarItems {
    val BarItems = listOf(
        BarItem(
            title = "Home",
            image = Icons.Filled.Home,
            route = "home"
        ),
        BarItem(
            title = "User Profile",
            image = Icons.Filled.Person,
            route = "user_profile"
        ),
        BarItem(
            title = "Progress",
            image = Icons.Filled.ThumbUp,
            route = "Progress"
        ),
        BarItem(
            title = "Team Records",
            image = Icons.Filled.Share,
            route = "team_records"
        )

    )
}
