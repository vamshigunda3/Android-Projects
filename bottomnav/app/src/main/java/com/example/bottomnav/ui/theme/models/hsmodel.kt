package com.example.bottomnav.ui.theme.models
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.foundation.clickable
import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.foundation.lazy.grid.itemsIndexed
import com.example.bottomnav.ui.theme.components.Routes


@Composable
fun CustomViewfun(navController: NavHostController,route: Routes, title: String,items_icons: List<ImageVector>,items_icons_cd: List<String>,items_test_names: List<String>) {
        Column (modifier = Modifier.background(Color.LightGray).border(width = 1.dp, color = Color.DarkGray).clip(RoundedCornerShape(10.dp)).padding(10.dp).clickable { navController.navigate(route.route) }){
            Text(text = title,fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color.Black, fontStyle = FontStyle.Italic,modifier = Modifier.padding(2.dp).clickable {navController.navigate(route.route)})
            Row (modifier = Modifier.background(Color.LightGray).fillMaxWidth()){
                for (i in items_icons.indices) {
                    Column (modifier = Modifier.border(width = 2.dp, color = Color.DarkGray)
                        .weight(1f).height(150.dp).padding(2.dp)
                        .background(Color.White),
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = items_icons[i],
                            modifier = Modifier.align(Alignment.CenterHorizontally).size(48.dp),
                            contentDescription = items_icons_cd[i]
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = items_test_names[i],
                                fontSize = 12.sp,
                                modifier = Modifier.padding(8.dp),
                                textAlign = TextAlign.Center,
                                style = MaterialTheme.typography.body1
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(2.dp))
        }
}


@Composable
fun mainScreen(navController: NavHostController) {
//    val scrollState = rememberLazyListState()
    Column (modifier = Modifier.fillMaxWidth(1f).verticalScroll(rememberScrollState())) {
        CustomViewfun(navController,Routes.Endurance,"Endurance Tests",
            listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
            listOf("person","person","person","person"), listOf("Yo-Yo test","Yo-Yo test","Yo-Yo test","See All")
        )
        Spacer(modifier = Modifier.width(2.dp))
        CustomViewfun(navController,Routes.Speed,"Speed Tests",
            listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
            listOf("person","person","person","person"), listOf("Stride test","30m Acceleration test","60m speed test","See All")
        )
        Spacer(modifier = Modifier.width(2.dp))
        CustomViewfun(navController,Routes.Strength,"Strength and Power Tests",
            listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
            listOf("person","person","person","person"), listOf("Core strength test","Push-up test","Squat test","See All")
        )
        Spacer(modifier = Modifier.width(2.dp))
        CustomViewfun(navController,Routes.Flexibility,"Mobility and Flexibility Tests",
            listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
            listOf("person","person","person","person"), listOf("Sit & Reach test","Hip flexion test","Static flexibility test","See All")
        )
        Spacer(modifier = Modifier.width(2.dp))
        CustomViewfun(navController,Routes.Balance,"Balance",
            listOf( Icons.Default.Person,Icons.Default.Person,Icons.Default.Person,Icons.Default.Person),
            listOf("person","person","person","person"), listOf("Functional Reach Test","Parallel Stance test","Single leg-stance test","See All"))
    }
}




@Preview
@Composable
fun Customviewpreview() {
//    mainScreen()
}
