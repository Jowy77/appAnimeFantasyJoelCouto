package com.example.appanimefantasyjoelcouto.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appanimefantasyjoelcouto.pantallas.HomeView
import com.example.appanimefantasyjoelcouto.pantallas.InfoJugadorView
import com.example.appanimefantasyjoelcouto.rutas.Rutas

@Composable
fun GrafoNavegacion(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.HomeView.ruta) {


        composable(Rutas.HomeView.ruta){
            HomeView(navController = navController)
        }
        //"/${jugador.nombre}" + "/${jugador.equipoAnime}" + "/${jugador.text}" + jugador.fotoDescripcion
        composable(Rutas.InfoJugadorView.ruta + "/{nombre}" + "/{equipo}" + "/{texto}"){ llamada ->
            val nombre = llamada.arguments?.getString("nombre")
            val equipo = llamada.arguments?.getString("equipo")
            val texto = llamada.arguments?.getString("texto")
            InfoJugadorView(nombre = nombre.toString(), equipo = equipo.toString(), text = texto.toString())
        }
    }
}