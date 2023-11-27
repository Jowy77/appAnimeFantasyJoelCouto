package com.example.appanimefantasyjoelcouto.pantallas


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.elementoLista.AnimeCard
import com.example.appanimefantasyjoelcouto.listaCartas.CrearListaJugadores
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime
import com.example.appanimefantasyjoelcouto.ui.theme.AppAnimeFantasyJoelCoutoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavHostController?) {
    
    var listaJugadores : List<JugadorAnime> = CrearListaJugadores()
    val context = LocalContext.current
    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "BIENVENIDOS AL ANIME FANTASY LEAGUE",
            modifier = Modifier
                .padding(10.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.Black,
            fontStyle = FontStyle.Italic
            )

            androidx.compose.material3.SearchBar(
                query = query,
                onQueryChange = {query = it},
                onSearch = {active = false},
                active = active,
                onActiveChange = {active = it},
                placeholder = { Text(text = "Search")},
                leadingIcon = {
                    IconButton(
                        onClick = {},
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Icon(
                            painterResource(id = R.drawable.sharingan),
                            contentDescription = null,
                            modifier = Modifier.padding(3.dp)) }
                },
                trailingIcon = {
                    IconButton(
                        onClick = {
                            val jugadoresAnimeFiltrados = listaJugadores.filter { it.equipoAnime.contains(query, ignoreCase = true)}

                            jugadoresAnimeFiltrados.forEach { jugador ->
                                query = jugador.equipoAnime
                                active = false
                            }
                        },
                        modifier = Modifier.padding(4.dp)
                        ) { Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier.padding(3.dp))}},
                            modifier = Modifier.fillMaxWidth()
            )
            {
                val jugadoresAnimeFiltrados = listaJugadores.filter { it.equipoAnime.contains(query, ignoreCase = true)}

                LazyColumn(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                ){
                    items(jugadoresAnimeFiltrados) { jugador ->
                        Row (modifier = Modifier
                            .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Image(painter =painterResource(id = R.drawable.sharingan), contentDescription = null,
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(8.dp))

                            Text(
                                text = "${jugador.equipoAnime}",
                                modifier = Modifier
                                    .padding(16.dp)
                                    .clickable {
                                        query = "${jugador.equipoAnime}"
                                        active = false
                                    }
                            )
                            Icon(imageVector = Icons.Default.Star, contentDescription = null)
                        }
                    }
                }

            }
        val jugadoresAnimeFiltrados = listaJugadores.filter { it.equipoAnime.contains(query, ignoreCase = true)}

        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        ){
            items(jugadoresAnimeFiltrados){jugador -> AnimeCard(jugador = jugador, navController)}
        }
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement =  Arrangement.SpaceBetween
        ) {
            ExtendedFloatingActionButton(
                onClick = {
                    Toast.makeText(context, "AÑADIR AUN POR IMPLEMENTAR,PROXIMAMENTE!!!",Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .padding(8.dp),
            ) {
                Text(
                    text = "ADD",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp),
                )
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "ADD",
                    tint = Color.Red,
                    modifier = Modifier.padding(8.dp)
                )
            }
            ExtendedFloatingActionButton(
                onClick = {
                          Toast.makeText(context, "ELIMINAR AUN POR IMPLEMENTAR,PROXIMAMENTE!!!",Toast.LENGTH_SHORT).show()
                          },
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(
                    text = "DELETE",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp),
                )
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "DELETE",
                    tint = Color.Blue,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHomeView(){
    AppAnimeFantasyJoelCoutoTheme {
        HomeView(navController = null)
    }
}
