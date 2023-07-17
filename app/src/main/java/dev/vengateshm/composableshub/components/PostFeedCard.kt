package dev.vengateshm.composableshub.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun FeedPosts() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(10) {
            PostCard()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostCard() {
    val context = LocalContext.current
    Card(Modifier.fillMaxWidth()) {
        Column {
            Row(
                Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://images.unsplash.com/photo-1580518380430-2f84c0a7fb85?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80")
                        .crossfade(true)
                        .build(),
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(48.dp),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Profile photo"
                )
                Column {
                    Text("Dj Influence", style = MaterialTheme.typography.bodyMedium)
                    Spacer(Modifier.height(4.dp))
                    Text("@dj_influence", style = MaterialTheme.typography.bodySmall)
                }
            }
            Text(
                "Had a mad night at the House Party Inc yesterday. Thankful for all of you who had a blast with us!",
                maxLines = 4,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(Modifier.height(16.dp))
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data("https://images.unsplash.com/photo-1516450360452-9312f5e86fc7?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
                    .crossfade(true)
                    .build(),
                modifier = Modifier
                    .aspectRatio(16 / 9f),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Surface(
                    onClick = { /*TODO*/ },
                    color = Color.Transparent,
                    shape = MaterialTheme.shapes.medium,
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(Icons.Rounded.FavoriteBorder, contentDescription = "Likes")
                        Text("3.2 M")
                    }
                }
                Surface(
                    onClick = { /*TODO*/ },
                    color = Color.Transparent,
                    shape = MaterialTheme.shapes.medium,
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(Icons.Outlined.Share, contentDescription = "Shares")
                        Text("1.8 M")
                    }
                }
                Surface(
                    onClick = { /*TODO*/ },
                    color = Color.Transparent,
                    shape = MaterialTheme.shapes.medium,
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(Icons.Outlined.Send, contentDescription = "Forwards")
                        Text("3.6 M")
                    }
                }
            }
        }
    }
}