package com.example.fintecha75.model

import java.text.SimpleDateFormat
import java.util.*


class Session {
    lateinit var startSession: String
    lateinit var endSession: String

    private fun getDateSession(): String {
        val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault())
        val nowDateSession: Date = Calendar.getInstance(TimeZone.getTimeZone("UTC")).time

        return formatter.format(nowDateSession)
    }

    fun setStartSession(){
        this.startSession = getDateSession()
    }

    fun setEndTimeSession(){
        this.endSession = getDateSession()
    }
}