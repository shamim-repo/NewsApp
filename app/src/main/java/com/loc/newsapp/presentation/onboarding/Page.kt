package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)

val pages = listOf(
    Page(
        title = "Simple Title One",
        description = "Simple description Simple description Simple description Simple description Simple description Simple description Simple description Simple description.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Simple Title Tow",
        description = "Simple description Simple description Simple description Simple description Simple description Simple description Simple description Simple description.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Simple Title Three",
        description = "Simple description Simple description Simple description Simple description Simple description Simple description Simple description Simple description.",
        image = R.drawable.onboarding3
    )
)