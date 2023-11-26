package com.example.appanimefantasyjoelcouto.listaCartas

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime

@Composable
fun CrearListaJugadores(): List<JugadorAnime> {

    val listaPosiciones = listOf<String>("PG","SG","SF","PF","C")

    val listaJugadores = listOf<JugadorAnime>(
        JugadorAnime(
            "Levi Ackerman",
            painterResource(id = R.drawable.levi),
            "Shingeki no Basket",
            listaPosiciones,
            "40",
            "Bleach United",
            "1/02/2023"
        ), JugadorAnime(
            "Edward Elrich",
            painterResource(id = R.drawable.edward),
            "FullMetal Team",
            listaPosiciones,
            "25",
            "Shingeki no Basket",
            "11/03/2023"
        ), JugadorAnime(
            "Eren Jaeger",
            painterResource(id = R.drawable.eren),
            "Shingeki no Basket",
            listaPosiciones,
            "26",
            "FullMetal Team",
            "15/05/2023"
        ), JugadorAnime(
            "Ichigo",
            painterResource(id = R.drawable.ichigo),
            "Bleach United",
            listaPosiciones,
            "23",
            "One Piece Stars",
            "20/06/2023"
        ), JugadorAnime(
            "Monkey D. Luffy",
            painterResource(id = R.drawable.luffy),
            "One Piece Stars",
            listaPosiciones,
            "40",
            "FullMetal Team",
            "09/07/2023"
        ), JugadorAnime(
            "Roy Mustang",
            painterResource(id = R.drawable.mustang),
            "FullMetal Team",
            listaPosiciones,
            "43",
            "Shingeki no Basket",
            "04/08/2023"
        ), JugadorAnime(
            "Sukuna, King of Curses",
            painterResource(id = R.drawable.sukuna),
            "Jujutsu Basket Club",
            listaPosiciones,
            "45",
            "One Piece Stars",
            "20/05/2023"
        ), JugadorAnime(
            "Toji Zennin",
            painterResource(id = R.drawable.toji),
            "Jujutsu Basket Club",
            listaPosiciones,
            "60",
            "FullMetal Team",
            "14/09/2023"
        ), JugadorAnime(
            "Ulquiorra",
            painterResource(id = R.drawable.ulquiorra),
            "Bleach United",
            listaPosiciones,
            "34",
            "Jujutsu Basket Club",
            "17/08/2023"
        ), JugadorAnime(
            "Roronoa Zoro",
            painterResource(id = R.drawable.zoro),
            "One Piece Stars",
            listaPosiciones,
            "50",
            "Bleach United",
            "21/04/2023"
        )

    )

    return listaJugadores;

}