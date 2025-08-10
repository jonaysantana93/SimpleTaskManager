package com.jonay.simpletaskmanager.ui.screens.list

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jonay.simpletaskmanager.R
import com.jonay.simpletaskmanager.common.extensions.Pixel7ProPreview
import com.jonay.simpletaskmanager.ui.components.base.BaseScreen
import com.jonay.simpletaskmanager.ui.components.getDimenResource
import com.jonay.simpletaskmanager.ui.components.getStringResource
import com.jonay.simpletaskmanager.ui.theme.Black60

/***
 * Created by Jonay Adrián Santana González on 10/08/2025.
 * All rights reserved 2025
 ***/

@Composable
fun ListScreen() {
    ListView()
}

@Pixel7ProPreview
@Composable
private fun ListScreenPreview() {
    ListScreen()
}

@Composable
private fun ListView() {
    BaseScreen(
        topAppBarTitle = getStringResource(R.string.list_screen_name),
        hideTopAppBarNavigation = true,
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = getDimenResource(R.dimen.dimen_8_dp)),
            verticalArrangement = Arrangement.spacedBy(getDimenResource(R.dimen.dimen_8_dp))
        ) {

        }
    }
}