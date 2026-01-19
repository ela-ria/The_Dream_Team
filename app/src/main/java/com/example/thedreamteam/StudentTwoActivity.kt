package com.example.thedreamteam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier

class StudentTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StudentScreen(
                        profileImageRes = R.drawable.student2,
                        studentName = "Kim Aldrin D. Maurin",
                        bio = "Hi, I am student from Pamantasan ng Cabuyao, taking Bachelor of Science in Information Technology , A curious and motivated person who enjoys learning new things",
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}