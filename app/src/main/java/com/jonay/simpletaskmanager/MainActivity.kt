package com.jonay.simpletaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jonay.simpletaskmanager.navigation.AppNavigationScreens
import com.jonay.simpletaskmanager.navigation.AppNavigationScreens.*
import com.jonay.simpletaskmanager.navigation.Navigation
import com.jonay.simpletaskmanager.ui.theme.SimpleTaskManagerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleTaskManagerTheme {
                Navigation(ListScreen.route)
            }
        }
    }
}