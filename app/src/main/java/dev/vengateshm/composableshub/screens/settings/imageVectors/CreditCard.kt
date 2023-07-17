package dev.vengateshm.composableshub.screens.settings.imageVectors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/**
 * Icon generated from https://composables.com/icons
 */
@Composable
fun rememberCreditCard(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "credit_card",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(22f, 6f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 18.825f, 2f, 18f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 5.175f, 22f, 6f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(0f, 6f)
                verticalLineTo(6f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
    }
}