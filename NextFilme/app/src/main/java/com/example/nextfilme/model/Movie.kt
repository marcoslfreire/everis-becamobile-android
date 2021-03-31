package com.example.nextfilme.model
import android.os.Parcel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id: String?,
    @SerializedName("paster_path")
    val image:String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("release_data")
    val release: String?
    ): Parcelable{
        constructor(): this("","","","")
    }