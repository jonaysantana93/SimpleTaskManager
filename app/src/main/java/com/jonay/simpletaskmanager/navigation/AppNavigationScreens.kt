package com.jonay.simpletaskmanager.navigation

/***
 * Created by Jonay Adrián Santana González on 10/08/2025.
 * All rights reserved 2025
 ***/

sealed class AppNavigationScreens (val route: String) {
    data object ListScreen: AppNavigationScreens("list_screen")
    data object TaskScreen: AppNavigationScreens("task_screen")
}