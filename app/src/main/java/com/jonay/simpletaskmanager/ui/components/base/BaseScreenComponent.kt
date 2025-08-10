package com.jonay.simpletaskmanager.ui.components.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jonay.simpletaskmanager.R
import com.jonay.simpletaskmanager.common.extensions.Pixel7ProPreview
import com.jonay.simpletaskmanager.ui.components.AppText
import kotlin.let

/***
 * Created by Jonay Adrián Santana González on 04/02/2025.
 * All rights reserved 2025
 ***/

@Pixel7ProPreview
@Composable
private fun BaseScreenPreview() {
    BaseScreen(
        showProgressIndicator = false,
        showTopAppBar = true,
        topAppBarTitle = "Title example",
        topAppBarSubTitle = "Subtitle example"
    )
}

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    showProgressIndicator: Boolean = false,
    showTopAppBar: Boolean = true,
    topAppBarTitle: String? = null,
    topAppBarSubTitle: String? = null,
    hideTopAppBarNavigation: Boolean = false,
    topAppBarNavigationIcon: Painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
    topAppBarOnNavigationClick: () -> Unit = {},
    topAppBarActions: @Composable RowScope.() -> Unit = {},
    view: @Composable BoxScope.() -> Unit = {}
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .imePadding(),
        topBar = appTopAppBar(
            showTopAppBar = showTopAppBar,
            title = topAppBarTitle,
            subTitle = topAppBarSubTitle,
            hideTopAppBarNavigation = hideTopAppBarNavigation,
            navigationIcon = topAppBarNavigationIcon,
            onNavigationClick = topAppBarOnNavigationClick,
            actionOptions = topAppBarActions
        )
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding())
                .imePadding(),
            content = view
        )
    }

    if (showProgressIndicator) AppCircularProgressIndicator()
}

@OptIn(ExperimentalMaterial3Api::class)
fun appTopAppBar(
    showTopAppBar: Boolean,
    title: String?,
    subTitle: String?,
    hideTopAppBarNavigation: Boolean,
    navigationIcon: Painter,
    onNavigationClick: () -> Unit,
    actionOptions: @Composable RowScope.() -> Unit
) = @Composable {
    if (showTopAppBar) {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors().copy(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = MaterialTheme.colorScheme.onPrimary,
                navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
            ),
            title = {
                Column(modifier = Modifier.fillMaxWidth()) {
                    title?.let {
                        AppText(
                            modifier = Modifier.fillMaxWidth(),
                            text = it,
                            textStyle = MaterialTheme.typography.titleLarge
                        )
                    }

                    subTitle?.let {
                        AppText(
                            modifier = Modifier.fillMaxWidth(),
                            text = it,
                            textStyle = MaterialTheme.typography.titleSmall
                        )
                    }
                }
            },
            navigationIcon = {
                if (!hideTopAppBarNavigation) {
                    Box(modifier = Modifier.padding(8.dp)) {
                        IconButton(onClick = onNavigationClick) {
                            Icon(painter = navigationIcon, contentDescription = "navigation Icon")
                        }
                    }
                }
            },
            actions = actionOptions
        )
    }
}
