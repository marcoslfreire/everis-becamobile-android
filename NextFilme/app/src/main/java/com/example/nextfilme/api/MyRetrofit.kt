package com.example.nextfilme.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MyRetrofit {

    private val retrofit: Retrofit
    fun filmeApi(): FilmesApi{
        return retrofit.create(FilmesApi::class.java)
    }

    companion object{
        const val BASE_URL = "https://api.themoviedb.org/"

        var myRetrofit: MyRetrofit? = null

        @get:Synchronized
        val instance: MyRetrofit
        get() {
            if (myRetrofit == null){
                myRetrofit = MyRetrofit()
            }
            return myRetrofit as MyRetrofit
        }
    }

    init {
        retrofit= Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}