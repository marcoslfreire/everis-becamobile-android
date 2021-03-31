package com.example.nextfilme.model

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>

) : Parcelize{
    constructor() : this (mutableListOf())
}


