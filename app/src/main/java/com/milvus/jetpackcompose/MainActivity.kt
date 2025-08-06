package com.milvus.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val fontFamily = FontFamily(Font(R.font.mozilla_headline_old))
        setContent {

            ColorBox(Modifier
                .fillMaxSize()
                .padding(20.dp))
        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier= Modifier
){
    val color= remember{mutableStateOf(
        Color.Red)
    }


    Box(modifier=modifier
        .background(color.value)
        .clickable(){
            color.value=Color(
                red = kotlin.random.Random.nextFloat(),
                green = kotlin.random.Random.nextFloat(),
                blue = kotlin.random.Random.nextFloat(),
                alpha = 1f
            )

        })
}
