package com.example.nextfilme.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nextfilme.MovieAdapter
import com.example.nextfilme.R
import com.example.nextfilme.service.MovieApiInterface
import com.example.nextfilme.service.MovieApiService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var movies_list: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_movie_list.layoutManager = LinearLayoutManager(this)
        recycler_movie_list.setHasFixedSize(true)
        getMovieData { movies: List<Movie> ->
            recycler_movie_list.adapter = MovieAdapter(movies)
        }
    }

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





