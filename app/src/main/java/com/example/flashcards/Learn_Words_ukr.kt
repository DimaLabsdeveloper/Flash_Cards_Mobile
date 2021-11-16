package com.example.flashcards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import io.realm.Realm
import io.realm.RealmConfiguration

class Learn_Words_ukr : AppCompatActivity() {
    val realm by lazy{ Realm.getDefaultInstance()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_words_ukr)
        Realm.init(this)
        val config = RealmConfiguration.Builder()
            .allowWritesOnUiThread(true)
            .name("words.realm").build()


        Realm.setDefaultConfiguration(config)
    }

    fun menu(view: android.view.View) {
        val menu = Intent(this, Menu_ukr::class.java)
        startActivity(menu)
    }
    open var id:Int =0;
    fun next(view: android.view.View) {
        try {
        id =+1;
        var en_word = findViewById<TextView>(R.id.enWord)
        en_word.setVisibility(View.VISIBLE)

    val words = realm.where(Word::class.java).greaterThanOrEqualTo("id",1).findAll()
        words.forEach{word ->
            en_word.text = word.en_word

        }
        } catch (e: Exception) {
            val error = Toast.makeText(applicationContext, "Виникла якась помилка!", Toast.LENGTH_SHORT)
            error.show()
        }
    }
    fun ShowUkrWord(view: android.view.View) {
        try {
        var ukr_word = findViewById<TextView>(R.id.ukrWord)
        val words = realm.where(Word::class.java).findAll()
        words.forEach{word ->
            ukr_word.text = word.ukr_word

        }
    } catch (e: Exception) {
        val error = Toast.makeText(applicationContext, "Виникла якась помилка!", Toast.LENGTH_SHORT)
        error.show()
    }
    }
    }
