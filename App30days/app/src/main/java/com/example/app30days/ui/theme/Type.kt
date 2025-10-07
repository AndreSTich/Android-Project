package com.example.app30days.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.sp
import com.example.app30days.R

val PlayDisplay = FontFamily(
    Font(R.font.playfairdisplay_bolditalic, Bold),
    Font(R.font.playfairdisplay_italic)
)

val PlayWrite = FontFamily(
    Font(R.font.playwrite_regular)
)

val Typography = Typography(
    bodyMedium = TextStyle(
        fontFamily = PlayDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontFamily = PlayDisplay,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = PlayWrite,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    )
)