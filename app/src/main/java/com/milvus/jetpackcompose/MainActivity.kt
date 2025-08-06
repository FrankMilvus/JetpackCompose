package com.milvus.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val fontFamily = FontFamily(Font(R.font.mozilla_headline_old))
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(
                        Color.Blue
                    )
                }

                ColorBox(
                    Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    color.value = it
                }
                Box(
                    modifier = Modifier
                        .background(color.value)
                        .weight(1f)
                        .fillMaxSize()
                )
            }

        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {


    Box(
        modifier = modifier
            .background(Color.Red)
            .clickable() {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        alpha = 1f
                    )
                )

            })
}
