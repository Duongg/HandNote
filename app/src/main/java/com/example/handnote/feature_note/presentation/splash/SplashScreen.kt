package com.example.handnote.feature_note.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.handnote.feature_note.presentation.util.Screen
import com.example.handnote.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = Unit){
        delay(2000)
        navController.popBackStack()
        navController.navigate(Screen.NotesScreen.route)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(128.dp,128.dp),
            painter = painterResource(id = R.drawable.note_logo),
            contentDescription = "",
            alignment = Alignment.Center
        )
        Text(
            textAlign = TextAlign.Center,
            style = TextStyle(
                color = Color(0xFF0FC9F6),
                fontSize = 36.sp,
                fontWeight = FontWeight.W600,
                fontFamily = FontFamily.Monospace,
            ),
            text = "Hand Note"
        )
    }
}

@Preview
@Composable
fun PreviewSplashScreen(){
    SplashScreen(navController = rememberNavController())
}