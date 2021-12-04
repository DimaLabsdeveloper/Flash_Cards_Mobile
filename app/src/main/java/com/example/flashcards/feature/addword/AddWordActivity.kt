package com.example.flashcards.feature.addword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.flashcards.R
import com.example.flashcards.feature.menu.MenuActivity
import io.realm.Realm
import io.realm.RealmConfiguration

class AddWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_word)
    }



    fun menu(view: android.view.View) {
        val menu = Intent(this, MenuActivity::class.java)
        startActivity(menu);
    }
    public object primarykey1{
        var primarykey = 5

    }

    fun save(view: android.view.View) {
        var ukr_word = findViewById<EditText>(R.id.en_word)
        var en_word = findViewById<EditText>(R.id.en_word)
        if (ukr_word.text.toString() != ""  && en_word.text.toString() != "") {
            try {
                primarykey1.primarykey++


                var ukr_word = findViewById<EditText>(R.id.en_word)
                var en_word = findViewById<EditText>(R.id.en_word)

//                realm.executeTransaction {
//
//                    val word: Word = realm.createObject(Word::class.java, primarykey1.primarykey)
//                    word.nativeWord = ukr_word.text.toString()
//                    word.englishWord =
//
//                        en_word.text.toString()
//                }

                val success = Toast.makeText(applicationContext, "Слово додано!", Toast.LENGTH_SHORT)
                success.show()
            } catch (e: Exception) {
                val error = Toast.makeText(applicationContext, "Виникла якась помилка!", Toast.LENGTH_SHORT)
                error.show()
            }
        }else{
            val error = Toast.makeText(applicationContext, "Заповни пусті поля!", Toast.LENGTH_SHORT)
            error.show()
        }
    }

}