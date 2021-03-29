package com.example.nextfilme.data.model
import android.os.Parcel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Filme(

    @SerializedName("page")
    val page: String,
    @SerializedName("results")
    val results: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("poster_path")
    val poster_path:String,
    @SerializedName("image")
    val image:String,
)