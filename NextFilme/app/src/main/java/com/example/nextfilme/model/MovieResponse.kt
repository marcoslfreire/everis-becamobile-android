package com.example.nextfilme.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize

data class MovieRespose(
    @SerializedName("results")
    val movies: List<Movie> = mutableListOf<Movie>()
) : Parcelable


