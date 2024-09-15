package com.example.koordi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.koordi.ui.theme.KoordiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoordiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KoordiTheme {
        Greeting("Android")
    }
    fun startScreen() {
        println("Willkommen in der Tennisschule App!")
        println("1. Kind erstellen")
        println("2. Gruppen anzeigen")
        println("3. Warteliste anzeigen")
        println("Bitte wählen Sie eine Option:")

        when (readLine()) {
            "1" -> kinderErstellenScreen()
            "2" -> gruppenAnzeigen()
            "3" -> wartelisteAnzeigen()
            else -> println("Ungültige Eingabe. Bitte versuchen Sie es erneut.")
        }
    }

}