package com.gema.latihan_wisata_bukittinggi.model

data class modelWisata(
    var image : Int,
    var nama : String,
    var daerah : String,
    var deskripsi : String,
    val latitude: Double,
    val longitude: Double
)
