package com.example.onlineshop.repository

import com.example.onlineshop.R
import com.example.onlineshop.model.SliderModel

class MainRepository {
    val banners = mutableListOf(
        SliderModel(
            url = R.drawable.banner1
        ),
        SliderModel(
            url = R.drawable.banner2
        )
    )
}