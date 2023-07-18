package dev.vengateshm.composableshub.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun ContentCard() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .clip(MaterialTheme.shapes.large)
            .clickable { /* TODO */ }
            .padding(16.dp)
    ) {
        Card(Modifier.fillMaxWidth()) {
            Box {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://images.unsplash.com/photo-1630673394533-b13bef31abf2?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
                        .crossfade(true)
                        .build(),
                    modifier = Modifier
                        .clip(MaterialTheme.shapes.medium)
                        .aspectRatio(16 / 9f)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Profile photo"
                )
                Text(
                    "16:41", style = MaterialTheme.typography.bodySmall,
                    color = Color.White,
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.BottomEnd)
                        .clip(MaterialTheme.shapes.small)
                        .background(Color.Black)
                        .padding(8.dp)
                )
            }
        }
        Spacer(Modifier.height(12.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data("https://images.unsplash.com/photo-1630673394533-b13bef31abf2?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
                    .crossfade(true)
                    .build(),
                modifier = Modifier
                    .size(52.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primaryContainer),
                contentScale = ContentScale.Crop,
                contentDescription = "Profile photo"
            )
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    "Tips & tricks for your next job interview",
                    maxLines = 1
                )
                Text("The PRO interviewer", style = MaterialTheme.typography.bodySmall)
                Text("93K views • 2 hours ago", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}