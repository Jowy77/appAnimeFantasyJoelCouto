package com.example.appanimefantasyjoelcouto.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime

@Composable
fun ListaDeJugadorAnime (jugadorAnime: JugadorAnime) {

    var filaExpandida by remember { mutableStateOf(false) }

    Row (modifier = Modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween){
        Image(painter =painterResource(id = R.drawable.sharingan), contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(8.dp))

        Text(text = jugadorAnime.equipoAnime)
        Icon(imageVector = Icons.Default.Star, contentDescription = null)
    }

}