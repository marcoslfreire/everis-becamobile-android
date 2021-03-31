package com.example.nextfilme.service

import com.example.nextfilme.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface{
    @GET("/movie/popular?api_key=cf374a4e08777f0fe280289e3204fc8d")
    fun getMovieList(): Call<MovieResponse>
}