package com.example.appanimefantasyjoelcouto.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appanimefantasyjoelcouto.listaCartas.CrearListaJugadores


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NuevoJugadorAnimeView(navController: NavHostController?) {

    var expandirNombre by remember { mutableStateOf(false) }
    var nombreJugador by remember { mutableStateOf("") }
    var sliderValuePuntos by remember { mutableStateOf(0f) }

    var selectedOption by remember { mutableStateOf(0) }

    val listaJugadores = CrearListaJugadores()
    val listaDeNombres: List<String> = listaJugadores.map { it.nombre }


    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(8.dp)
    ) {
        ExposedDropdownMenuBox(
            expanded = expandirNombre,
            onExpandedChange = { expandirNombre = !expandirNombre },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = nombreJugador,
                onValueChange = { },
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text("Selecciona un jugador") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandirNombre) }
            )
            DropdownMenu(
                expanded = expandirNombre,
                onDismissRequest = { expandirNombre = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                listaDeNombres.forEach { nombre ->
                    DropdownMenuItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = { Text(text = nombre) },
                        onClick = {}
                    )
                }
            }
        }
        Text(
            text = "POSOCIONES",
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = selectedOption == 0,
                onClick = { selectedOption = 0 }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "PF")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = selectedOption == 0,
                onClick = { selectedOption = 0 }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "C")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = selectedOption == 0,
                onClick = { selectedOption = 0 }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "PG")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = selectedOption == 0,
                onClick = { selectedOption = 0 }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "SG")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = selectedOption == 0,
                onClick = { selectedOption = 0 }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "SF")
        }

        Row {
            Text(text = "El numero de puntos que metio : ")
            Text(text = sliderValuePuntos.toInt().toString())
        }
        Slider(value = sliderValuePuntos,
            valueRange = 0f..300f,
            onValueChange = { nuevoValor ->
                sliderValuePuntos = nuevoValor
            })
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "El equipo contra el que jugó:")
            TextField(
                value = nombreJugador,
                onValueChange = { },
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text("Selecciona un jugador") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandirNombre) }
            )
            DropdownMenu(
                expanded = expandirNombre,
                onDismissRequest = { expandirNombre = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                listaDeNombres.forEach { nombre ->
                    DropdownMenuItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = { Text(text = nombre) },
                        onClick = {}
                    )
                }
            }
        }
    }
}
