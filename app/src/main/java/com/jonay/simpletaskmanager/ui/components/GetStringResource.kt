package com.jonay.simpletaskmanager.ui.components

import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp

@Composable
fun getStringResource(@StringRes id: Int): String = stringResource(id)

@Composable
fun getDimenResource(@DimenRes id: Int): Dp = dimensionResource(id = id)