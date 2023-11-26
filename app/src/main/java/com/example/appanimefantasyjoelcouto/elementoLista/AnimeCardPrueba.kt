package com.example.appanimefantasyjoelcouto.elementoLista



import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.ui.theme.AppAnimeFantasyJoelCoutoTheme

@Composable
fun AnimeCardPrueba() {
    Card(modifier = Modifier
        .padding(8.dp)
        .clickable { }
        .fillMaxWidth(), elevation = CardDefaults.cardElevation(
        defaultElevation = 8.dp
    ), shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(
                    id = R.drawable.levi
                ),
                contentDescription = "El putisimo amo"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = "Te coje y te raja" +
                            ", Un semental.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "Uno de los heroes de la humanidad.",
                    style = MaterialTheme.typography.bodySmall
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box() {
                        Row {
                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "Te gusta")
                            }
                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "Lo odias")
                            }
                        }
                    }
                    Box() {
                        Row {
                            IconButton(onClick = { /*TODO*/ }) {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        imageVector = Icons.Filled.Favorite,
                                        contentDescription = "Favorito"
                                    )
                                }
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        imageVector = Icons.Filled.Share,
                                        contentDescription = "Compartir"
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAnimeCardPrueba() {
    AppAnimeFantasyJoelCoutoTheme {
        AnimeCardPrueba()
    }
}