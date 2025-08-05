package com.milvus.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Size
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.milvus.jetpackcompose.ui.theme.JetpackComposeTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(1f)
                    .fillMaxWidth(1f)
                    .padding(20.dp, 40.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
                    .border(10.dp, Color.Blue)

            ) {
                Text(
                    "hello",
                    modifier = Modifier
                        .padding(20.dp)
                        .border(5.dp, Color.Black)
                        .padding(15.dp),
                    fontSize = 20.sp,


                    )
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    "hello Man",
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
        }
    }
}




