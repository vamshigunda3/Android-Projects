package com.example.bottomnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bottomnav.ui.theme.BottomnavTheme
import com.example.bottomnav.ui.theme.Utils.Constants
import com.example.bottomnav.ui.theme.components.*
import com.example.bottomnav.ui.theme.models.mainScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomnavTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) { Scaffold(
                    // Bottom navigation
                    bottomBar = {
                        BottomNavigationBar(navController = navController)
                    }, content = { padding ->
                        // Navhost: where screens are placed
                        NavHostContainer(navController = navController, padding = padding)
                    }
                )}
            }
        }
    }
}

@Composable
fun NavHostContainer(navController: NavHostController, padding: PaddingValues) {

    NavHost(navController = navController,

        // set the start destination as home
        startDestination = "home",

        // Set the padding provided by scaffold
        modifier = Modifier.padding(paddingValues = padding),

        builder = {
            // route : Home
            composable("home") {
               mainScreen(navController)
            }

            // route : search
            composable("search") {
                SearchScreen()
            }

            // route : profile
            composable("profile") {
                ProfileScreen()
            }

            // route : team
            composable("team") {
                TeamScreen()
            }
            // progress
            composable("progress") { Endurance(navController) }

            composable(Routes.Endurance.route) { Endurance(navController) }
            composable(Routes.Endurance.YoYoTest.route) { YoYoTest() }
            composable(Routes.Endurance.OneMileJogTest.route) {
                OneMileJogTest()
            }
            composable(Routes.Endurance.BalkeTest.route) {
                BalkeTest()
            }
            composable(Routes.Endurance.CooperTest.route) {
                CooperTest()
            }

            composable(Routes.Flexibility.route) {
                Flexibility(navController)
            }
            composable(Routes.Flexibility.SitReachTest.route) {
                SitReachTest()
            }
            composable(Routes.Flexibility.HipFlexionTest.route) {
                HipFlexionTest()
            }
            composable(Routes.Flexibility.BackScratchTest.route) {
                BackScratchTest()
            }
            composable(Routes.Flexibility.ShoulderFlexibilityTest.route) {
                ShoulderFlexibiltyTest()
            }

            composable(Routes.Speed.route) {
                Speed(navController)
            }
            composable(Routes.Speed.TenMeterStrideTest.route) {
                TenMeterStrideTest()
            }

            composable(Routes.Speed.ThirtyMeterAccTest.route) {
                ThirtyMeterAccTest()
            }
            composable(Routes.Speed.SixtyMeterSpeedTest.route) {
                SixtyMeterSpeedTest()
            }
            composable(Routes.Speed.FiveTenFiveTest.route) {
                FiveTenFiveTest()
            }




            composable(Routes.Strength.route) {
                Strength(navController)
            }

            composable(Routes.Strength.StaticMuscularEnduranceTest.route) {
                StaticMuscularEnduranceTest()
            }
            composable(Routes.Strength.DynamicMuscularEnduranceTest.route) {
                DynamicMuscularEnduranceTest()
            }
            composable(Routes.Strength.ElasticStrengthTest.route) {
                ElasticStrengthTest()
            }


            composable(Routes.Balance.route) {
                Balance(navController)
            }


            composable(Routes.Balance.FunctionalReachTest.route) {
                FunctionalReachTest()
            }

            composable(Routes.Balance.ParallelStanceTest.route) {
                ParallelStanceTest()
            }

            composable(Routes.Balance.SingleLegStanceTest.route) {
                SingleLegStanceTest()
            }

            composable(Routes.Balance.TandemStanceTest.route) {
               TandemStanceTest()
            }

        }
    )

}




@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation(

        // set background color
        backgroundColor = Color(0xFF006400)
    ) {

        // observe the backstack
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // observe current route to change the icon
        // color,label color when navigated
        val currentRoute = navBackStackEntry?.destination?.route

        // Bottom nav items we declared
        Constants.BottomNavItems.forEach { navItem ->

            // Place the bottom nav items
            BottomNavigationItem(

                // it currentRoute is equal then its selected route
                selected = currentRoute == navItem.route,

                // navigate on click
                onClick = {
                    navController.navigate(navItem.route)
                },

                // Icon of navItem
                icon = {
                    Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                },

                // label
                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = false
            )
        }
    }
}




















@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomnavTheme {
        val navController = rememberNavController()
        Scaffold(
            // Bottom navigation
            bottomBar = {
                BottomNavigationBar(navController = navController)
            }, content = { padding ->
                // Navhost: where screens are placed
                NavHostContainer(navController = navController, padding = padding)
            }
        )
    }
}
