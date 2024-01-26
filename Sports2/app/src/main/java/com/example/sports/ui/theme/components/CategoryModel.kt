package com.example.sports.ui.theme.components


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

//import androidx.compose.material.CollapsingText



@Composable
fun LearnLists(navController: NavController,testNameList:List<String>,iconList:List<ImageVector>,iconNameList:List<String>,headerText:String) {
    Column (
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) { Text(text = headerText,
        style = MaterialTheme.typography.h5,
        modifier = Modifier.padding(16.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(testNameList.size) { index ->
                Card(
                    backgroundColor = Color.White,
                    elevation = 4.dp,
                    modifier = Modifier.padding(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = iconList[index],
                            modifier = Modifier.padding(16.dp).size(48.dp),
                            contentDescription = iconNameList[index]
                        )
                        Text(
                            text = testNameList[index], style = MaterialTheme.typography.h6,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}






////@Preview
//@Composable
//fun Screenpreview() {
//    LearnLists()
//}