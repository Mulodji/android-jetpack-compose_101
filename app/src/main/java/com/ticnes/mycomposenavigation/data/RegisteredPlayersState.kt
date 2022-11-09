package com.ticnes.mycomposenavigation.data

import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList


data class RegisteredPlayersState(val lista: SnapshotStateList<Player> = mutableStateListOf<Player>() )
