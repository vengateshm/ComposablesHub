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
fun rememberHandshake(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "handshake",
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
                moveTo(11.875f, 20f)
                quadToRelative(0.1f, 0f, 0.2f, -0.05f)
                reflectiveQuadToRelative(0.15f, -0.1f)
                lineToRelative(8.2f, -8.2f)
                quadToRelative(0.3f, -0.3f, 0.438f, -0.675f)
                quadToRelative(0.137f, -0.375f, 0.137f, -0.75f)
                quadToRelative(0f, -0.4f, -0.137f, -0.763f)
                quadToRelative(-0.138f, -0.362f, -0.438f, -0.637f)
                lineToRelative(-4.25f, -4.25f)
                quadToRelative(-0.275f, -0.3f, -0.637f, -0.438f)
                quadTo(15.175f, 4f, 14.775f, 4f)
                quadToRelative(-0.375f, 0f, -0.75f, 0.137f)
                quadToRelative(-0.375f, 0.138f, -0.675f, 0.438f)
                lineToRelative(-0.275f, 0.275f)
                lineToRelative(1.85f, 1.875f)
                quadToRelative(0.375f, 0.35f, 0.55f, 0.8f)
                quadToRelative(0.175f, 0.45f, 0.175f, 0.95f)
                quadToRelative(0f, 1.05f, -0.712f, 1.762f)
                quadToRelative(-0.713f, 0.713f, -1.763f, 0.713f)
                quadToRelative(-0.5f, 0f, -0.962f, -0.175f)
                quadToRelative(-0.463f, -0.175f, -0.813f, -0.525f)
                lineTo(9.525f, 8.4f)
                lineTo(5.15f, 12.775f)
                quadToRelative(-0.075f, 0.075f, -0.113f, 0.163f)
                quadToRelative(-0.037f, 0.087f, -0.037f, 0.187f)
                quadToRelative(0f, 0.2f, 0.15f, 0.362f)
                quadToRelative(0.15f, 0.163f, 0.35f, 0.163f)
                quadToRelative(0.1f, 0f, 0.2f, -0.05f)
                reflectiveQuadToRelative(0.15f, -0.1f)
                lineToRelative(3.4f, -3.4f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(-3.375f, 3.4f)
                quadToRelative(-0.075f, 0.075f, -0.113f, 0.162f)
                quadToRelative(-0.037f, 0.088f, -0.037f, 0.188f)
                quadToRelative(0f, 0.2f, 0.15f, 0.35f)
                quadToRelative(0.15f, 0.15f, 0.35f, 0.15f)
                quadToRelative(0.1f, 0f, 0.2f, -0.05f)
                reflectiveQuadToRelative(0.15f, -0.1f)
                lineToRelative(3.4f, -3.375f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(-3.375f, 3.4f)
                quadToRelative(-0.075f, 0.05f, -0.112f, 0.15f)
                quadToRelative(-0.038f, 0.1f, -0.038f, 0.2f)
                quadToRelative(0f, 0.2f, 0.15f, 0.35f)
                quadToRelative(0.15f, 0.15f, 0.35f, 0.15f)
                quadToRelative(0.1f, 0f, 0.188f, -0.038f)
                quadToRelative(0.087f, -0.037f, 0.162f, -0.112f)
                lineToRelative(3.4f, -3.375f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(-3.4f, 3.4f)
                quadToRelative(-0.075f, 0.075f, -0.112f, 0.162f)
                quadToRelative(-0.038f, 0.088f, -0.038f, 0.188f)
                quadToRelative(0f, 0.2f, 0.163f, 0.35f)
                quadToRelative(0.162f, 0.15f, 0.362f, 0.15f)
                close()
                moveToRelative(-0.025f, 2f)
                quadToRelative(-0.925f, 0f, -1.637f, -0.613f)
                quadToRelative(-0.713f, -0.612f, -0.838f, -1.537f)
                quadToRelative(-0.85f, -0.125f, -1.425f, -0.7f)
                quadToRelative(-0.575f, -0.575f, -0.7f, -1.425f)
                quadToRelative(-0.85f, -0.125f, -1.412f, -0.712f)
                quadToRelative(-0.563f, -0.588f, -0.688f, -1.413f)
                quadToRelative(-0.95f, -0.125f, -1.55f, -0.825f)
                quadToRelative(-0.6f, -0.7f, -0.6f, -1.65f)
                quadToRelative(0f, -0.5f, 0.188f, -0.963f)
                quadToRelative(0.187f, -0.462f, 0.537f, -0.812f)
                lineToRelative(5.8f, -5.775f)
                lineTo(12.8f, 8.85f)
                quadToRelative(0.05f, 0.075f, 0.15f, 0.112f)
                quadToRelative(0.1f, 0.038f, 0.2f, 0.038f)
                quadToRelative(0.225f, 0f, 0.375f, -0.137f)
                quadToRelative(0.15f, -0.138f, 0.15f, -0.363f)
                quadToRelative(0f, -0.1f, -0.037f, -0.2f)
                quadToRelative(-0.038f, -0.1f, -0.113f, -0.15f)
                lineTo(9.95f, 4.575f)
                quadToRelative(-0.275f, -0.3f, -0.638f, -0.438f)
                quadTo(8.95f, 4f, 8.55f, 4f)
                quadToRelative(-0.375f, 0f, -0.75f, 0.137f)
                quadToRelative(-0.375f, 0.138f, -0.675f, 0.438f)
                lineTo(3.6f, 8.125f)
                quadToRelative(-0.225f, 0.225f, -0.375f, 0.525f)
                quadToRelative(-0.15f, 0.3f, -0.2f, 0.6f)
                quadToRelative(-0.05f, 0.3f, 0f, 0.612f)
                quadToRelative(0.05f, 0.313f, 0.2f, 0.588f)
                lineToRelative(-1.45f, 1.45f)
                quadToRelative(-0.425f, -0.575f, -0.625f, -1.263f)
                quadTo(0.95f, 9.95f, 1f, 9.25f)
                quadToRelative(0.05f, -0.7f, 0.35f, -1.363f)
                quadToRelative(0.3f, -0.662f, 0.825f, -1.187f)
                lineTo(5.7f, 3.175f)
                quadTo(6.3f, 2.6f, 7.038f, 2.3f)
                quadTo(7.775f, 2f, 8.55f, 2f)
                reflectiveQuadToRelative(1.512f, 0.3f)
                quadToRelative(0.738f, 0.3f, 1.313f, 0.875f)
                lineToRelative(0.275f, 0.275f)
                lineToRelative(0.275f, -0.275f)
                quadToRelative(0.6f, -0.575f, 1.337f, -0.875f)
                quadTo(14f, 2f, 14.775f, 2f)
                quadToRelative(0.775f, 0f, 1.513f, 0.3f)
                quadToRelative(0.737f, 0.3f, 1.312f, 0.875f)
                lineTo(21.825f, 7.4f)
                quadToRelative(0.575f, 0.575f, 0.875f, 1.325f)
                quadToRelative(0.3f, 0.75f, 0.3f, 1.525f)
                quadToRelative(0f, 0.775f, -0.3f, 1.512f)
                quadToRelative(-0.3f, 0.738f, -0.875f, 1.313f)
                lineToRelative(-8.2f, 8.175f)
                quadToRelative(-0.35f, 0.35f, -0.813f, 0.55f)
                quadToRelative(-0.462f, 0.2f, -0.962f, 0.2f)
                close()
                moveTo(9.375f, 8f)
                close()
            }
        }.build()
    }
}