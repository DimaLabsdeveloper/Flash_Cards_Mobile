package com.example.flashcards.model.local

import android.view.Gravity

sealed class Words

data class NewWords(
    val native: String,
    val english: String
) : Words()

data class IrregularWords(
    val frstform: String,
    val secondform : String,
    val thirdform: String,
    val native: String
) : Words()

object None : Words()

