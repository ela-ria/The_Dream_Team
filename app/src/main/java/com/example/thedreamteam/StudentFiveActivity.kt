package com.example.thedreamteam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier

class StudentFiveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StudentScreen(
                        profileImageRes = R.drawable.student5,
                        studentName = "Jay-Em G. Mejia",
                        bio = "Dangal Greetings! I am a currently a student studying Information Technology" +
                                " . My hobby are playing basketball, reading manga, and workout.",
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}