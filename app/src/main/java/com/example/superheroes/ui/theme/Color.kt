package com.example.superheroes.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

// Light Theme Colors
val LightColors = lightColorScheme(
    primary = Color(0xFF6200EE),  // Vibrant Purple
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD0BCFF),
    onPrimaryContainer = Color(0xFF000000),
    secondary = Color(0xFF03DAC6),  // Teal
    onSecondary = Color(0xFF000000),
    secondaryContainer = Color(0xFF00B4A2),
    onSecondaryContainer = Color(0xFF000000),
    tertiary = Color(0xFFFFB300),  // Amber
    onTertiary = Color(0xFF000000),
    tertiaryContainer = Color(0xFFFFD140),
    onTertiaryContainer = Color(0xFF000000),
    error = Color(0xFFB00020),  // Error color
    errorContainer = Color(0xFFFCD8DF),
    onError = Color(0xFFFFFFFF),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFF000000),  // Black background
    onBackground = Color(0xFFFFFFFF),  // White text on black background
    surface = Color(0xFF121212),
    onSurface = Color(0xFFE4E1E6),
    surfaceVariant = Color(0xFF49454F),
    onSurfaceVariant = Color(0xFFE7E0EC)
)

// Dark Theme Colors
val DarkColors = darkColorScheme(
    primary = Color(0xFFD0BCFF),
    onPrimary = Color(0xFF3700B3),
    primaryContainer = Color(0xFF4F378B),
    onPrimaryContainer = Color(0xFFEADDFF),
    secondary = Color(0xFF018786),
    onSecondary = Color(0xFF03DAC6),
    secondaryContainer = Color(0xFF03DAC6),
    onSecondaryContainer = Color(0xFF005047),
    tertiary = Color(0xFFFFB300),
    onTertiary = Color(0xFFC66900),
    tertiaryContainer = Color(0xFFC66900),
    onTertiaryContainer = Color(0xFFFFD140),
    error = Color(0xFFCF6679),
    errorContainer = Color(0xFFB00020),
    onError = Color(0xFF000000),
    onErrorContainer = Color(0xFFFCD8DF),
    background = Color(0xFF000000),  // Black background
    onBackground = Color(0xFFE4E1E6),  // Light grey text on black background
    surface = Color(0xFF121212),
    onSurface = Color(0xFFE4E1E6),
    surfaceVariant = Color(0xFF49454F),
    onSurfaceVariant = Color(0xFFE7E0EC)
)
