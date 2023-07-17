package dev.vengateshm.composableshub.components.list_views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun ListViewWithTruncatedContent() {
    LazyColumn {
        item {
            ListItemTruncatedContent(
                photoUrl = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Ava Johnson",
                content = "Hey! Just wanted to let you know that I got the tickets for the concert. Can't wait to go together!",
                label = "Today",
            )
        }
        item {
            ListItemTruncatedContent(
                photoUrl = "https://images.unsplash.com/photo-1580518380430-2f84c0a7fb85?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=256&q=80",
                title = "Adrian Thompson",
                content = "Happy birthday! Wishing you an amazing day filled with joy, laughter, and lots of cake!",
                label = "1d ago"
            )
        }
        item {
            ListItemTruncatedContent(
                photoUrl = "https://images.unsplash.com/photo-1554151228-14d9def656e4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&&w=256&q=80",
                title = "Amelia Rodriguez",
                content = "Meeting at 3 pm sounds good. Let's discuss the agenda and prepare some ideas beforehand.",
                label = "2d ago"
            )
        }
        item {
            ListItemTruncatedContent(
                photoUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Aaron Smith",
                content = "Congratulations on your new job! You've worked hard for this opportunity. Proud of you!",
                label = "2d ago"
            )
        }
        item {
            ListItemTruncatedContent(
                photoUrl = "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80",
                title = "Alice Bennett",
                content = "I miss you! It's been too long since we last caught up. Let's plan a coffee date soon!",
                label = "4d ago"
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListItemTruncatedContent(photoUrl: String, title: String, content: String, label: String) {
    val context = LocalContext.current

    Surface(
        onClick = { /* TODO */ },
        shape = MaterialTheme.shapes.large
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(photoUrl)
                    .crossfade(true)
                    .build(),
                modifier = Modifier
                    .size(58.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            Column(Modifier.weight(1f)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = title,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = label,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                Spacer(Modifier.height(4.dp))
                Text(
                    text = content,
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}