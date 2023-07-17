package dev.vengateshm.composableshub.components.list_views

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ListViewWithStickyHeaders() {
    LazyColumn {
        stickyHeader {
            HeaderItem(
                title = "A",
                modifier = Modifier.fillMaxWidth()
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Ava Johnson",
                subtitle = "ava@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1580518380430-2f84c0a7fb85?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=256&q=80",
                title = "Adrian Thompson",
                subtitle = "adrian@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1554151228-14d9def656e4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&&w=256&q=80",
                title = "Amelia Rodriguez",
                subtitle = "amelia@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Aaron Smith",
                subtitle = "aaron.smith@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80",
                title = "Alice Bennett",
                subtitle = "alice.bennett@example.com"
            )
        }
        stickyHeader {
            HeaderItem(
                title = "B",
                modifier = Modifier.fillMaxWidth()
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1500648767791-00dcc994a43e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Benjamin Davis",
                subtitle = "benjamin@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1544005313-94ddf0286df2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Bella Anderson",
                subtitle = "bella@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1552058544-f2b08422138a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Bradley Campbell",
                subtitle = "bradley@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Brooke Mitchell",
                subtitle = "brooke@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1545167622-3a6ac756afa4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Brandon Wilson",
                subtitle = "brandon@example.com"
            )
        }
        stickyHeader {
            HeaderItem(
                title = "C",
                modifier = Modifier.fillMaxWidth()
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1539571696357-5a69c17a67c6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Caleb Anderson",
                subtitle = "caleb@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Chloe Roberts",
                subtitle = "chloe@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1610186594416-2c7c0131e35d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Connor Thompson",
                subtitle = "connor@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1623580890503-9f7dca11d8ae?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Claire Parker",
                subtitle = "claire@example.com"
            )
        }
        item {
            ListItem1(
                photoUrl = "https://images.unsplash.com/photo-1622559924472-2c2f69abb854?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80",
                title = "Christopher Harris",
                subtitle = "christopher@example.com"
            )
        }
    }
}

@Composable
fun HeaderItem(
    title: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            maxLines = 1,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListItem1(photoUrl: String, title: String, subtitle: String) {
    val context = LocalContext.current

    Surface(
        onClick = { /* TODO */ },
        shape = MaterialTheme.shapes.large,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 2.dp, top = 16.dp, bottom = 16.dp)
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
                Text(
                    text = title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Box {
                var isExpanded by remember { mutableStateOf(false) }

                IconButton(onClick = { isExpanded = true }) {
                    Icon(Icons.Rounded.MoreVert, contentDescription = "More")
                }

                DropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                    DropdownMenuItem(text = { Text("Message") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Block") }, onClick = { /*TODO*/ })
                }
            }
        }
    }
}