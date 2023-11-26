package com.example.appanimefantasyjoelcouto.listaCartas

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.appanimefantasyjoelcouto.elementoLista.AnimeCard
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime
import com.example.appanimefantasyjoelcouto.ui.theme.AppAnimeFantasyJoelCoutoTheme

@Composable
fun ListaCartasAnime(listaJugadores: List<JugadorAnime>) {

    LazyColumn(){
        items(listaJugadores){Jugador ->
            AnimeCard(jugador = Jugador)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewListaCartasAnime(){
    AppAnimeFantasyJoelCoutoTheme {
        //ListaCartasAnime()
    }
}