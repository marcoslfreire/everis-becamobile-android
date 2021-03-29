package com.example.nextfilme.ui.listaFilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nextfilme.R
import com.example.nextfilme.data.model.Filme

class ListaFilmesActivity : AppCompatActivity() {

    private val listFilmes = arrayListOf(
            Filme(
                id = 0,
                titulo = "Titanic",
                descricao = null,
                dataLancamento = null,
            ),
            Filme(
                id = 0,
                titulo = "Titanic",
                descricao = null,
                dataLancamento = null
        )

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}