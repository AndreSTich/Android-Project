package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val pictures = listOf(
                        listOf(R.drawable.sun, R.string.title1, R.string.author1),
                        listOf(R.drawable.mona_lisa,R.string.title2, R.string.author2),
                        listOf(R.drawable.gitara, R.string.title3, R.string.author3)
                    )

                    var currentPicture by remember { mutableIntStateOf(0) }
                    ArtSpace(
                        titlePicture = pictures[currentPicture][1],
                        authorPicture = pictures[currentPicture][2],
                        picture = pictures[currentPicture][0],
                        previous = {
                            currentPicture = (currentPicture - 1 + pictures.size) % pictures.size
                        },
                        next = {
                            currentPicture = (currentPicture + 1) % pictures.size
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun ArtSpace(
    @StringRes titlePicture: Int,
    @StringRes authorPicture: Int,
    @DrawableRes picture: Int,
    previous: () -> Unit,
    next: () -> Unit
    ) {
    Column (
        verticalArrangement =Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 80.dp)
    ) {
        Text(
            text = "Art Space",
            fontFamily = FontFamily.Monospace,
            fontSize = 32.sp,
            modifier = Modifier.padding(10.dp)
        )
        Image(
            painter = painterResource(picture),
            contentDescription = null,
            modifier = Modifier
                .size(370.dp)
        )
        Spacer( modifier = Modifier.padding(30.dp) )
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .shadow(5.dp)
                .width(320.dp)
                .padding(25.dp)

        ) {
            Text(
                text = stringResource(titlePicture),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth()
            )
            Text(
                text = stringResource(authorPicture),
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic,
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Spacer( modifier = Modifier.padding(30.dp) )
        Row {
            Button(
                onClick = previous,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(120.dp)
            ) {
                Text(text = "<-", fontSize = 28.sp)
            }
            Spacer( modifier = Modifier.padding(20.dp) )
            Button(
                onClick = next,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(120.dp)
            )
            {
                Text(text = "->", fontSize = 28.sp)
            }
        }
    }
}