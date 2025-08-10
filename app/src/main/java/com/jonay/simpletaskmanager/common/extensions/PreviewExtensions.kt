package com.jonay.simpletaskmanager.common.extensions

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

/***
 * Created by Jonay Adrián Santana González on 15/01/2025.
 * All rights reserved 2025
 ***/

@Preview(
    showBackground = true,
    device = Devices.PIXEL_7_PRO,
    name = "7 inches"
)
annotation class Pixel7ProPreview

@Preview(
    showBackground = true,
    device = "spec:width=1280dp,height=800dp,dpi=480",
    name = "11 inches landscape"
)
annotation class PixelTabletLandscape


@Preview(
    showBackground = true,
    device = "spec:width=800dp,height=1280dp,dpi=480",
    name = "11 inches portrait"
)
annotation class PixelTabletPortrait


@Pixel7ProPreview
@PixelTabletLandscape
@PixelTabletPortrait
annotation class AllDevices