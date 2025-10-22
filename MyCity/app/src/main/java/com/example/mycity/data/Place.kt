package com.example.mycity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    val id: Int,
    @StringRes val title: Int,
    val rating: Double,
    @DrawableRes val imageRes: Int,
    val category: Categories
)