package dev.vengateshm.composableshub.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SocialLoginsButtonsPreview() {
    SocialLoginsButtons()
}

@Composable
fun SocialLoginsButtons() {
    @Composable
    fun rememberTelegram(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Telegram",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 48.0f,
                viewportHeight = 48.0f
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
                    moveTo(5.83f, 23.616f)
                    curveToRelative(12.568f, -5.529f, 28.832f, -12.27f, 31.077f, -13.203f)
                    curveToRelative(5.889f, -2.442f, 7.696f, -1.974f, 6.795f, 3.434f)
                    curveToRelative(-0.647f, 3.887f, -2.514f, 16.756f, -4.002f, 24.766f)
                    curveToRelative(-0.883f, 4.75f, -2.864f, 5.313f, -5.979f, 3.258f)
                    curveToRelative(-1.498f, -0.989f, -9.059f, -5.989f, -10.7f, -7.163f)
                    curveToRelative(-1.498f, -1.07f, -3.564f, -2.357f, -0.973f, -4.892f)
                    curveToRelative(0.922f, -0.903f, 6.966f, -6.674f, 11.675f, -11.166f)
                    curveToRelative(0.617f, -0.59f, -0.158f, -1.559f, -0.87f, -1.086f)
                    curveToRelative(-6.347f, 4.209f, -15.147f, 10.051f, -16.267f, 10.812f)
                    curveToRelative(-1.692f, 1.149f, -3.317f, 1.676f, -6.234f, 0.838f)
                    curveToRelative(-2.204f, -0.633f, -4.357f, -1.388f, -5.195f, -1.676f)
                    curveTo(1.93f, 26.43f, 2.696f, 24.995f, 5.83f, 23.616f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberLinkedIn(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "LinkedIn",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 50.0f,
                viewportHeight = 50.0f
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
                    moveTo(8f, 3.0098f)
                    curveTo(4.53f, 3.0098f, 2.0098f, 5.0892f, 2.0098f, 7.9492f)
                    curveTo(2.0098f, 10.8192f, 4.59f, 12.9902f, 8f, 12.9902f)
                    curveTo(11.47f, 12.9902f, 13.9902f, 10.8706f, 13.9902f, 7.8906f)
                    curveTo(13.8302f, 5.0206f, 11.36f, 3.0098f, 8f, 3.0098f)
                    close()
                    moveTo(3f, 15f)
                    curveTo(2.45f, 15f, 2f, 15.45f, 2f, 16f)
                    lineTo(2f, 45f)
                    curveTo(2f, 45.55f, 2.45f, 46f, 3f, 46f)
                    lineTo(13f, 46f)
                    curveTo(13.55f, 46f, 14f, 45.55f, 14f, 45f)
                    lineTo(14f, 16f)
                    curveTo(14f, 15.45f, 13.55f, 15f, 13f, 15f)
                    lineTo(3f, 15f)
                    close()
                    moveTo(18f, 15f)
                    curveTo(17.45f, 15f, 17f, 15.45f, 17f, 16f)
                    lineTo(17f, 45f)
                    curveTo(17f, 45.55f, 17.45f, 46f, 18f, 46f)
                    lineTo(27f, 46f)
                    curveTo(27.552f, 46f, 28f, 45.552f, 28f, 45f)
                    lineTo(28f, 30f)
                    lineTo(28f, 29.75f)
                    lineTo(28f, 29.5f)
                    curveTo(28f, 27.13f, 29.8206f, 25.1995f, 32.1406f, 25.0195f)
                    curveTo(32.2606f, 24.9995f, 32.38f, 25f, 32.5f, 25f)
                    curveTo(32.62f, 25f, 32.7394f, 24.9995f, 32.8594f, 25.0195f)
                    curveTo(35.1794f, 25.1995f, 37f, 27.13f, 37f, 29.5f)
                    lineTo(37f, 45f)
                    curveTo(37f, 45.552f, 37.448f, 46f, 38f, 46f)
                    lineTo(47f, 46f)
                    curveTo(47.55f, 46f, 48f, 45.55f, 48f, 45f)
                    lineTo(48f, 28f)
                    curveTo(48f, 21.53f, 44.5291f, 15f, 36.7891f, 15f)
                    curveTo(33.2691f, 15f, 30.61f, 16.3602f, 29f, 17.4902f)
                    lineTo(29f, 16f)
                    curveTo(29f, 15.45f, 28.55f, 15f, 28f, 15f)
                    lineTo(18f, 15f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberGithub(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Github",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 30.0f,
                viewportHeight = 30.0f
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
                    moveTo(15f, 3f)
                    curveTo(8.373f, 3f, 3f, 8.373f, 3f, 15f)
                    curveToRelative(0f, 5.623f, 3.872f, 10.328f, 9.092f, 11.63f)
                    curveTo(12.036f, 26.468f, 12f, 26.28f, 12f, 26.047f)
                    verticalLineToRelative(-2.051f)
                    curveToRelative(-0.487f, 0f, -1.303f, 0f, -1.508f, 0f)
                    curveToRelative(-0.821f, 0f, -1.551f, -0.353f, -1.905f, -1.009f)
                    curveToRelative(-0.393f, -0.729f, -0.461f, -1.844f, -1.435f, -2.526f)
                    curveToRelative(-0.289f, -0.227f, -0.069f, -0.486f, 0.264f, -0.451f)
                    curveToRelative(0.615f, 0.174f, 1.125f, 0.596f, 1.605f, 1.222f)
                    curveToRelative(0.478f, 0.627f, 0.703f, 0.769f, 1.596f, 0.769f)
                    curveToRelative(0.433f, 0f, 1.081f, -0.025f, 1.691f, -0.121f)
                    curveToRelative(0.328f, -0.833f, 0.895f, -1.6f, 1.588f, -1.962f)
                    curveToRelative(-3.996f, -0.411f, -5.903f, -2.399f, -5.903f, -5.098f)
                    curveToRelative(0f, -1.162f, 0.495f, -2.286f, 1.336f, -3.233f)
                    curveTo(9.053f, 10.647f, 8.706f, 8.73f, 9.435f, 8f)
                    curveToRelative(1.798f, 0f, 2.885f, 1.166f, 3.146f, 1.481f)
                    curveTo(13.477f, 9.174f, 14.461f, 9f, 15.495f, 9f)
                    curveToRelative(1.036f, 0f, 2.024f, 0.174f, 2.922f, 0.483f)
                    curveTo(18.675f, 9.17f, 19.763f, 8f, 21.565f, 8f)
                    curveToRelative(0.732f, 0.731f, 0.381f, 2.656f, 0.102f, 3.594f)
                    curveToRelative(0.836f, 0.945f, 1.328f, 2.066f, 1.328f, 3.226f)
                    curveToRelative(0f, 2.697f, -1.904f, 4.684f, -5.894f, 5.097f)
                    curveTo(18.199f, 20.49f, 19f, 22.1f, 19f, 23.313f)
                    verticalLineToRelative(2.734f)
                    curveToRelative(0f, 0.104f, -0.023f, 0.179f, -0.035f, 0.268f)
                    curveTo(23.641f, 24.676f, 27f, 20.236f, 27f, 15f)
                    curveTo(27f, 8.373f, 21.627f, 3f, 15f, 3f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberAmazon(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Amazon",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 50.0f,
                viewportHeight = 50.0f
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
                    moveTo(25.3125f, 3f)
                    curveTo(19.2109f, 3f, 12.4922f, 5.3125f, 11.0938f, 12.8125f)
                    curveTo(10.8945f, 13.6133f, 11.5f, 13.9922f, 12f, 14.0938f)
                    lineTo(18.1875f, 14.6875f)
                    curveTo(18.7891f, 14.6875f, 19.207f, 14.1016f, 19.4063f, 13.5f)
                    curveTo(19.9063f, 10.8984f, 22.1016f, 9.5938f, 24.5f, 9.5938f)
                    curveTo(25.8008f, 9.5938f, 27.293f, 10.1133f, 28.0938f, 11.3125f)
                    curveTo(28.9922f, 12.6133f, 28.8125f, 14.4063f, 28.8125f, 15.9063f)
                    lineTo(28.8125f, 16.8125f)
                    curveTo(25.1133f, 17.2109f, 20.3125f, 17.5f, 16.8125f, 19f)
                    curveTo(12.8125f, 20.6992f, 10f, 24.207f, 10f, 29.4063f)
                    curveTo(10f, 36.0078f, 14.1992f, 39.3125f, 19.5f, 39.3125f)
                    curveTo(24f, 39.3125f, 26.5f, 38.1953f, 30f, 34.5938f)
                    curveTo(31.1992f, 36.293f, 31.5859f, 37.1055f, 33.6875f, 38.9063f)
                    curveTo(34.1875f, 39.207f, 34.7891f, 39.0859f, 35.1875f, 38.6875f)
                    lineTo(35.1875f, 38.8125f)
                    curveTo(36.4883f, 37.7109f, 38.793f, 35.6016f, 40.0938f, 34.5f)
                    curveTo(40.5938f, 34.1992f, 40.4922f, 33.5f, 40.0938f, 33f)
                    curveTo(38.8945f, 31.3984f, 37.6875f, 30.0938f, 37.6875f, 27.0938f)
                    lineTo(37.6875f, 17.1875f)
                    curveTo(37.6875f, 12.9883f, 38.0078f, 9.0859f, 34.9063f, 6.1875f)
                    curveTo(32.4063f, 3.7891f, 28.4141f, 3f, 25.3125f, 3f)
                    close()
                    moveTo(27f, 22f)
                    lineTo(28.6875f, 22f)
                    lineTo(28.6875f, 23.4063f)
                    curveTo(28.6875f, 25.8047f, 28.793f, 27.8945f, 27.5938f, 30.0938f)
                    curveTo(26.5938f, 31.8945f, 24.9883f, 33f, 23.1875f, 33f)
                    curveTo(20.7891f, 33f, 19.3125f, 31.207f, 19.3125f, 28.4063f)
                    curveTo(19.3125f, 23.707f, 23f, 22.3008f, 27f, 22f)
                    close()
                    moveTo(44.5938f, 36.5938f)
                    curveTo(42.9922f, 36.5938f, 41.0859f, 37f, 39.6875f, 38f)
                    curveTo(39.2891f, 38.3008f, 39.3125f, 38.6875f, 39.8125f, 38.6875f)
                    curveTo(41.4141f, 38.4883f, 44.9883f, 38.0078f, 45.6875f, 38.9063f)
                    curveTo(46.2891f, 39.707f, 45.0078f, 43.0859f, 44.4063f, 44.6875f)
                    curveTo(44.207f, 45.1875f, 44.6016f, 45.3008f, 45f, 45f)
                    curveTo(47.6992f, 42.6992f, 48.4063f, 38.0078f, 47.9063f, 37.4063f)
                    curveTo(47.6055f, 36.9063f, 46.1953f, 36.5938f, 44.5938f, 36.5938f)
                    close()
                    moveTo(2.1875f, 37.5f)
                    curveTo(1.8867f, 37.5f, 1.6953f, 38.0117f, 2.0938f, 38.3125f)
                    curveTo(8.0938f, 43.7109f, 16.0078f, 47f, 24.9063f, 47f)
                    curveTo(31.207f, 47f, 38.4922f, 45.0117f, 43.5938f, 41.3125f)
                    curveTo(44.3945f, 40.7109f, 43.707f, 39.6953f, 42.9063f, 40.0938f)
                    curveTo(37.207f, 42.4922f, 31.1016f, 43.6875f, 25.5f, 43.6875f)
                    curveTo(17.1992f, 43.6875f, 9.1875f, 41.3867f, 2.6875f, 37.6875f)
                    curveTo(2.4883f, 37.4883f, 2.2891f, 37.5f, 2.1875f, 37.5f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberTwitter(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Twitter",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 50.0f,
                viewportHeight = 50.0f
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
                    moveTo(50.0625f, 10.4375f)
                    curveTo(48.2148f, 11.2578f, 46.2344f, 11.8086f, 44.1523f, 12.0586f)
                    curveTo(46.2773f, 10.7852f, 47.9102f, 8.7695f, 48.6758f, 6.3711f)
                    curveTo(46.6914f, 7.5469f, 44.4844f, 8.4023f, 42.1445f, 8.8633f)
                    curveTo(40.2695f, 6.8633f, 37.5977f, 5.6172f, 34.6406f, 5.6172f)
                    curveTo(28.9609f, 5.6172f, 24.3555f, 10.2188f, 24.3555f, 15.8984f)
                    curveTo(24.3555f, 16.7031f, 24.4492f, 17.4883f, 24.625f, 18.2422f)
                    curveTo(16.0781f, 17.8125f, 8.5039f, 13.7188f, 3.4297f, 7.4961f)
                    curveTo(2.543f, 9.0195f, 2.0391f, 10.7852f, 2.0391f, 12.668f)
                    curveTo(2.0391f, 16.2344f, 3.8516f, 19.3828f, 6.6133f, 21.2305f)
                    curveTo(4.9258f, 21.1758f, 3.3398f, 20.7109f, 1.9531f, 19.9414f)
                    curveTo(1.9531f, 19.9844f, 1.9531f, 20.0273f, 1.9531f, 20.0703f)
                    curveTo(1.9531f, 25.0547f, 5.5f, 29.207f, 10.1992f, 30.1563f)
                    curveTo(9.3398f, 30.3906f, 8.4297f, 30.5156f, 7.4922f, 30.5156f)
                    curveTo(6.8281f, 30.5156f, 6.1836f, 30.4531f, 5.5547f, 30.3281f)
                    curveTo(6.8672f, 34.4102f, 10.6641f, 37.3906f, 15.1602f, 37.4727f)
                    curveTo(11.6445f, 40.2305f, 7.2109f, 41.8711f, 2.3906f, 41.8711f)
                    curveTo(1.5586f, 41.8711f, 0.7422f, 41.8242f, -0.0586f, 41.7266f)
                    curveTo(4.4883f, 44.6484f, 9.8945f, 46.3477f, 15.7031f, 46.3477f)
                    curveTo(34.6172f, 46.3477f, 44.9609f, 30.6797f, 44.9609f, 17.0938f)
                    curveTo(44.9609f, 16.6484f, 44.9492f, 16.1992f, 44.9336f, 15.7617f)
                    curveTo(46.9414f, 14.3125f, 48.6836f, 12.5f, 50.0625f, 10.4375f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberApple(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Apple",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 50.0f,
                viewportHeight = 50.0f
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
                    moveTo(44.5273f, 34.75f)
                    curveTo(43.4492f, 37.1445f, 42.9297f, 38.2148f, 41.543f, 40.3281f)
                    curveTo(39.6016f, 43.2813f, 36.8633f, 46.9688f, 33.4805f, 46.9922f)
                    curveTo(30.4688f, 47.0195f, 29.6914f, 45.0273f, 25.6016f, 45.0625f)
                    curveTo(21.5156f, 45.082f, 20.6641f, 47.0313f, 17.6484f, 47f)
                    curveTo(14.2617f, 46.9688f, 11.6719f, 43.6484f, 9.7305f, 40.6992f)
                    curveTo(4.3008f, 32.4297f, 3.7266f, 22.7344f, 7.082f, 17.5781f)
                    curveTo(9.457f, 13.9219f, 13.2109f, 11.7734f, 16.7383f, 11.7734f)
                    curveTo(20.332f, 11.7734f, 22.5898f, 13.7461f, 25.5586f, 13.7461f)
                    curveTo(28.4414f, 13.7461f, 30.1953f, 11.7695f, 34.3516f, 11.7695f)
                    curveTo(37.4922f, 11.7695f, 40.8125f, 13.4805f, 43.1875f, 16.4336f)
                    curveTo(35.4219f, 20.6914f, 36.6836f, 31.7813f, 44.5273f, 34.75f)
                    close()
                    moveTo(31.1953f, 8.4688f)
                    curveTo(32.707f, 6.5273f, 33.8555f, 3.7891f, 33.4375f, 1f)
                    curveTo(30.9727f, 1.168f, 28.0898f, 2.7422f, 26.4063f, 4.7813f)
                    curveTo(24.8789f, 6.6406f, 23.6133f, 9.3984f, 24.1055f, 12.0664f)
                    curveTo(26.7969f, 12.1523f, 29.582f, 10.5469f, 31.1953f, 8.4688f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberFacebook(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Facebook",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 50.0f,
                viewportHeight = 50.0f
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
                    moveTo(25f, 3f)
                    curveTo(12.85f, 3f, 3f, 12.85f, 3f, 25f)
                    curveToRelative(0f, 11.03f, 8.125f, 20.137f, 18.712f, 21.728f)
                    verticalLineTo(30.831f)
                    horizontalLineToRelative(-5.443f)
                    verticalLineToRelative(-5.783f)
                    horizontalLineToRelative(5.443f)
                    verticalLineToRelative(-3.848f)
//                    cubicRelativeTo(0f, -6.371f, 3.104f, -9.168f, 8.399f, -9.168f)
                    curveToRelative(0f, -6.371f, 3.104f, -9.168f, 8.399f, -9.168f)
                    curveToRelative(2.536f, 0f, 3.877f, 0.188f, 4.512f, 0.274f)
                    verticalLineToRelative(5.048f)
                    horizontalLineToRelative(-3.612f)
                    curveToRelative(-2.248f, 0f, -3.033f, 2.131f, -3.033f, 4.533f)
                    verticalLineToRelative(3.161f)
                    horizontalLineToRelative(6.588f)
                    lineToRelative(-0.894f, 5.783f)
                    horizontalLineToRelative(-5.694f)
                    verticalLineToRelative(15.944f)
                    curveTo(38.716f, 45.318f, 47f, 36.137f, 47f, 25f)
                    curveTo(47f, 12.85f, 37.15f, 3f, 25f, 3f)
                    close()
                }
            }.build()
        }
    }

    @Composable
    fun rememberGoogle(): ImageVector {
        return remember {
            ImageVector.Builder(
                name = "Google",
                defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp,
                viewportWidth = 48.0f,
                viewportHeight = 48.0f
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
                    moveTo(43.611f, 20.083f)
                    horizontalLineTo(42f)
                    verticalLineTo(20f)
                    horizontalLineTo(24f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(11.303f)
                    curveToRelative(-1.649f, 4.657f, -6.08f, 8f, -11.303f, 8f)
                    curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                    curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                    curveToRelative(3.059f, 0f, 5.842f, 1.154f, 7.961f, 3.039f)
                    lineToRelative(5.657f, -5.657f)

                    curveTo(34.046f, 6.053f, 29.268f, 4f, 24f, 4f)
                    curveTo(12.955f, 4f, 4f, 12.955f, 4f, 24f)
                    curveToRelative(0f, 11.045f, 8.955f, 20f, 20f, 20f)
                    curveToRelative(11.045f, 0f, 20f, -8.955f, 20f, -20f)
                    curveTo(44f, 22.659f, 43.862f, 21.35f, 43.611f, 20.083f)
                    close()
                }
            }.build()
        }
    }

    Column(
        modifier = Modifier
            .safeContentPadding()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(0xFFEA4335),
            imageVector = rememberGoogle(),
            text = "Continue with Google"
        )
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(0xFF1877F2),
            imageVector = rememberFacebook(),
            text = "Continue with Facebook"
        )
        SocialLoginButton(
            onClick = { /*TODO*/ },
            // twitter
            backgroundColor = Color(0xFF1DA1F2),
            imageVector = rememberTwitter(),
            text = "Continue with Twitter"
        )
        // linked in
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(0xFF0077B5),
            imageVector = rememberLinkedIn(),
            text = "Continue with LinkedIn"
        )
        // github
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(0xFF333333),
            imageVector = rememberGithub(),
            text = "Continue with Github"
        )
        // Amazon
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(0xFFFF9900),
            imageVector = rememberAmazon(),
            text = "Continue with Amazon"
        )
        // Apple
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color.Black,
            imageVector = rememberApple(),
            text = "Continue with Apple"
        )
        // Telegram
        SocialLoginButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(0xFF229ED9),
            imageVector = rememberTelegram(),
            text = "Continue with Telegram"
        )
    }
}

@Composable
fun SocialLoginButton(
    onClick: () -> Unit,
    backgroundColor: Color,
    contentColor: Color = Color.White,
    imageVector: ImageVector,
    text: String,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor,
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
            Text(text)
        }
    }
}