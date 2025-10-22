package com.example.mycity.data

import com.example.mycity.R

enum class Categories {
    SIGHT, PARK, CAFE
}
val categories = listOf(
    Category(1, R.string.sight, R.drawable.sight),
    Category(2, R.string.cafe, R.drawable.cafe),
    Category(3, R.string.park, R.drawable.park)
)

val places = listOf(
    Place(1, R.string.sight1, 4.5, R.drawable.sight1, Categories.SIGHT),
    Place(2, R.string.sight2, 4.2, R.drawable.sight2, Categories.SIGHT),
    Place(3, R.string.sight3, 4.7, R.drawable.sight3, Categories.SIGHT),
    Place(4, R.string.cafe1, 4.5, R.drawable.cafe1, Categories.CAFE),
    Place(5, R.string.cafe2, 4.2, R.drawable.cafe2, Categories.CAFE),
    Place(6, R.string.park1, 4.5, R.drawable.park1, Categories.PARK),
    Place(7, R.string.park2, 4.2, R.drawable.park2, Categories.PARK)
)
