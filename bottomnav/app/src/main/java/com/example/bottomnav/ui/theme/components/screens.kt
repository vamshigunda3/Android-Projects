package com.example.bottomnav.ui.theme.components

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


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
    val parameters = testListInput(listOf("Yo-Yo test","One mile jog test","Balke Vo2 max test","Cooper Vo2 max test"),
        listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
        listOf("person","person","person","person"),"Endurance Tests",
        listOf(Routes.Endurance.YoYoTest,Routes.Endurance.OneMileJogTest,Routes.Endurance.BalkeTest,Routes.Endurance.CooperTest))
    CategoryScreen(navController,parameters)
//    Text(text = "You are in Endurance Screen", color = Color.Black)
}

@Composable
fun Flexibility(navController: NavController) {
    val parameters = testListInput(listOf("Sit & Reach test","Hip Flexion test","Static shoulder flexibility test","Back Scratch test"),
        listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
        listOf("person","person","person","person"),"Flexibility Tests",
        listOf(Routes.Flexibility.SitReachTest,Routes.Flexibility.HipFlexionTest,Routes.Flexibility.ShoulderFlexibilityTest,Routes.Flexibility.BackScratchTest))
    CategoryScreen(navController,parameters)
}

@Composable
fun Strength(navController: NavController) {
    val parameters = testListInput(listOf("Static Muscular endurance tests","Dynamic muscular endurance test","Elastic Strength test"),
        listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
        listOf("person","person","person",),"Strength Tests", listOf( Routes.Strength.StaticMuscularEnduranceTest,Routes.Strength.DynamicMuscularEnduranceTest,Routes.Strength.ElasticStrengthTest))
    CategoryScreen(navController,parameters)
}

@Composable
fun Balance(navController: NavController) {
    val parameters = testListInput(listOf("Functional Reach Test","Parallel Stance test","Single-Leg stance test","Tandem Stance test"),
        listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
        listOf("person","person","person","person"),"Balance Tests",
        listOf(Routes.Balance.FunctionalReachTest,Routes.Balance.ParallelStanceTest,Routes.Balance.SingleLegStanceTest,Routes.Balance.TandemStanceTest)
    )
    CategoryScreen(navController,parameters)
}

@Composable
fun Speed(navController: NavController) {
    val parameters = testListInput(listOf("10 stride ","30M Acceleration","60M Speed","5-10-5 test"),
        listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
        listOf("person","person","person","person"),"Speed Tests",
        listOf(Routes.Speed.TenMeterStrideTest,Routes.Speed.ThirtyMeterAccTest,Routes.Speed.SixtyMeterSpeedTest,Routes.Speed.FiveTenFiveTest)
    )
    CategoryScreen(navController,parameters)
}


@Preview
@Composable
fun SpeedPreview() {
    val navController = rememberNavController()
    Strength(navController)
}