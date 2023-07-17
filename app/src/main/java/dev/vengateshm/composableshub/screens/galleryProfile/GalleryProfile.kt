package dev.vengateshm.composableshub.screens.galleryProfile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import dev.vengateshm.composableshub.screens.galleryProfile.GalleryPhotos.photos


@Preview
@Composable
fun GalleryProfilePreview() {
    GalleryProfile()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GalleryProfile() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) { padding ->
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Fixed(3),
            horizontalArrangement = Arrangement.spacedBy(2.dp),
            verticalArrangement = Arrangement.spacedBy(2.dp),
            contentPadding = PaddingValues(
                bottom = padding.calculateBottomPadding() + 8.dp
            )
        ) {
            item(span = { GridItemSpan(3) }) {
                Column(
                    Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .padding(bottom = 24.dp)
                ) {
                    TopAppBar(
                        title = {
                            Text(
                                "Madison Rose",
                                maxLines = 1,
                                fontWeight = FontWeight.Medium,
                                overflow = TextOverflow.Ellipsis
                            )
                        },
                        navigationIcon = {
                            IconButton(onClick = { /* TODO */ }) {
                                Icon(
                                    imageVector = Icons.Filled.ArrowBack,
                                    contentDescription = "Go back"
                                )
                            }
                        },
                        actions = {
                            IconButton(onClick = { /* TODO */ }) {
                                Icon(
                                    imageVector = Icons.Filled.MoreVert,
                                    contentDescription = "More"
                                )
                            }
                        }
                    )
                    Column(
                        Modifier.padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                shape = CircleShape,
                                onClick = { /* TODO */ },
                                modifier = Modifier
                                    .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                                    .padding(6.dp)
                            ) {
                                AsyncImage(
                                    model = ImageRequest.Builder(LocalContext.current)
                                        .data("https://images.unsplash.com/photo-1516908205727-40afad9449a8?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=778&q=80")
                                        .crossfade(true)
                                        .build(),
                                    modifier = Modifier.size(72.dp),
                                    contentScale = ContentScale.Crop,
                                    contentDescription = "Profile photo",
                                )
                            }

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text("12.2 K", style = MaterialTheme.typography.bodyLarge)
                                Text("Posts", style = MaterialTheme.typography.bodySmall)
                            }

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text("602 K", style = MaterialTheme.typography.bodyLarge)
                                Text("Followers", style = MaterialTheme.typography.bodySmall)
                            }

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text("505", style = MaterialTheme.typography.bodyLarge)
                                Text("Following", style = MaterialTheme.typography.bodySmall)
                            }
                        }

                        Text("Lover of all things fashion, travel and fitness! Follow my adventures around the world ✨")

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.weight(1f)
                            ) {
                                Text("Follow")
                            }

                            OutlinedButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.weight(1f)
                            ) {
                                Text("Message")
                            }
                        }
                    }
                }
            }

            items(photos) { photo ->
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(photo)
                        .crossfade(true)
                        .build(),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f),
                    contentDescription = "Post photo",
                )
            }
        }
    }
}