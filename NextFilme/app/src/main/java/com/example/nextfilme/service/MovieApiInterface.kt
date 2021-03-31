package com.example.nextfilme.service

import com.example.nextfilme.model.MovieRespose
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=cf374a4e08777f0fe280289e3204fc8d")
    fun getMovieList(): Call<MovieRespose>
}