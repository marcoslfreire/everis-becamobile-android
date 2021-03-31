package com.example.nextfilme.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nextfilme.R
import com.example.nextfilme.service.MovieApiInterface
import com.example.nextfilme.service.MovieApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)}

    private fun getMovieData(callback: (List<Movie>) -> Unit){
        val apiService = MovieApiService.getInstance.create(MovieApiInterface::class.java)
        apiService.getMovieList().enqueue(object : Callback<MovieRespose> {

            override fun onFailure(call: Call<MovieRespose>, t: Throwable) {

            }

            override fun onResponse(call: Call<MovieRespose>, response: Response<MovieRespose>) {
                return callback(response.body()!!.movies)

            }

        })

    }
}







