package com.example.handnote.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = DarkGray,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = DarkGray
)
private val LightColorPalette = lightColors(
    primary = Color.White,
    background = Color.White,
    surface = LightBlue,
    onSurface = Color.White
)
@Composable
fun HandNoteAppTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}