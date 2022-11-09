package com.ticnes.mycomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ticnes.mycomposenavigation.data.NavigationItem
import com.ticnes.mycomposenavigation.destinations.ConfigScreen
import com.ticnes.mycomposenavigation.destinations.MainScreen
import com.ticnes.mycomposenavigation.destinations.PlayersInfoScreen
import com.ticnes.mycomposenavigation.destinations.SignUpPlayersScreen
import com.ticnes.mycomposenavigation.ui.theme.MyComposeNavigationTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeNavigationTheme {
               // var numGamers by remember{ mutableStateOf(0) }
                navController = rememberNavController()
                Navigation(navController)

                // A surface container using the 'background' color from the theme
                /*Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {


                    // Greeting("Android")
                   // MainScreen(navController)
                }*/
            }
        }
    }
}

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController= navController, startDestination = NavigationItem.Home.route) {


        composable(NavigationItem.Configuration.route) {
            ConfigScreen(navController)
        }

        composable(NavigationItem.Home.route) {
            MainScreen(navController)
        }
        composable(NavigationItem.Players.route) {
            PlayersInfoScreen()
        }
        composable(route=NavigationItem.SignUpPlayers.route,
        arguments = listOf(navArgument("id"){
            type=NavType.IntType
        })
        ){
         // This composable function requires to be passed the "numPlayers" argument which is not known before hand !!!
            val valor= it.arguments?.getInt("id")
            if (valor != null) {
                SignUpPlayersScreen(navController = navController, numPlayers =valor)
            }
        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeNavigationTheme {
        Greeting("Android")
    }
}