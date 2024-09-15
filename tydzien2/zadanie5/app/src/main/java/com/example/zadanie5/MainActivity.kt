package com.example.zadanie5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zadanie5.ui.theme.Zadanie5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zadanie5Theme {
                Login()
            }
        }
    }
}

@Composable
fun Login() {
    val userLogin = "Olivier"
    val userPassword = "chleb123"

    val loginValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val showDialog = remember { mutableStateOf(false) }

    Column(modifier = Modifier
        .padding(horizontal = 30.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .padding(bottom = 20.dp),
            text = "Login",
            style = MaterialTheme.typography.headlineLarge
        )
        TextField(
            value = loginValue.value,
            onValueChange = { newValue -> loginValue.value = newValue},
            label = { Text("Login") },
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
        )
        TextField(
            value = passwordValue.value,
            onValueChange = { newValue -> passwordValue.value = newValue},
            label = { Text("Password") },
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            onClick = {
                if(loginValue.value == userLogin && passwordValue.value == userPassword) {
                    showDialog.value = true
                }
            },
            shape = RoundedCornerShape(size = 4.dp)
        ) {
            Text("Log in")
        }

        if (showDialog.value) {
            ShowAlertDialog(onDismiss = { showDialog.value = false })
        }
    }
}

@Composable
fun ShowAlertDialog(onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Logowanie udane") },
        text = { Text("Witamy!") },
        confirmButton = {
            TextButton(
                onClick = onDismiss
            ) {
                Text("OK")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Zadanie5Theme {
        Login()
    }
}