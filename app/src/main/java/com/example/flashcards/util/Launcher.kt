package com.example.flashcards.util

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity
import com.example.flashcards.feature.main.MainActivity
import com.example.flashcards.feature.menu.MenuActivity
import com.example.flashcards.feature.aboutme.AboutMeActivity
import com.example.flashcards.feature.addword.AddWordActivity
import com.example.flashcards.feature.learnwords.LearnWordsActivity
import com.example.flashcards.notreworked.Irregular_words_ukr
import com.example.flashcards.notreworked.My_words_ukr
import com.example.flashcards.notreworked.Settings_ukr

object Launcher {
    fun startMainActivity(activity: Activity) {
        val intent = Intent(activity, MainActivity::class.java)
        activity.startActivity(intent)
    }

    fun startMenuActivity(activity: Activity) {
        val intent = Intent(activity, MenuActivity::class.java)
        activity.startActivity(intent)
    }

    fun startSettingsActivity(activity: Activity) {
        val settings = Intent(activity, Settings_ukr::class.java)
        activity.startActivity(settings)
    }

    fun startAboutProgramActivity(activity: Activity) {
        val intent = Intent(activity, AboutMeActivity::class.java)
        activity.startActivity(intent)
    }

    fun startIrregularWordsActivity(activity: Activity) {
        val intent = Intent(activity, IrregularWordsActivity::class.java)
        activity.startActivity(intent)
    }

    fun startAddWordActivity(activity: Activity) {
        val intent = Intent(activity, AddWordActivity::class.java)
        activity.startActivity(intent)
    }

    fun startLearnWordsActivity(activity: Activity) {
        val intent = Intent(activity, LearnWordsActivity::class.java)
        activity.startActivity(intent)
    }

    fun startNewWords(activity: Activity) {
        val intent = Intent(activity, NewWords::class.java)
    fun startAddWordActivity(activity: Activity) {
        val intent = Intent(activity, AddWordActivity::class.java)
        activity.startActivity(intent)
    }

    fun startLearnWordsActivity(activity: Activity) {
        val intent = Intent(activity, LearnWordsActivity::class.java)
        activity.startActivity(intent)
    }

    fun startNewWords(activity: Activity) {
        val intent = Intent(activity, com.example.flashcards.notreworked.new_words_ukr::class.java)
        activity.startActivity(intent)
    }

    fun startMyWordsActivity(activity: Activity) {
        val intent = Intent(activity, My_words_ukr::class.java)
        activity.startActivity(intent)
    }
    fun startTelegram(activity: Activity) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/dima8093556548"))
        activity.startActivity(intent)
    }
    fun startGmail(activity: Activity) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:dim4ukt@gmail.com"))
        activity.startActivity(intent)
    }
    fun startYoutube(activity: Activity) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC-nn4RFP16LjaWk8SRs15Pg"))
        activity.startActivity(intent)
    }
}