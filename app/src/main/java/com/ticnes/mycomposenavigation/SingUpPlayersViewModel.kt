package com.ticnes.mycomposenavigation

//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
//import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ticnes.mycomposenavigation.data.Player

class SingUpPlayersViewModel: ViewModel() {
    // Private ViewModel variable
    //private val _elements: MutableState<MutableList<Player>> = mutableStateOf(mutableListOf())
    private val _elements = mutableStateListOf<Player>()//<MutableList<Player>> = mutableStateOf(mutableListOf())
    // Shareable ViewModel variable
    //val elements: State<List<Player>> = _elements
    val elements: List<Player> = _elements


    // ViewModel Functions
    fun submitPlayersInfo(playerInfo: Player){
        // Read input players info, and..
        // Save players input info into app states "Registered Players"
        elements.plus(playerInfo)
    }
}