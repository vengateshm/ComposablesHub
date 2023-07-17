package dev.vengateshm.composableshub.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import coil.compose.AsyncImage

@Composable
fun AutocompleteWithImages() {
    var searchQuery by remember { mutableStateOf("") }

    AutoCompleteWithImages(
        modifier = Modifier.fillMaxWidth(),
        searchQuery = { searchQuery },
        onItemSelected = { item ->
            searchQuery = item["displayName"] ?: ""
        },
        items = items,
        label = "Recipient",
        onSearchQueryChanged = {
            searchQuery = it
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AutoCompleteWithImages(
    label: String,
    searchQuery: () -> String,
    onSearchQueryChanged: (String) -> Unit,
    onItemSelected: (Map<String, String>) -> Unit,
    items: List<Map<String, String>>,
    modifier: Modifier = Modifier,
) {
    val focusManager = LocalFocusManager.current
    var expanded by remember { mutableStateOf(false) }

    val filteredItems by remember(searchQuery) {
        derivedStateOf {
            items.filter { item ->
                val displayName = item["displayName"] ?: ""
                searchQuery().isNotBlank() && displayName.contains(
                    searchQuery(), ignoreCase = true
                ) && displayName.lowercase() != searchQuery().lowercase()
            }
        }
    }

    var textFieldWidth by remember { mutableStateOf(IntSize.Zero) }

    Box(modifier.onSizeChanged {
        textFieldWidth = it
    }) {
        OutlinedTextField(
            label = { Text(label) },
            modifier = Modifier.fillMaxWidth(),
            value = searchQuery(),
            onValueChange = {
                expanded = it.isNotBlank()
                onSearchQueryChanged(it)
            },
            trailingIcon = {
                AnimatedVisibility(
                    visible = searchQuery().isNotBlank(),
                    enter = fadeIn(animationSpec = tween(350)),
                    exit = fadeOut(animationSpec = tween(450)),
                ) {
                    IconButton(onClick = { onSearchQueryChanged("") }) {
                        Icon(
                            imageVector = Icons.Rounded.Clear,
                            contentDescription = "Clear"
                        )
                    }
                }
            },
            singleLine = true
        )
        DropdownMenu(
            modifier = Modifier
                .then(with(LocalDensity.current) {
                    Modifier.width(width = textFieldWidth.width.toDp())
                })
                .heightIn(max = 200.dp),
            expanded = expanded && filteredItems.isNotEmpty(),
            onDismissRequest = { expanded = false },
            properties = PopupProperties(
                focusable = false, dismissOnBackPress = true, dismissOnClickOutside = true
            )
        ) {
            filteredItems.forEach { item ->
                val displayName = item["displayName"] ?: ""
                val email = item["email"] ?: ""
                val image = item["image"] ?: ""

                DropdownMenuItem(
                    leadingIcon = {
                        AsyncImage(
                            model = image,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(32.dp),
                            contentDescription = null,
                        )
                    },
                    text = {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = displayName,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                text = email,
                                maxLines = 1,
                                style = MaterialTheme.typography.bodyMedium,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    },
                    onClick = {
                        onItemSelected(item)
                        expanded = false
                        focusManager.clearFocus()
                    },
                )
            }
        }
    }
}