package com.example.nextfilme.data.model
import com.google.gson.annotations.SerializedName

import android.os.Parcelable

data class Filme (
    val id: Int,
    val titulo: String,
    val imagem: String?,
    val descricao: String?,
    val dataLancamento: String?
): Parcelable