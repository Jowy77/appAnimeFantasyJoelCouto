package com.example.appanimefantasyjoelcouto.pantallas


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.elementoLista.AnimeCard
import com.example.appanimefantasyjoelcouto.listaCartas.CrearListaJugadores
import com.example.appanimefantasyjoelcouto.listaCartas.ListaCartasAnime
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
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "BIENVENIDOS AL ANIME FANTASY LEAGUE",
            modifier = Modifier.padding(10.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold)

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
                        onClick = { /*TODO*/ },
                        modifier = Modifier.padding(4.dp)
                        ) { Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier.padding(3.dp))}},
                            modifier = Modifier.fillMaxWidth())
            {
                val jugadoresAnimeFiltrados = listaJugadores.filter { it.nombre.contains(query, ignoreCase = true)}

                LazyColumn(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                ){
                    items(jugadoresAnimeFiltrados){jugador -> ListaDeJugadorAnime(jugadorAnime = jugador)}
                }
            }
        val jugadoresAnimeFiltrados = listaJugadores.filter { it.nombre.contains(query, ignoreCase = true)}

        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
        ){
            items(jugadoresAnimeFiltrados){jugador -> AnimeCard(jugador = jugador)}
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
