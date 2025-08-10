package com.jonay.simpletaskmanager.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

/***
 * Created by Jonay Adrián Santana González on 04/02/2025.
 * All rights reserved 2025
 ***/

@Preview(showBackground = true)
@Composable
private fun AppTextPreview() {
    AppText(text = "App text component")
}

@Composable
fun AppText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    textDecoration: TextDecoration = TextDecoration.None,
    textAlign: TextAlign = TextAlign.Left,
    color: Color = Color.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Ellipsis
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = textStyle.fontSize,
        fontStyle = textStyle.fontStyle,
        textAlign = textAlign,
        textDecoration = textDecoration,
        color = color,
        maxLines = maxLines,
        overflow = overflow
    )
}