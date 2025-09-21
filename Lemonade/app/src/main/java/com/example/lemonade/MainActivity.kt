package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun LemonadeApp() {
    Row(
        horizontalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Lemonade",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(top = 40.dp, bottom = 20.dp)
        )
    }
    LemonadeButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun LemonadeButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(0) }
    result = result % 4
    var squeeze_lemon = 0
    val imageResource = when (result) {
        0 -> R.drawable.lemon_tree
        1 -> R.drawable.lemon_squeeze
        2 -> R.drawable.lemon_drink
        3 -> R.drawable.lemon_restart
        else -> R.drawable.pechalka
    }
    val stringResource = when (result) {
        0 -> R.string.lemon_tree
        1 -> R.string.lemon
        2 -> R.string.glass_of_lemonade
        3 -> R.string.empty_glass
        else -> R.string.sorry
    }
    if (result == 1) {
        squeeze_lemon = (0..2).random()
    }
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = {
                if (squeeze_lemon == 0) {
                    result++
                } else {
                    squeeze_lemon--
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF11eed4),
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = result.toString(),
                modifier = Modifier
                    .size(150.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = stringResource(stringResource),
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
    }

}