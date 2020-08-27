package com.example.gangame.data

data class Deal(
    var title: String,
    var salePrice: Float,
    var normalPrice: Float,
    var criticScore: Int,
    var steamRating: Int,
    var image: String
)

data class TopGame(
    var title: String,
    var owner: Int,
    var steamRating: Int,
    var companyName: String,
    var price: Float,
    var position: Int,
    var image: String
)