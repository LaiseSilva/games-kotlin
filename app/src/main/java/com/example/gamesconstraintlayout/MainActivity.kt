package com.example.gamesconstraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pesquisar = findViewById<EditText>(R.id.pesquisar)

        pesquisar.setOnClickListener(){

            val intent = Intent(this, CardsActivity::class.java)

            startActivity(intent)
        }

    }


}