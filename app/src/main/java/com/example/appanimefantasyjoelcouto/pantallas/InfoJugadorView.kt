package com.example.appanimefantasyjoelcouto.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.listaCartas.CrearListaJugadores
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime

@Composable
fun InfoJugadorView(nombre : String, equipo : String, text : String) {

    var fotoDescripcion: Painter = painterResource(id = R.drawable.levi2)
    var listaJugadores : List<JugadorAnime> = CrearListaJugadores()
    Column (modifier = Modifier
        .background(Color.Black)
        .padding(8.dp)
        .verticalScroll(rememberScrollState())){
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(text = nombre + " que juega en " + equipo,
                modifier = Modifier
                    .padding(10.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,)
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            listaJugadores.forEach { jugador ->
                if (jugador.nombre.equals(nombre,ignoreCase = true) ){
                    fotoDescripcion = jugador.fotoDescripcion
                }
            }
            Image(painter = fotoDescripcion,
                contentDescription = "Jugador en su mejor momento",
                modifier = Modifier.size(500.dp)
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(text = text)
        }
    }
}