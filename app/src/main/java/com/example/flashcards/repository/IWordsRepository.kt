package com.example.flashcards.repository

import com.example.flashcards.model.local.*

interface IWordsRepository {
    fun saveWord(word: Word)
    fun getWords(): List<UserWord>
    fun getIrregularVerbs(): List<IrregularVerb>
    fun getSimpleWords(): MutableList<SimpleWord>
    fun DeleteWord(id:String)
}