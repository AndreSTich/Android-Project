package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroes.R

data class SuperHero (
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

object HeroesRepository {
    val heroes = listOf(
        SuperHero(
            nameRes = R.string.hero1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.android_superhero1
        ),
        SuperHero(
            nameRes = R.string.hero2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.android_superhero2
        ),
        SuperHero(
            nameRes = R.string.hero3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.android_superhero3
        ),
        SuperHero(
            nameRes = R.string.hero4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.android_superhero4
        ),
        SuperHero(
            nameRes = R.string.hero5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.android_superhero5
        ),
        SuperHero(
            nameRes = R.string.hero6,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.android_superhero6
        ),
        SuperHero(
            nameRes = R.string.hero7,
            descriptionRes = R.string.description7,
            imageRes = R.drawable.strange
        ),
        SuperHero(
            nameRes = R.string.hero8,
            descriptionRes = R.string.description8,
            imageRes = R.drawable.hawkeye
        ),
        SuperHero(
            nameRes = R.string.hero9,
            descriptionRes = R.string.description9,
            imageRes = R.drawable.thor
        ),
        SuperHero(
            nameRes = R.string.hero10,
            descriptionRes = R.string.description10,
            imageRes = R.drawable.cap
        ),
        SuperHero(
            nameRes = R.string.hero11,
            descriptionRes = R.string.description11,
            imageRes = R.drawable.iron_man
        ),
        SuperHero(
            nameRes = R.string.hero12,
            descriptionRes = R.string.description12,
            imageRes = R.drawable.widow
        ),
        SuperHero(
            nameRes = R.string.hero13,
            descriptionRes = R.string.description13,
            imageRes = R.drawable.spider_man
        ),
        SuperHero(
            nameRes = R.string.hero14,
            descriptionRes = R.string.description14,
            imageRes = R.drawable.hulk
        ),
        SuperHero(
            nameRes = R.string.hero15,
            descriptionRes = R.string.description15,
            imageRes = R.drawable.panther
        ),
    )
}