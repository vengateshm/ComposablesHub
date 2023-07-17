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
fun rememberDescription(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "description",
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
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(16f, 17.425f, 16f, 17f)
                reflectiveQuadToRelative(-0.287f, -0.712f)
                quadTo(15.425f, 16f, 15f, 16f)
                horizontalLineTo(9f)
                quadToRelative(-0.425f, 0f, -0.712f, 0.288f)
                quadTo(8f, 16.575f, 8f, 17f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(8.575f, 18f, 9f, 18f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(6f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(16f, 13.425f, 16f, 13f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(15.425f, 12f, 15f, 12f)
                horizontalLineTo(9f)
                quadToRelative(-0.425f, 0f, -0.712f, 0.287f)
                quadTo(8f, 12.575f, 8f, 13f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(8.575f, 14f, 9f, 14f)
                close()
                moveToRelative(-3f, 8f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(4f, 20.825f, 4f, 20f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(5.175f, 2f, 6f, 2f)
                horizontalLineToRelative(7.175f)
                quadToRelative(0.4f, 0f, 0.763f, 0.15f)
                quadToRelative(0.362f, 0.15f, 0.637f, 0.425f)
                lineToRelative(4.85f, 4.85f)
                quadToRelative(0.275f, 0.275f, 0.425f, 0.637f)
                quadToRelative(0.15f, 0.363f, 0.15f, 0.763f)
                verticalLineTo(20f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(18.825f, 22f, 18f, 22f)
                close()
                moveToRelative(7f, -14f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(12f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(13f, 8.425f, 13f, 8f)
                close()
                moveTo(6f, 4f)
                verticalLineToRelative(5f)
                verticalLineToRelative(-5f)
                verticalLineToRelative(16f)
                verticalLineTo(4f)
                close()
            }
        }.build()
    }
}