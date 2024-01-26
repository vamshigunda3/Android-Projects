package com.example.sports.ui.theme


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.sports.ui.theme.components.LearnLists


@Composable
fun HomeScreen() {

    // Column Composable,
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        // Parameters set to place the items in center
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Icon Composable
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "home",
            tint = Color(0xFF0F9D58)
        )
        // Text to Display the current Screen
        Text(text = "Whatsup Home", color = Color.Black)
    }
}



@Composable
fun SearchScreen() {
    // Column Composable,
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        // parameters set to place the items in center
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Icon Composable
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "search",
            tint = Color(0xFF0F9D58)
        )
        // Text to Display the current Screen
        Text(text = "You can search anything here", color = Color.Black)
    }
}


@Composable
fun ProfileScreen() {
    // Column Composable,
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        // parameters set to place the items in center
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Icon Composable
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Profile",
            tint = Color(0xFF0F9D58)
        )
        // Text to Display the current Screen
        Text(text = "Profile", color = Color.Black)
    }
}

@Composable
fun Endurance(navController: NavController) {
    LearnLists(navController,listOf("Yo-Yo test","One mile jog test","Balke Vo2 max test","Cooper Vo2 max test"),
        listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
        listOf("person","person","person","person"),"Endurance Tests")
}

@Composable
fun Flexibility() {
    Text(text = "You are in Flexibility Screen", color = Color.Black)
}

@Composable
fun Strength() {
    Text(text = "You are in Strength Screen", color = Color.Black)
}

@Composable
fun Balance() {
    Text(text = "You are in Balance Screen", color = Color.Black)
}

@Composable
fun Speed() {
    Text(text = "You are in Speed Screen", color = Color.Black)
}
