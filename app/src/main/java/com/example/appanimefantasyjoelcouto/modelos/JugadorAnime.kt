package com.example.appanimefantasyjoelcouto.modelos

import androidx.compose.ui.graphics.painter.Painter

data class JugadorAnime(
    val nombre: String,
    var foto: Painter,
    var equipoAnime: String,
    val posiciones : List<String>,
    var puntos: String,
    var equipoRival: String,
    var fechaPartido: String
    )