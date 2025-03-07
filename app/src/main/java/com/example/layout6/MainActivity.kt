package com.example.layout6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lauout6()
        }
    }
}

@Composable
fun Lauout6() {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(16.dp).fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row {
                Image(
                    painter = painterResource(id = android.R.drawable.ic_menu_gallery),
                    contentDescription = "Book Cover",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text("The Silkworm", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text("Robert Galbraith", fontSize = 14.sp, color = Color.Gray)
                    Text("June 19, 2014", fontSize = 12.sp, color = Color.Gray)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text("READ", color = Color.White)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("4.0", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
                    Text("Rating")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Mystery & Thriller")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Similar")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text("O investigador particular Cormoran Strike retorna em um novo mistério de Robert Galbraith, autor do best-seller internacional # 1 O Chamado do Cuco.")

            Spacer(modifier = Modifier.height(8.dp))

            TextButton(onClick = {}) {
                Text("READ MORE", color = Color.Blue)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBookReviewCard() {
    Lauout6()
}