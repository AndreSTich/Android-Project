package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.app30days.R

data class Quote(
    @DrawableRes val imageId: Int,
    @StringRes val author: Int,
    @StringRes val content: Int,
    val number: Int
)

val quotes = listOf(
    Quote(R.drawable.phil1, R.string.author1,  R.string.content1, 1),
    Quote(R.drawable.phil2, R.string.author2,  R.string.content2, 2),
    Quote(R.drawable.phil3, R.string.author3,  R.string.content3, 3),
    Quote(R.drawable.phil4, R.string.author4,  R.string.content4, 4),
    Quote(R.drawable.phil5, R.string.author5,  R.string.content5, 5),
    Quote(R.drawable.phil6, R.string.author6,  R.string.content6, 6),
    Quote(R.drawable.phil7, R.string.author7,  R.string.content7, 7),
    Quote(R.drawable.phil8, R.string.author8,  R.string.content8, 8),
    Quote(R.drawable.phil9, R.string.author9,  R.string.content9, 9),
    Quote(R.drawable.phil10, R.string.author10,  R.string.content10, 10),
    Quote(R.drawable.phil11, R.string.author11,  R.string.content11, 11),
    Quote(R.drawable.phil12, R.string.author12, R.string.content12, 12),
    Quote(R.drawable.phil13, R.string.author13,  R.string.content13, 13),
    Quote(R.drawable.phil14, R.string.author14,  R.string.content14, 14),
    Quote(R.drawable.phil15, R.string.author15,  R.string.content15, 15),
    Quote(R.drawable.phil16, R.string.author16,  R.string.content16, 16),
    Quote(R.drawable.phil17, R.string.author17,  R.string.content17, 17),
    Quote(R.drawable.phil18, R.string.author18,  R.string.content18, 18),
    Quote(R.drawable.phil19, R.string.author19,  R.string.content19, 19),
    Quote(R.drawable.phil20, R.string.author20,  R.string.content20, 20),
    Quote(R.drawable.phil21, R.string.author21,  R.string.content21, 21),
    Quote(R.drawable.phil22, R.string.author22,  R.string.content22, 22),
    Quote(R.drawable.phil23, R.string.author23,  R.string.content23, 23),
    Quote(R.drawable.phil24, R.string.author24,  R.string.content24,24),
    Quote(R.drawable.phil25, R.string.author25,  R.string.content25, 25),
    Quote(R.drawable.phil26, R.string.author26,  R.string.content26, 26),
    Quote(R.drawable.phil27, R.string.author27,  R.string.content27, 27),
    Quote(R.drawable.phil28, R.string.author28, R.string.content28,28),
    Quote(R.drawable.phil29, R.string.author29, R.string.content29,29),
    Quote(R.drawable.phil30, R.string.author30,  R.string.content30,30)
)