package com.example.thedreamteam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier


class StudentThreeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StudentScreen(
                        profileImageRes = R.drawable.student3,
                        studentName = "John Lei Gacusana",
                        bio = "Dangal greetings! I am an Information Technology student who spends most of my time learning, gaming, and drawing." +
                                " I enjoy exploring technology, solving problems, and leveling up my knowledge.",
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}