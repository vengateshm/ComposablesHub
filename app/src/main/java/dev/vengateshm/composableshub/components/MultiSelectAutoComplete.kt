package dev.vengateshm.composableshub.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import coil.compose.AsyncImage

// TODO replace Map<String,String> with your data model
val items = listOf(
    mapOf(
        "displayName" to "John Doe",
        "email" to "john.doe@example.com",
        "image" to "https://images.unsplash.com/photo-1580518380430-2f84c0a7fb85?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=256&q=80"
    ),
    mapOf(
        "displayName" to "Jane Smith",
        "email" to "jane.smith@example.com",
        "image" to "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=256&q=80"
    ),
    mapOf(
        "displayName" to "Michael Johnson",
        "email" to "michael.johnson@example.com",
        "image" to "https://images.unsplash.com/photo-1534614971-6be99a7a3ffd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=256&q=80"
    ),
    mapOf(
        "displayName" to "Emily Wilson",
        "email" to "emily.wilson@example.com",
        "image" to "https://images.unsplash.com/photo-1554151228-14d9def656e4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"
    ),
    mapOf(
        "displayName" to "David Brown",
        "email" to "david.brown@example.com",
        "image" to "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"
    ),
    mapOf(
        "displayName" to "Sarah Thompson",
        "email" to "sarah.thompson@example.com",
        "image" to "https://images.unsplash.com/photo-1580489944761-15a19d654956?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"
    )
)

@Composable
fun MultiselectAutocomplete() {
    var searchQuery by remember { mutableStateOf("") }
    var selected by remember { mutableStateOf(emptyList<Map<String, String>>()) }

    MultiselectAutocomplete(
        modifier = Modifier.fillMaxWidth(),
        searchQuery = { searchQuery },
        onItemSelected = { item ->
            searchQuery = ""
            selected = selected + item
        },
        onItemRemoved = { item ->
            selected = selected - item
        },
        items = items,
        selectedItems = selected,
        onSearchQueryChanged = {
            searchQuery = it
        }
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MultiselectAutocomplete(
    searchQuery: () -> String,
    onSearchQueryChanged: (String) -> Unit,
    onItemSelected: (Map<String, String>) -> Unit,
    items: List<Map<String, String>>,
    onItemRemoved: (Map<String, String>) -> Unit,
    selectedItems: List<Map<String, String>>,
    modifier: Modifier = Modifier,
) {
    val textInputFocusRequester = remember { FocusRequester() }
    var expanded by remember { mutableStateOf(false) }

    val filteredItems by remember(searchQuery) {
        derivedStateOf {
            items.filter { item ->
                val displayName = item["displayName"] ?: ""
                searchQuery().isNotBlank() && displayName.contains(
                    searchQuery(), ignoreCase = true
                ) && selectedItems.contains(item).not()
            }
        }
    }

    var textFieldWidth by remember { mutableStateOf(IntSize.Zero) }
    Box(modifier.padding(horizontal = 16.dp)) {
        Row(
            modifier = Modifier
                .onSizeChanged {
                    textFieldWidth = it
                }
                .fillMaxWidth(),
            verticalAlignment = Alignment.Top,
        ) {
            Text("To", modifier = Modifier.padding(top = 4.dp))
            Spacer(Modifier.width(16.dp))
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                        onClick = {
                            textInputFocusRequester.requestFocus()
                        }
                    )
            ) {
                selectedItems
                    .forEach { item ->
                        Surface(
                            color = MaterialTheme.colorScheme.secondaryContainer,
                            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                            shape = RoundedCornerShape(100)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AsyncImage(
                                    model = item["image"] ?: "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .size(32.dp),
                                    contentDescription = null
                                )
                                Text(
                                    text = item["displayName"] ?: "",
                                    modifier = Modifier.padding(
                                        start = 8.dp,
                                        end = 4.dp
                                    ),
                                    style = MaterialTheme.typography.bodyMedium
                                )
                                IconButton(
                                    onClick = { onItemRemoved(item) },
                                    modifier = Modifier.size(32.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.Clear,
                                        contentDescription = "Remove",
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                        }
                    }
                BasicTextField(
                    value = searchQuery(),
                    modifier = Modifier
                        .focusRequester(textInputFocusRequester)
                        .weight(1f)
                        .padding(top = 4.dp),
                    onValueChange = {
                        expanded = it.isNotBlank()
                        onSearchQueryChanged(it)
                    },
                    singleLine = true,
                    textStyle = MaterialTheme.typography.bodyLarge,
                )
            }
        }

        DropdownMenu(
            offset = DpOffset(0.dp, 8.dp),
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
                        Column(Modifier.fillMaxWidth()) {
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
                        textInputFocusRequester.requestFocus()
                        onItemSelected(item)
                        expanded = false
                    },
                )
            }
        }
    }
}