package com.example.nextfilme.ui.listaFilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.nextfilme.R
import com.example.nextfilme.data.model.Filme

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.ListFilme)
    }
}




