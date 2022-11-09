package com.ticnes.mycomposenavigation.destinations

//import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
//import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
//import androidx.navigation.NavController
import androidx.navigation.NavHostController
//import com.ticnes.mycomposenavigation.Greeting
import com.ticnes.mycomposenavigation.data.NavigationItem
//import com.ticnes.mycomposenavigation.ui.theme.MyComposeNavigationTheme
//import org.intellij.lang.annotations.JdkConstants

@Composable
fun MainScreen(navController: NavHostController){

            Column(modifier= Modifier.fillMaxWidth(1f)
                .fillMaxHeight(1f), horizontalAlignment= CenterHorizontally, verticalArrangement = Arrangement.Center){
                //Text(text="NOVO JOGO", modifier=Modifier.clickable { navController.navigate(NavigationItem.Configuration.route) })
                Button(onClick = { navController.navigate(NavigationItem.Configuration.route) }){
                    Text("NOVO JOGO")
                }

                //Text(text="CONSULTAS DIVERSAS", modifier=Modifier.clickable {navController.navigate(NavigationItem.Players.route)  })
                Button(onClick = { navController.navigate(NavigationItem.Players.route) }){
                    Text("CONSULTAS DIVERSAS")
                }
            }
            /*Button(onClick = ){
                Text("NOVO JOGO")
            }*/

}