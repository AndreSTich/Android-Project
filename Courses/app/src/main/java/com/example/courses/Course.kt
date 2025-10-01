package com.example.courses

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course (
    @StringRes val stringResourceId: Int,
    val followers: Int,
    @DrawableRes val imageResourceId: Int
)
