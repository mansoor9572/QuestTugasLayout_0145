package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(R.color.screen_background)
                ) {
                    StudentScreen()
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

@Composable
private fun StudentScreen() {
    val students = listOf(
        Student(
            R.string.student1_name,
            R.string.student1_phone,
            R.string.student1_address,
            R.color.student_gray,
            R.color.student_details_yellow,
            R.color.student_details_yellow
        ),
        Student(
            R.string.student2_name,
            R.string.student2_phone,
            R.string.student2_address,
            R.color.student_purple,
            R.color.student_name_white,
            R.color.student_details_white
        ),
        Student(
            R.string.student3_name,
            R.string.student3_phone,
            R.string.student3_address,
            R.color.student_blue,
            R.color.student_name_white,
            R.color.student_details_white
        ),
        Student(
            R.string.student4_name,
            R.string.student4_phone,
            R.string.student4_address,
            R.color.student_green,
            R.color.student_name_white,
            R.color.student_details_white
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.screen_title),
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = stringResource(R.string.university_name),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(18.dp))
    }
}
