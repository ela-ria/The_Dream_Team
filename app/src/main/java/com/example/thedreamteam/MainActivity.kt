package com.example.thedreamteam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FiveButtonsScreen(
                        onButton1Click = {
                            val intent = Intent(this@MainActivity, StudentOneActivity::class.java)
                            startActivity(intent)
                        },
                        onButton2Click = {
                            val intent = Intent(this@MainActivity, StudentTwoActivity::class.java)
                            startActivity(intent)
                        },
                        onButton3Click = {
                            val intent = Intent(this@MainActivity, StudentThreeActivity::class.java)
                            startActivity(intent)
                        },
                        onButton4Click = {
                            val intent = Intent(this@MainActivity, StudentFourActivity::class.java)
                            startActivity(intent)
                        },
                        onButton5Click = {
                            val intent = Intent(this@MainActivity, StudentFiveActivity::class.java)
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FiveButtonsScreen(
    onButton1Click: () -> Unit,
    onButton2Click: () -> Unit,
    onButton3Click: () -> Unit,
    onButton4Click: () -> Unit,
    onButton5Click: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Home") }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(50.dp))


            Text(
                text = "The Dream Team",
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(30.dp))


            val buttonModifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)

            Button(onClick = onButton1Click, modifier = buttonModifier) {
                Text("Bio Screen 1 ")
            }

            Button(onClick = onButton2Click, modifier = buttonModifier) {
                Text("Bio Screen 2")
            }

            Button(onClick = onButton3Click, modifier = buttonModifier) {
                Text("Bio Screen 3")
            }

            Button(onClick = onButton4Click, modifier = buttonModifier) {
                Text("Bio Screen 4")
            }

            Button(onClick = onButton5Click, modifier = buttonModifier) {
                Text("Bio Screen 5")
            }
        }
    }
}
