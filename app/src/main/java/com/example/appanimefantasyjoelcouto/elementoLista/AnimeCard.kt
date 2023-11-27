package com.example.appanimefantasyjoelcouto.elementoLista

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime
import com.example.appanimefantasyjoelcouto.rutas.Rutas
import com.example.appanimefantasyjoelcouto.ui.theme.AppAnimeFantasyJoelCoutoTheme

@Composable
fun AnimeCard(jugador : JugadorAnime,navController: NavHostController?){

    val checkedState = remember { mutableStateOf(false) }

    Card(modifier = Modifier
        .size(width = 600.dp, height = 120.dp)
        .padding(4.dp)
        .clickable {
            //header : String, foto : Image, text : String
            navController?.navigate(Rutas.InfoJugadorView.ruta + "/${jugador.nombre}" + "/${jugador.equipoAnime}" + "/${jugador.text}")
        }
        .fillMaxWidth(), elevation = CardDefaults.cardElevation(
        defaultElevation = 8.dp
        ),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(containerColor = Color.Red)
        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement =  Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painter = jugador.fotoCard,
                contentDescription = "PutoAmo",
                modifier = Modifier
                    .fillMaxHeight()
                    .size(120.dp)
                    .weight(2f)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = jugador.nombre,
                    modifier = Modifier
                        .padding(3.dp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "VS ${jugador.equipoRival}, ${jugador.fechaPartido}",
                    modifier = Modifier
                        .padding(3.dp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = jugador.puntos + "PP",
                    modifier = Modifier
                        .padding(3.dp),
                    textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = {checkedState.value = it}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAnimeCard(){
    AppAnimeFantasyJoelCoutoTheme {
        //AnimeCard("Levi Ackerman","Bleach United", "30")
    }
}

