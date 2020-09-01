package com.example.gangame.data

object PriceFormatted {

    private const val FORMAT_PRICE = "%.2f €"

    fun formatTwoDecimal(price: Float) = String.format(FORMAT_PRICE, price)
}

data class Deal(
    var title: String,
    var salePrice: Float,
    var normalPrice: Float,
    var criticScore: Int,
    var steamRating: Int,
    var image: String
) {

    val salePriceFormatted: String
        get() = PriceFormatted.formatTwoDecimal(salePrice)

    val normalPriceFormatted: String
        get() = PriceFormatted.formatTwoDecimal(normalPrice)
}

data class TopGame(
    var title: String,
    var owner: Int,
    var steamRating: Int,
    var companyName: String,
    var price: Float,
    var position: Int,
    var image: String
) {
    val priceFormatted: String
        get() = PriceFormatted.formatTwoDecimal(price)
}