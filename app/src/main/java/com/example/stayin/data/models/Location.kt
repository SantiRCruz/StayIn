package com.example.stayin.data.models


data class Location(
    val title: String,
    val subTitle: String,
    val image:Int,
    val color:GradientLocation
)

enum class GradientLocation(){
    ORANGE,
    BLUE,
    GREEN,
    YELLOW,
    RED,
}
