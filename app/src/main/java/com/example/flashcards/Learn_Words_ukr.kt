package com.example.flashcards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Learn_Words_ukr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_words_ukr)
    }

    fun menu(view: android.view.View) {
        val menu = Intent(this, Menu_ukr::class.java)
        startActivity(menu);
    }
}