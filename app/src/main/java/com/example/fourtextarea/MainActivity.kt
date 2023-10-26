package com.example.fourtextarea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fourtextarea.ui.theme.FourTextAreaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FourTextAreaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingBox()
                }
            }
        }
    }
}

@Composable
fun GreetingBox() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Greeting(
                title = "Text composable",
                text = "Displays text and follows the recommended Material Design guidelines.\n",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Greeting(
                title = "Image composable",
                text = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Greeting(
                title = "Row composable",
                text = "A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Greeting(
                title = "Column composable",
                text = "A layout composable that places its children in a vertical sequence.",
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Greeting(title: String, text: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FourTextAreaTheme {
        GreetingBox()
    }
}