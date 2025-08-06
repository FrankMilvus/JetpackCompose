package com.milvus.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val fontFamily = FontFamily(Font(R.font.mozilla_headline_old))
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                Color.Green,
                                55.sp
                            )
                        ){
                            append("J")
                        }
                        append("etpack")

                        withStyle(
                            SpanStyle(
                                Color.Green,
                                55.sp
                            )
                        ){
                            append("C")
                        }
                        append("ompose")
                    },

                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    textDecoration = TextDecoration.LineThrough
                )


            }
        }
    }
}
