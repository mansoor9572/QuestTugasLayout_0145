package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(R.color.screen_background)
                ) {
                    // Step 2: Added Student data class
                }
            }
        }
    }
}

private data class Student(
    val nameRes: Int,
    val phoneRes: Int,
    val addressRes: Int,
    val backgroundRes: Int,
    val nameColorRes: Int,
    val detailsColorRes: Int
)
