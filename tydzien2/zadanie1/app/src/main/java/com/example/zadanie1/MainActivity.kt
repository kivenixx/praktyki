package com.example.zadanie1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zadanie1.ui.theme.Zadanie1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zadanie1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row {
                            Obraz(imageId = R.drawable.obraz1)
                            Obraz(imageId = R.drawable.obraz2)
                            Obraz(imageId = R.drawable.obraz3)
                        }
                        Row {
                            Obraz(imageId = R.drawable.obraz4)
                            Obraz(imageId = R.drawable.obraz5)
                            Obraz(imageId = R.drawable.obraz6)
                        }
                        Row {
                            Obraz(imageId = R.drawable.obraz7)
                            Obraz(imageId = R.drawable.obraz8)
                            Obraz(imageId = R.drawable.obraz9)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Obraz(imageId: Int) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = null,
        Modifier
            .size(100.dp),
        contentScale = ContentScale.FillBounds
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Zadanie1Theme {

    }
}