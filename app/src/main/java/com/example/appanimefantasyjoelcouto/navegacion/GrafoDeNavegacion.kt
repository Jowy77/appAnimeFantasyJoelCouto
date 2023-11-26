package com.example.appanimefantasyjoelcouto.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appanimefantasyjoelcouto.pantallas.HomeView
import com.example.appanimefantasyjoelcouto.rutas.Rutas

@Composable
fun GrafoNavegacion(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.HomeView.ruta) {


        composable(Rutas.HomeView.ruta){
            HomeView(navController = navController)
        }

    }
}