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
fun rememberQuestionMark(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "question_mark",
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
                moveTo(12.025f, 16f)
                quadToRelative(-0.6f, 0f, -1.012f, -0.425f)
                quadToRelative(-0.413f, -0.425f, -0.363f, -1f)
                quadToRelative(0.075f, -1.05f, 0.5f, -1.825f)
                quadToRelative(0.425f, -0.775f, 1.35f, -1.6f)
                quadToRelative(1.025f, -0.9f, 1.562f, -1.563f)
                quadToRelative(0.538f, -0.662f, 0.538f, -1.512f)
                quadToRelative(0f, -1.025f, -0.687f, -1.7f)
                quadTo(13.225f, 5.7f, 12f, 5.7f)
                quadToRelative(-0.8f, 0f, -1.362f, 0.337f)
                quadToRelative(-0.563f, 0.338f, -0.913f, 0.838f)
                quadToRelative(-0.35f, 0.5f, -0.862f, 0.675f)
                quadToRelative(-0.513f, 0.175f, -0.988f, -0.025f)
                quadToRelative(-0.575f, -0.25f, -0.787f, -0.825f)
                quadToRelative(-0.213f, -0.575f, 0.087f, -1.075f)
                quadTo(7.9f, 4.5f, 9.125f, 3.75f)
                reflectiveQuadTo(12f, 3f)
                quadToRelative(2.625f, 0f, 4.038f, 1.463f)
                quadToRelative(1.412f, 1.462f, 1.412f, 3.512f)
                quadToRelative(0f, 1.25f, -0.537f, 2.138f)
                quadToRelative(-0.538f, 0.887f, -1.688f, 2.012f)
                quadToRelative(-0.85f, 0.8f, -1.2f, 1.3f)
                reflectiveQuadToRelative(-0.475f, 1.15f)
                quadToRelative(-0.1f, 0.625f, -0.525f, 1.025f)
                quadToRelative(-0.425f, 0.4f, -1f, 0.4f)
                close()
                moveTo(12f, 22f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(10f, 20.825f, 10f, 20f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(11.175f, 18f, 12f, 18f)
                reflectiveQuadToRelative(1.413f, 0.587f)
                quadTo(14f, 19.175f, 14f, 20f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(12.825f, 22f, 12f, 22f)
                close()
            }
        }.build()
    }
}