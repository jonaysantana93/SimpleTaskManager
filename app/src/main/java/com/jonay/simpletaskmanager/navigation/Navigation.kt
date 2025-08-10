package com.jonay.simpletaskmanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jonay.simpletaskmanager.navigation.AppNavigationScreens.ListScreen
import com.jonay.simpletaskmanager.navigation.extensions.appComposable
import com.jonay.simpletaskmanager.ui.screens.list.ListScreen

/***
 * Created by Jonay Adrián Santana González on 10/08/2025.
 * All rights reserved 2025
 ***/

@Composable
fun Navigation(startDestination: String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        appComposable(ListScreen.route) {
            ListScreen()
        }
    }
}