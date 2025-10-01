package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                )
                {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val background = painterResource(R.drawable.card1)
    val image = painterResource(R.drawable.android)
    val font = Font(R.font.amarante)
    Image(
        painter = background,
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
    Column ( modifier = Modifier.padding(top = 110.dp, start = 120.dp)) {
        Text(
            text = "Android",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFD19E52),
            fontFamily = FontFamily(font),
        )
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 18.sp,
            color = Color.Black,
            fontFamily = FontFamily(font)
        )
    }
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .padding(bottom = 110.dp, start = 40.dp)
                .size(230.dp)
        )
    }
    Column(modifier = Modifier.padding(start = 77.dp, top = 520.dp)){
        DataCommunication(icon = Icons.Rounded.Phone, data = stringResource(R.string.phone), title = "Phone")
        DataCommunication(icon = Icons.Rounded.Email, data = stringResource(R.string.email), title = "Email", modifier = Modifier.padding(top=27.dp))
        DataCommunication(icon = Icons.Rounded.Send, data = stringResource(R.string.tg_contact), title = "Telegram", modifier = Modifier.padding(top=27.dp))
    }
}

@Composable
fun DataCommunication(icon: ImageVector, data: String, title: String, modifier: Modifier = Modifier){
    val font = Font(R.font.amarante)
    Row {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFFD19E52),
            modifier = modifier.size(48.dp)
        )
        Column (modifier = Modifier.padding(start = 23.dp)) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontFamily = FontFamily(font),
                modifier = modifier
            )
            Text(
                text = data,
                fontSize = 18.sp,
                color = Color.DarkGray,
                fontFamily = FontFamily(font),
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}