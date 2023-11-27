package com.example.appanimefantasyjoelcouto.modelos

import androidx.compose.ui.graphics.painter.Painter

data class JugadorAnime(
    val nombre: String,
    val text: String,
    var fotoCard: Painter,
    var fotoDescripcion: Painter,
    var equipoAnime: String,
    val posiciones : List<String>,
    var puntos: String,
    var equipoRival: String,
    var fechaPartido: String
    )