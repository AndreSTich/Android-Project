package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    Quadrant(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Block(title: String, text: String, color: Color, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.fillMaxWidth()) {
        Row (modifier = Modifier.weight(1f)) {
            Block(
                title = stringResource(R.string.title_1),
                text = stringResource(R.string.description_1),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Block(
                title = stringResource(R.string.title_2),
                text = stringResource(R.string.description_2),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (modifier = Modifier.weight(1f)) {
            Block(
                title = stringResource(R.string.title_3),
                text = stringResource(R.string.description_3),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Block(
                title = stringResource(R.string.title_4),
                text = stringResource(R.string.description_4),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}