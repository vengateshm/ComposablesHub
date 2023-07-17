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

@Composable
fun rememberAutoAwesome(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "auto_awesome",
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
                moveTo(19f, 8.3f)
                quadToRelative(-0.125f, 0f, -0.262f, -0.075f)
                quadTo(18.6f, 8.15f, 18.55f, 8f)
                lineToRelative(-0.8f, -1.75f)
                lineToRelative(-1.75f, -0.8f)
                quadToRelative(-0.15f, -0.05f, -0.225f, -0.188f)
                quadTo(15.7f, 5.125f, 15.7f, 5f)
                reflectiveQuadToRelative(0.075f, -0.263f)
                quadTo(15.85f, 4.6f, 16f, 4.55f)
                lineToRelative(1.75f, -0.8f)
                lineToRelative(0.8f, -1.75f)
                quadToRelative(0.05f, -0.15f, 0.188f, -0.225f)
                quadToRelative(0.137f, -0.075f, 0.262f, -0.075f)
                reflectiveQuadToRelative(0.263f, 0.075f)
                quadToRelative(0.137f, 0.075f, 0.187f, 0.225f)
                lineToRelative(0.8f, 1.75f)
                lineToRelative(1.75f, 0.8f)
                quadToRelative(0.15f, 0.05f, 0.225f, 0.187f)
                quadToRelative(0.075f, 0.138f, 0.075f, 0.263f)
                reflectiveQuadToRelative(-0.075f, 0.262f)
                quadTo(22.15f, 5.4f, 22f, 5.45f)
                lineToRelative(-1.75f, 0.8f)
                lineToRelative(-0.8f, 1.75f)
                quadToRelative(-0.05f, 0.15f, -0.187f, 0.225f)
                quadToRelative(-0.138f, 0.075f, -0.263f, 0.075f)
                close()
                moveToRelative(0f, 14f)
                quadToRelative(-0.125f, 0f, -0.262f, -0.075f)
                quadToRelative(-0.138f, -0.075f, -0.188f, -0.225f)
                lineToRelative(-0.8f, -1.75f)
                lineToRelative(-1.75f, -0.8f)
                quadToRelative(-0.15f, -0.05f, -0.225f, -0.188f)
                quadToRelative(-0.075f, -0.137f, -0.075f, -0.262f)
                reflectiveQuadToRelative(0.075f, -0.262f)
                quadToRelative(0.075f, -0.138f, 0.225f, -0.188f)
                lineToRelative(1.75f, -0.8f)
                lineToRelative(0.8f, -1.75f)
                quadToRelative(0.05f, -0.15f, 0.188f, -0.225f)
                quadToRelative(0.137f, -0.075f, 0.262f, -0.075f)
                reflectiveQuadToRelative(0.263f, 0.075f)
                quadToRelative(0.137f, 0.075f, 0.187f, 0.225f)
                lineToRelative(0.8f, 1.75f)
                lineToRelative(1.75f, 0.8f)
                quadToRelative(0.15f, 0.05f, 0.225f, 0.188f)
                quadToRelative(0.075f, 0.137f, 0.075f, 0.262f)
                reflectiveQuadToRelative(-0.075f, 0.262f)
                quadToRelative(-0.075f, 0.138f, -0.225f, 0.188f)
                lineToRelative(-1.75f, 0.8f)
                lineToRelative(-0.8f, 1.75f)
                quadToRelative(-0.05f, 0.15f, -0.187f, 0.225f)
                quadToRelative(-0.138f, 0.075f, -0.263f, 0.075f)
                close()
                moveTo(9f, 18.575f)
                quadToRelative(-0.275f, 0f, -0.525f, -0.15f)
                reflectiveQuadTo(8.1f, 18f)
                lineToRelative(-1.6f, -3.5f)
                lineTo(3f, 12.9f)
                quadToRelative(-0.275f, -0.125f, -0.425f, -0.375f)
                quadToRelative(-0.15f, -0.25f, -0.15f, -0.525f)
                reflectiveQuadToRelative(0.15f, -0.525f)
                quadToRelative(0.15f, -0.25f, 0.425f, -0.375f)
                lineToRelative(3.5f, -1.6f)
                lineTo(8.1f, 6f)
                quadToRelative(0.125f, -0.275f, 0.375f, -0.425f)
                quadToRelative(0.25f, -0.15f, 0.525f, -0.15f)
                reflectiveQuadToRelative(0.525f, 0.15f)
                quadToRelative(0.25f, 0.15f, 0.375f, 0.425f)
                lineToRelative(1.6f, 3.5f)
                lineToRelative(3.5f, 1.6f)
                quadToRelative(0.275f, 0.125f, 0.425f, 0.375f)
                quadToRelative(0.15f, 0.25f, 0.15f, 0.525f)
                reflectiveQuadToRelative(-0.15f, 0.525f)
                quadToRelative(-0.15f, 0.25f, -0.425f, 0.375f)
                lineToRelative(-3.5f, 1.6f)
                lineTo(9.9f, 18f)
                quadToRelative(-0.125f, 0.275f, -0.375f, 0.425f)
                quadToRelative(-0.25f, 0.15f, -0.525f, 0.15f)
                close()
                moveToRelative(0f, -3.425f)
                lineTo(10f, 13f)
                lineToRelative(2.15f, -1f)
                lineTo(10f, 11f)
                lineTo(9f, 8.85f)
                lineTo(8f, 11f)
                lineToRelative(-2.15f, 1f)
                lineTo(8f, 13f)
                close()
                moveTo(9f, 12f)
                close()
            }
        }.build()
    }
}