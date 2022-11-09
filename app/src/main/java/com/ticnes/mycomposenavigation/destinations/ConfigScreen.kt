package com.ticnes.mycomposenavigation.destinations

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
//import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
//import com.ticnes.mycomposenavigation.data.NavigationItem

//import com.ticnes.mycomposenavigation.ui.theme.MyComposeNavigationTheme


@Composable
fun ConfigScreen(navController: NavHostController){
    Column(modifier= Modifier.fillMaxWidth(1f)
        .fillMaxHeight(1f), horizontalAlignment= Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){

    //var numGamers by remember{ mutableStateOf(0) }
                // 1st Line: Header Line - "NOVO JOGO"
                Text(
                    text= "QUANTOS JOGADORES ?"
                )
                // 4th Line: Available number of players to select
                Row(modifier= Modifier.wrapContentWidth(Alignment.CenterHorizontally)){
                    // Option: 1
                    Button(
                        //onClick = {numGamers=1 }
                        onClick = {navController.navigate("signup/" +1) }
                    ){
                        Text("1")
                    }
                    // Option: 2
                    Button(
                        onClick = {navController.navigate("signup/" +2) }
                    ){
                        Text("2")
                    }
                    // Option: 3
                    Button(
                        onClick = {navController.navigate("signup/" +3)}
                    ){
                        Text("3")
                    }

                }
                Row(modifier= Modifier.wrapContentWidth(Alignment.CenterHorizontally)){
                    // Option: 4
                    Button(
                        onClick = {navController.navigate("signup/" +4) }
                    ){
                        Text("4")
                    }
                    // Option: 5
                    Button(
                        onClick = {navController.navigate("signup/" +5)}
                    ){
                        Text("5")
                    }
                    // Option: 6
                    Button(
                        onClick = {navController.navigate("signup/" +6)}
                    ){
                        Text("6")
                    }
                }
                // Registered Players Data Input
                /*if(numGamers==0){
                    RegisteredPlayersScreen(numGamers, false)
                }else{
                    RegisteredPlayersScreen(numGamers, true)
                }*/
                //RegisteredPlayersScreen(numGamers, true)
                // Last/Bottom Line: "Submeter registo!"
                /*   Button(
                       onClick = { }
                   ){
                       Text("Submeter Registo!")
                   }*/

            }
    // A big button in the middle of the screen

}
