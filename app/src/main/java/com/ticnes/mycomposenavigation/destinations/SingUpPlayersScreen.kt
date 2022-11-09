package com.ticnes.mycomposenavigation.destinations

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.ticnes.mycomposenavigation.data.NavigationItem
import com.ticnes.mycomposenavigation.data.Player

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpPlayersScreen(navController: NavHostController, numPlayers: Int){
    var textoNome06 by remember {mutableStateOf("Breno")}
    var textoNome05 by remember {mutableStateOf("Jofter")}
    var textoNome04 by remember {mutableStateOf("Denzel")}
    var textoNome03 by remember {mutableStateOf("Alex")}
    var textoNome02 by remember {mutableStateOf("Irene")}
    var textoNome01 by remember {mutableStateOf("Real")}

    var textoIdade06 by remember {mutableStateOf("17")}
    var textoIdade05 by remember {mutableStateOf("17")}
    var textoIdade04 by remember {mutableStateOf("18")}
    var textoIdade03 by remember {mutableStateOf("17")}
    var textoIdade02 by remember {mutableStateOf("21")}
    var textoIdade01 by remember {mutableStateOf("22")}

    var textoSexo06 by remember {mutableStateOf("M")}
    var textoSexo05 by remember {mutableStateOf("M")}
    var textoSexo04 by remember {mutableStateOf("M")}
    var textoSexo03 by remember {mutableStateOf("M")}
    var textoSexo02 by remember {mutableStateOf("F")}
    var textoSexo01 by remember {mutableStateOf("M")}

    LazyColumn(modifier= Modifier.fillMaxWidth(1.5f)){
        var ind: Int
        //var listOfPlayers=mutableListOf<Player>()

        //var tempPlayer: Player
        //items(numPlayers){
        items(numPlayers){
                index ->
            ind = index +1
            //Text("Player# $ind")
            // Request player info(nome, idade, sexo)
            when (ind) {
                1 -> { Row(modifier=Modifier.fillMaxWidth(1.5f)){
                    TextField(value = textoNome01,
                        onValueChange = { textoNome01=it },
                        modifier = Modifier.fillMaxWidth(.29f),
                        enabled = true,
                        label = { Text(text = "Nome") })
                    TextField(value = textoIdade01,
                        onValueChange = { textoIdade01=it },
                        modifier = Modifier.fillMaxWidth(.30f),
                        enabled = true,
                        label = { Text(text = "Idade") })
                    TextField(value = textoSexo01,
                        onValueChange = { textoSexo01=it },
                        modifier = Modifier.fillMaxWidth(.41f),
                        enabled = true,
                        label = { Text(text = "Sexo") })

                }
                    // Add Player object to the Players List
                    //tempPlayer(textoNome01)
                    //listOfPlayers.add(Player(textoNome01, textoIdade01, textoSexo01))
                }
                2 -> {Row(modifier=Modifier.fillMaxWidth(1.5f)){
                    TextField(value = textoNome02,
                        onValueChange = { textoNome02=it },
                        modifier = Modifier.fillMaxWidth(.29f),
                        enabled = true,
                        label = { Text(text = "Nome") })
                    TextField(value = textoIdade02,
                        onValueChange = { textoIdade02=it },
                        modifier = Modifier.fillMaxWidth(.30f),
                        enabled = true,
                        label = { Text(text = "Idade") })
                    TextField(value = textoSexo02,
                        onValueChange = { textoSexo02=it },
                        modifier = Modifier.fillMaxWidth(.41f),
                        enabled = true,
                        label = { Text(text = "Sexo") })

                }
                }

                3 -> {Row(modifier=Modifier.fillMaxWidth(1.5f)){
                    TextField(value = textoNome03,
                        onValueChange = { textoNome03=it },
                        modifier = Modifier.fillMaxWidth(.29f),
                        enabled = true,
                        label = { Text(text = "Nome") })
                    TextField(value = textoIdade03,
                        onValueChange = { textoIdade03=it },
                        modifier = Modifier.fillMaxWidth(.30f),
                        enabled = true,
                        label = { Text(text = "Idade") })
                    TextField(value = textoSexo03,
                        onValueChange = { textoSexo03=it },
                        modifier = Modifier.fillMaxWidth(.41f),
                        enabled = true,
                        label = { Text(text = "Sexo") })

                }
                }
                4 -> {Row(modifier=Modifier.fillMaxWidth(1.5f)){
                    TextField(value = textoNome04,
                        onValueChange = { textoNome04=it },
                        modifier = Modifier.fillMaxWidth(.29f),
                        enabled = true,
                        label = { Text(text = "Nome") })
                    TextField(value = textoIdade04,
                        onValueChange = { textoIdade04=it },
                        modifier = Modifier.fillMaxWidth(.30f),
                        enabled = true,
                        label = { Text(text = "Idade") })
                    TextField(value = textoSexo04,
                        onValueChange = { textoSexo04=it },
                        modifier = Modifier.fillMaxWidth(.41f),
                        enabled = true,
                        label = { Text(text = "Sexo") })

                }
                }
                5 -> {Row(modifier=Modifier.fillMaxWidth(1.5f)){
                    TextField(value = textoNome05,
                        onValueChange = { textoNome05=it },
                        modifier = Modifier.fillMaxWidth(.29f),
                        enabled = true,
                        label = { Text(text = "Nome") })
                    TextField(value = textoIdade05,
                        onValueChange = { textoIdade05=it },
                        modifier = Modifier.fillMaxWidth(.30f),
                        enabled = true,
                        label = { Text(text = "Idade") })
                    TextField(value = textoSexo05,
                        onValueChange = { textoSexo05=it },
                        modifier = Modifier.fillMaxWidth(.41f),
                        enabled = true,
                        label = { Text(text = "Sexo") })

                }
                }
                6 -> {Row(modifier=Modifier.fillMaxWidth(1.5f)){
                    TextField(value = textoNome06,
                        onValueChange = { textoNome06=it },
                        modifier = Modifier.fillMaxWidth(.29f),
                        enabled = true,
                        label = { Text(text = "Nome") })
                    TextField(value = textoIdade06,
                        onValueChange = { textoIdade06=it },
                        modifier = Modifier.fillMaxWidth(.30f),
                        enabled = true,
                        label = { Text(text = "Idade") })
                    TextField(value = textoSexo06,
                        onValueChange = { textoSexo06=it },
                        modifier = Modifier.fillMaxWidth(.41f),
                        enabled = true,
                        label = { Text(text = "Sexo") })

                }
                }
            }

        }
        item{
            Button(
                onClick = {navController.navigate(NavigationItem.Players.route)
                }
            ){
                Text("Submeter Registo!")
            }
        }
    }

}

