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
fun rememberStyle(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "style",
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
                moveTo(3.975f, 19.8f)
                lineToRelative(-0.85f, -0.35f)
                quadToRelative(-0.775f, -0.325f, -1.037f, -1.125f)
                quadToRelative(-0.263f, -0.8f, 0.087f, -1.575f)
                lineToRelative(1.8f, -3.9f)
                close()
                moveToRelative(4f, 2.2f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadToRelative(-0.587f, -0.588f, -0.587f, -1.413f)
                verticalLineToRelative(-6f)
                lineToRelative(2.65f, 7.35f)
                quadToRelative(0.075f, 0.175f, 0.15f, 0.338f)
                quadToRelative(0.075f, 0.162f, 0.2f, 0.312f)
                close()
                moveToRelative(5.15f, -0.1f)
                quadToRelative(-0.8f, 0.3f, -1.55f, -0.075f)
                reflectiveQuadToRelative(-1.05f, -1.175f)
                lineToRelative(-4.45f, -12.2f)
                quadToRelative(-0.3f, -0.8f, 0.05f, -1.563f)
                quadToRelative(0.35f, -0.762f, 1.15f, -1.037f)
                lineToRelative(7.55f, -2.75f)
                quadToRelative(0.8f, -0.3f, 1.55f, 0.075f)
                reflectiveQuadToRelative(1.05f, 1.175f)
                lineToRelative(4.45f, 12.2f)
                quadToRelative(0.3f, 0.8f, -0.05f, 1.563f)
                quadToRelative(-0.35f, 0.762f, -1.15f, 1.037f)
                close()
                moveTo(10.975f, 10f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadToRelative(0.287f, -0.287f, 0.287f, -0.712f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(11.4f, 8f, 10.975f, 8f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadToRelative(-0.288f, 0.288f, -0.288f, 0.713f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadToRelative(0.287f, 0.288f, 0.712f, 0.288f)
                close()
                moveToRelative(1.45f, 10f)
                lineToRelative(7.55f, -2.75f)
                lineTo(15.525f, 5f)
                lineToRelative(-7.55f, 2.75f)
                close()
                moveTo(7.975f, 7.75f)
                lineTo(15.525f, 5f)
                close()
            }
        }.build()
    }
}