package com.jonay.simpletaskmanager.ui.components.base

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.jonay.simpletaskmanager.common.extensions.Pixel7ProPreview
import com.jonay.simpletaskmanager.ui.theme.Black60

@Pixel7ProPreview
@Composable
private fun AppCircularProgressIndicatorPreview() {
    AppCircularProgressIndicator()
}

@Composable
fun AppCircularProgressIndicator(color: Color = Color.Blue) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Black60)
            .clickable(enabled = false, onClick = {}),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(color = color)
    }
}