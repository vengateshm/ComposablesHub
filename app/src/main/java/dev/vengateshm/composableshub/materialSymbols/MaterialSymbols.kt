package dev.vengateshm.composableshub.materialSymbols

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
fun rememberHistory(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "history",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
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
                moveTo(21.458f, 19.417f)
                lineToRelative(4.542f, 4.5f)
                quadToRelative(0.375f, 0.375f, 0.375f, 0.937f)
                quadToRelative(0f, 0.563f, -0.375f, 0.938f)
                quadToRelative(-0.417f, 0.416f, -0.938f, 0.416f)
                quadToRelative(-0.52f, 0f, -0.937f, -0.416f)
                lineToRelative(-4.917f, -4.917f)
                quadToRelative(-0.208f, -0.208f, -0.312f, -0.437f)
                quadToRelative(-0.104f, -0.23f, -0.104f, -0.521f)
                verticalLineToRelative(-6.875f)
                quadToRelative(0f, -0.542f, 0.396f, -0.938f)
                quadToRelative(0.395f, -0.396f, 0.937f, -0.396f)
                reflectiveQuadToRelative(0.937f, 0.396f)
                quadToRelative(0.396f, 0.396f, 0.396f, 0.938f)
                close()
                moveTo(19.875f, 34.75f)
                quadToRelative(-5.5f, 0f, -9.458f, -3.438f)
                quadToRelative(-3.959f, -3.437f, -4.917f, -8.729f)
                quadToRelative(-0.125f, -0.583f, 0.188f, -1.083f)
                quadToRelative(0.312f, -0.5f, 0.895f, -0.583f)
                quadToRelative(0.542f, -0.084f, 0.959f, 0.291f)
                quadToRelative(0.416f, 0.375f, 0.541f, 0.917f)
                quadToRelative(0.792f, 4.333f, 4.042f, 7.167f)
                quadToRelative(3.25f, 2.833f, 7.75f, 2.833f)
                quadToRelative(5.083f, 0f, 8.646f, -3.583f)
                quadToRelative(3.562f, -3.584f, 3.562f, -8.667f)
                quadToRelative(0f, -5.042f, -3.583f, -8.521f)
                quadToRelative(-3.583f, -3.479f, -8.667f, -3.479f)
                quadToRelative(-2.791f, 0f, -5.229f, 1.292f)
                quadToRelative(-2.437f, 1.291f, -4.187f, 3.416f)
                horizontalLineToRelative(3.041f)
                quadToRelative(0.542f, 0f, 0.917f, 0.375f)
                reflectiveQuadToRelative(0.375f, 0.917f)
                quadToRelative(0f, 0.583f, -0.375f, 0.958f)
                reflectiveQuadToRelative(-0.917f, 0.375f)
                horizontalLineTo(7.25f)
                quadToRelative(-0.583f, 0f, -0.938f, -0.375f)
                quadToRelative(-0.354f, -0.375f, -0.354f, -0.916f)
                verticalLineTo(7.708f)
                quadToRelative(0f, -0.541f, 0.375f, -0.916f)
                reflectiveQuadToRelative(0.917f, -0.375f)
                quadToRelative(0.583f, 0f, 0.958f, 0.375f)
                reflectiveQuadToRelative(0.375f, 0.916f)
                verticalLineToRelative(2.917f)
                quadToRelative(2.125f, -2.5f, 5.042f, -3.937f)
                quadToRelative(2.917f, -1.438f, 6.208f, -1.438f)
                quadToRelative(3.084f, 0f, 5.792f, 1.146f)
                quadToRelative(2.708f, 1.146f, 4.729f, 3.146f)
                reflectiveQuadToRelative(3.188f, 4.666f)
                quadToRelative(1.166f, 2.667f, 1.166f, 5.75f)
                quadToRelative(0f, 3.042f, -1.166f, 5.75f)
                quadToRelative(-1.167f, 2.709f, -3.188f, 4.709f)
                quadToRelative(-2.021f, 2f, -4.708f, 3.166f)
                quadToRelative(-2.688f, 1.167f, -5.771f, 1.167f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberMic(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "mic",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
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
                moveTo(20f, 22.542f)
                quadToRelative(-1.833f, 0f, -3.062f, -1.292f)
                quadToRelative(-1.23f, -1.292f, -1.23f, -3.167f)
                verticalLineTo(7.875f)
                quadToRelative(0f, -1.75f, 1.25f, -3f)
                reflectiveQuadTo(20f, 3.625f)
                quadToRelative(1.792f, 0f, 3.042f, 1.25f)
                quadToRelative(1.25f, 1.25f, 1.25f, 3f)
                verticalLineToRelative(10.208f)
                quadToRelative(0f, 1.875f, -1.23f, 3.167f)
                quadToRelative(-1.229f, 1.292f, -3.062f, 1.292f)
                close()
                moveToRelative(0f, -9.459f)
                close()
                moveToRelative(0f, 21.709f)
                quadToRelative(-0.542f, 0f, -0.917f, -0.396f)
                reflectiveQuadToRelative(-0.375f, -0.938f)
                verticalLineToRelative(-4.166f)
                quadToRelative(-4f, -0.459f, -6.791f, -3.209f)
                quadToRelative(-2.792f, -2.75f, -3.25f, -6.583f)
                quadToRelative(-0.084f, -0.583f, 0.312f, -1f)
                quadToRelative(0.396f, -0.417f, 1.021f, -0.417f)
                quadToRelative(0.458f, 0f, 0.833f, 0.355f)
                quadToRelative(0.375f, 0.354f, 0.459f, 0.854f)
                quadToRelative(0.458f, 3.166f, 2.916f, 5.312f)
                quadTo(16.667f, 26.75f, 20f, 26.75f)
                quadToRelative(3.333f, 0f, 5.792f, -2.146f)
                quadToRelative(2.458f, -2.146f, 2.916f, -5.312f)
                quadToRelative(0.084f, -0.542f, 0.459f, -0.875f)
                quadToRelative(0.375f, -0.334f, 0.875f, -0.334f)
                quadToRelative(0.583f, 0f, 0.979f, 0.417f)
                reflectiveQuadToRelative(0.312f, 1f)
                quadToRelative(-0.458f, 3.833f, -3.25f, 6.583f)
                quadToRelative(-2.791f, 2.75f, -6.75f, 3.209f)
                verticalLineToRelative(4.166f)
                quadToRelative(0f, 0.542f, -0.395f, 0.938f)
                quadToRelative(-0.396f, 0.396f, -0.938f, 0.396f)
                close()
                moveToRelative(0f, -14.875f)
                quadToRelative(0.75f, 0f, 1.208f, -0.542f)
                quadToRelative(0.459f, -0.542f, 0.459f, -1.292f)
                verticalLineTo(7.917f)
                quadToRelative(0f, -0.709f, -0.479f, -1.188f)
                quadToRelative(-0.48f, -0.479f, -1.188f, -0.479f)
                reflectiveQuadToRelative(-1.188f, 0.479f)
                quadToRelative(-0.479f, 0.479f, -0.479f, 1.146f)
                verticalLineToRelative(10.208f)
                quadToRelative(0f, 0.75f, 0.459f, 1.292f)
                quadToRelative(0.458f, 0.542f, 1.208f, 0.542f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberAccountCircle(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "account_circle",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
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
                moveTo(9.583f, 29.083f)
                quadToRelative(2.459f, -1.75f, 4.979f, -2.687f)
                quadToRelative(2.521f, -0.938f, 5.438f, -0.938f)
                reflectiveQuadToRelative(5.438f, 0.938f)
                quadToRelative(2.52f, 0.937f, 5.02f, 2.687f)
                quadToRelative(1.75f, -2.125f, 2.521f, -4.354f)
                quadToRelative(0.771f, -2.229f, 0.771f, -4.729f)
                quadToRelative(0f, -5.833f, -3.958f, -9.792f)
                quadTo(25.833f, 6.25f, 20f, 6.25f)
                reflectiveQuadToRelative(-9.792f, 3.958f)
                quadTo(6.25f, 14.167f, 6.25f, 20f)
                quadToRelative(0f, 2.5f, 0.792f, 4.729f)
                quadToRelative(0.791f, 2.229f, 2.541f, 4.354f)
                close()
                moveTo(20f, 21.333f)
                quadToRelative(-2.417f, 0f, -4.062f, -1.645f)
                quadToRelative(-1.646f, -1.646f, -1.646f, -4.063f)
                quadToRelative(0f, -2.375f, 1.646f, -4.021f)
                quadTo(17.583f, 9.958f, 20f, 9.958f)
                quadToRelative(2.417f, 0f, 4.062f, 1.646f)
                quadToRelative(1.646f, 1.646f, 1.646f, 4.021f)
                quadToRelative(0f, 2.417f, -1.646f, 4.063f)
                quadToRelative(-1.645f, 1.645f, -4.062f, 1.645f)
                close()
                moveToRelative(0f, 15.042f)
                quadToRelative(-3.375f, 0f, -6.375f, -1.292f)
                quadToRelative(-3f, -1.291f, -5.208f, -3.521f)
                quadToRelative(-2.209f, -2.229f, -3.5f, -5.208f)
                quadTo(3.625f, 23.375f, 3.625f, 20f)
                reflectiveQuadToRelative(1.292f, -6.375f)
                quadToRelative(1.291f, -3f, 3.521f, -5.208f)
                quadToRelative(2.229f, -2.209f, 5.208f, -3.5f)
                quadTo(16.625f, 3.625f, 20f, 3.625f)
                reflectiveQuadToRelative(6.375f, 1.292f)
                quadToRelative(3f, 1.291f, 5.208f, 3.521f)
                quadToRelative(2.209f, 2.229f, 3.5f, 5.208f)
                quadToRelative(1.292f, 2.979f, 1.292f, 6.354f)
                reflectiveQuadToRelative(-1.292f, 6.375f)
                quadToRelative(-1.291f, 3f, -3.521f, 5.208f)
                quadToRelative(-2.229f, 2.209f, -5.208f, 3.5f)
                quadToRelative(-2.979f, 1.292f, -6.354f, 1.292f)
                close()
                moveToRelative(0f, -2.625f)
                quadToRelative(2.25f, 0f, 4.312f, -0.646f)
                quadToRelative(2.063f, -0.646f, 4.063f, -2.146f)
                quadToRelative(-2f, -1.416f, -4.083f, -2.146f)
                quadToRelative(-2.084f, -0.729f, -4.292f, -0.729f)
                quadToRelative(-2.208f, 0f, -4.313f, 0.729f)
                quadToRelative(-2.104f, 0.73f, -4.062f, 2.146f)
                quadToRelative(2f, 1.5f, 4.063f, 2.146f)
                quadToRelative(2.062f, 0.646f, 4.312f, 0.646f)
                close()
                moveToRelative(0f, -15.042f)
                quadToRelative(1.333f, 0f, 2.188f, -0.875f)
                quadToRelative(0.854f, -0.875f, 0.854f, -2.208f)
                quadToRelative(0f, -1.333f, -0.854f, -2.187f)
                quadToRelative(-0.855f, -0.855f, -2.188f, -0.855f)
                quadToRelative(-1.333f, 0f, -2.188f, 0.855f)
                quadToRelative(-0.854f, 0.854f, -0.854f, 2.187f)
                quadToRelative(0f, 1.333f, 0.854f, 2.208f)
                quadToRelative(0.855f, 0.875f, 2.188f, 0.875f)
                close()
                moveToRelative(0f, -3.083f)
                close()
                moveToRelative(0f, 15.292f)
                close()
            }
        }.build()
    }
}