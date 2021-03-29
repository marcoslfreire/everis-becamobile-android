package com.example.nextfilme.api

import com.example.nextfilme.data.model.Filme
import retrofit2.Call
import retrofit2.http.GET

interface FilmesApi {
    @GET("3/trending/all/week?api_key=cf374a4e08777f0fe280289e3204fc8d")
    fun getProductApi(): Call<List<Filme>>
}
