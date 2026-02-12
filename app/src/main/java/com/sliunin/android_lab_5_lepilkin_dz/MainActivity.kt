package com.sliunin.android_lab_5_lepilkin_dz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Spacer(modifier = Modifier.height(100.dp))
                Title()
                Spacer(modifier = Modifier.height(100.dp))
                Squares()
                Spacer(modifier = Modifier.height(100.dp))
                TwoColumns()
            }
        }
    }
}

@Composable
fun Title() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Пример Compose-приложения",
                letterSpacing = 5.sp
            )
            Text(
                text = "Row, Column, Size, ARGB",
                letterSpacing = 5.sp
            )
        }
    }
}

@Composable
fun Squares() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xAAFF0000))
        )
        Spacer(modifier = Modifier.width(15.dp))
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF0000FF))
        )
        Spacer(modifier = Modifier.width(15.dp))
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF00FF00))
        )
    }
}

@Composable
fun TwoColumns() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Левая колонка",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Текст 1",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Правая колонка",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Текст 2",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
    }
}