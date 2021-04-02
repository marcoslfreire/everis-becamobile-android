package com.example.nextfilme.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image (
    @SerializedName("id")
    val id: String?,
    @SerializedName("")
    val image:String?,
    @SerializedName("")
    val imageTitle: String?,
    @SerializedName("")
    val imageDetalhes: String?

) : Parcelable {
    constructor() : this("","","","")
}
