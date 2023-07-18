package dev.vengateshm.composableshub.components.list_views

import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ListViewWithIconPreview() {
    ListViewWithIcon()
}

@Composable
fun ListViewWithIcon() {
    LazyColumn {
        item {
            IconListItem(
                icon = Icons.Outlined.Star,
                title = "Saved Places",
                subtitle = null
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Willowbrook Cafe",
                subtitle = "23 Elm Street, Willowbrook, Meadowshire"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Stonebridge Harbor Resort",
                subtitle = "67 Dockside Drive, Stonebridge, Seaview County"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Cedarwood Heights Library",
                subtitle = "89 Oak Avenue, Cedarwood, Green Valley"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Rosewater Gardens Spa",
                subtitle = "45 Lily Lane, Rosewater, Blossom County"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Goldenleaf Valley Inn",
                subtitle = "12 Maple Road, Goldenleaf, Sunburst Township"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Whispering Pines Retreat Center",
                subtitle = "34 Tranquil Trail, Whispering Pines, Serenity Hills"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Silverbrook Springs Medical Clinic",
                subtitle = "56 Brookside Drive, Silverbrook, Crystal County"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Willowbrook Hills Shopping Mall",
                subtitle = "78 Meadow Lane, Willowbrook, Hillside Township"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Summerfield Meadows Park",
                subtitle = "90 Sunshine Avenue, Summerfield, Meadow County"
            )
        }

        item {
            IconListItem(
                icon = Icons.Outlined.LocationOn,
                title = "Autumnwood Grove Airport",
                subtitle = "123 Maple Avenue, Autumnwood, Groveville"
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IconListItem(icon: ImageVector, title: String, subtitle: String?) {
    Surface(
        onClick = { /* TODO */ },
        shape = MaterialTheme.shapes.large
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(
                imageVector = icon,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.surfaceVariant, CircleShape)
                    .padding(8.dp)
                    .size(24.dp)
                    .clip(CircleShape),
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                contentDescription = null
            )
            Column {
                Text(
                    text = title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                if (subtitle != null) {
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodyMedium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}