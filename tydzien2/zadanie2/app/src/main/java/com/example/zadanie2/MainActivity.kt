package com.example.zadanie2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.zadanie2.ui.theme.Zadanie2Theme
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductList()
        }
    }
}

@Composable
fun ProductList() {
    val products = listOf(
        "Laptop",
        "Smartphone",
        "TV",
        "Headphones",
        "Keyboard",
        "Computer Mouse",
        "Gaming Console",
        "Tablet",
        "Bluetooth Speaker",
        "Smartwatch"
    )

    LazyColumn(modifier = Modifier
        .systemBarsPadding()
    ) {
        items(products) {product ->
            Text(
                text = product,
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Zadanie2Theme {
        ProductList()
    }
}