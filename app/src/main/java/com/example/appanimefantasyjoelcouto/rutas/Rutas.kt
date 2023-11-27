package com.example.appanimefantasyjoelcouto.rutas

sealed class Rutas(val ruta: String) {

    object HomeView : Rutas("homeview")
    object InfoJugadorView : Rutas("infojugadorview")
    object NuevoJugadorAnimeView : Rutas("nuevojugadoranimeview")
}