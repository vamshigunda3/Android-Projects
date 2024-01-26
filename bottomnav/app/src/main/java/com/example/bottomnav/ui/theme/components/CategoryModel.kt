package com.example.bottomnav.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//import androidx.compose.material.CollapsingText


//
//@Composable
//fun LearnLists(navController: NavController,testNameList:List<String>,iconList:List<ImageVector>,iconNameList:List<String>,headerText:String) {
//    Column (
//        modifier = Modifier.padding(8.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) { Text(text = headerText,
//        style = MaterialTheme.typography.h5,
//        modifier = Modifier.padding(16.dp))
//
//    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
//        items(testNameList.size) { index ->
//            Card(
//                    backgroundColor = Color.White,
//                    elevation = 6.dp,
//                    modifier = Modifier.padding(6.dp).fillMaxWidth()
//                ) {
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center,
//                        modifier = Modifier.fillMaxSize()
//                    ) {
//                        Icon(
//                            imageVector = iconList[index],
//                            modifier = Modifier.padding(16.dp).size(60.dp),
//                            contentDescription = iconNameList[index]
//                        )
//                        Text(
//                            text = testNameList[index], style = MaterialTheme.typography.body2,
//                            modifier = Modifier.padding(16.dp),
//                            textAlign = TextAlign.Center,
//                            maxLines = 3,
//                            overflow = TextOverflow.Visible
//                        )
//                    }
//                }
//            }
//        }
//    }
//}

data class testListInput(
    val testNameList: List<String>,
    val iconList: List<ImageVector>,
    val iconNameList: List<String>,
    val headerText: String,
    val route: List<Routes>
)

@Composable
fun TestCard(navController: NavController, testName:String, icon:ImageVector,iconName: String,route:Routes) {
    Card(
        backgroundColor = Color.White,
        elevation = 6.dp,
        modifier = Modifier.padding(6.dp).fillMaxWidth().clickable { navController.navigate(route.route) }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Icon(
                imageVector = icon,
                modifier = Modifier.padding(16.dp).size(60.dp),
                contentDescription = iconName
            )
            Text(
                text = testName,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
                maxLines = 3,
                overflow = TextOverflow.Visible
            )
        }
    }
}

@Composable
fun TestList(navController: NavController,input: testListInput) {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(input.testNameList.size) {index ->
            TestCard(navController,input.testNameList[index],input.iconList[index],input.iconNameList[index],input.route[index])
        }
    }
}


@Composable
fun CategoryScreen(navController: NavController,input:testListInput) {
    Column (modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = input.headerText, style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(16.dp))
        TestList(navController,input)
    }
}