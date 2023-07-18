package dev.vengateshm.composableshub.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen() {
    var composingText by remember { mutableStateOf("") }
    Scaffold(containerColor = MaterialTheme.colorScheme.surface, topBar = {
        TopAppBar(title = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ChatAvatar(
                    isOnline = true
                )
                Column {
                    Text(
                        text = "Dream Holidays Bot",
                        style = MaterialTheme.typography.titleMedium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Typically replies within 15 minutes",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    )
                }
            }
        }, navigationIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    Icons.Rounded.ArrowBack, contentDescription = "Go Back"
                )
            }
        }, actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Rounded.Phone, contentDescription = "Call"
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Rounded.MoreVert, contentDescription = "Menu"
                )
            }
        })
    }) { padding ->
        Column {
            val state = rememberLazyListState()
            LaunchedEffect(Unit) {
                // scroll to the most recent item when you start the screen
                state.scrollToItem(Int.MAX_VALUE)
            }
            LazyColumn(
                contentPadding = padding, modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(), state = state
            ) {
                item {
                    ConversationHeader(
                        text = "Today"
                    )
                }
                item {
                    IncomingMessage(
                        text = "Hello! Let's book your next holiday. Where would you like to go?"
                    )
                }
                item {
                    OutgoingMessage(
                        text = "Bahamas"
                    )
                }
                item {
                    IncomingMessage(
                        text = "What type of room would like?"
                    )
                }
                item {
                    OptionPickerMessage(
                        options = listOf("Single", "Double", "Suite", "Other"),
                        onOptionSelected = {
                            /* TODO */
                        })
                }
            }
            ComposerBar(onSendClick = { /* TODO */ }, text = composingText, onTextChange = {
                composingText = it
            })
        }
    }
}

@Composable
fun OutgoingMessage(text: String) {
    Box(
        modifier = Modifier
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
            .fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        val bubbleColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.12f)
        Surface(
            shape = MaterialTheme.shapes.medium.copy(
                bottomEnd = CornerSize(4.dp)
            ),
            color = bubbleColor
        ) {
            Text(
                text = text,
                modifier = Modifier.padding(12.dp),
                color = contentColorFor(backgroundColor = bubbleColor)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionPickerMessage(
    options: List<String>,
    onOptionSelected: (index: Int) -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(
                horizontal = 16.dp
            )
    ) {
        Text(
            text = "Pick an option",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(
                horizontal = 0.dp, vertical = 8.dp
            )
        )
        options.forEachIndexed { index, option ->
            SuggestionChip(
                shape = MaterialTheme.shapes.medium,
                onClick = { onOptionSelected(index) },
                label = {
                    Text(
                        text = option,
                        modifier = Modifier
                            .padding(
                                vertical = 12.dp
                            )
                    )
                })
        }
    }
}

@Composable
fun IncomingMessage(
    text: String,
) {
    Row(
        modifier = Modifier
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
            .fillMaxWidth(0.9f),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val bubbleColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.12f)
        Surface(
            shape = MaterialTheme.shapes.medium.copy(bottomStart = CornerSize(4.dp)),
            color = bubbleColor
        ) {
            Text(
                text,
                modifier = Modifier.padding(12.dp),
                color = contentColorFor(backgroundColor = bubbleColor)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposerBar(
    onSendClick: () -> Unit,
    text: String,
    onTextChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val isSendingAllowed = text.isNotBlank()
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(shape = RoundedCornerShape(100),
            modifier = Modifier.weight(1f),
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions(
                onSend = {
                    if (isSendingAllowed) {
                        onSendClick()
                    }
                }),
            value = text,
            onValueChange = onTextChange,
            placeholder = { Text("Type your message here...") })
        IconButton(
            onClick = onSendClick,
            enabled = isSendingAllowed
        ) {
            Icon(
                imageVector = Icons.Rounded.Send,
                contentDescription = "Send",
                tint = if (isSendingAllowed) {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.onBackground.copy(alpha = 0.33f)
                }
            )
        }
    }
}

@Composable
fun ChatAvatar(
    isOnline: Boolean, modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    Box(modifier.size(40.dp)) {
        AsyncImage(
            model = ImageRequest.Builder(context)
                .data("https://images.unsplash.com/photo-1540541338287-41700207dee6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1770&q=80")
                .crossfade(true).build(),
            modifier = Modifier
                .matchParentSize()
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            contentDescription = "Woof photo"
        )
        if (isOnline) {
            Box(
                Modifier
                    .size(12.dp)
                    .clip(CircleShape)
                    .border(2.dp, MaterialTheme.colorScheme.surface, CircleShape)
                    .background(Color(0xFF00C853))
                    .align(Alignment.BottomEnd)
            )
        }
    }
}

@Composable
fun ConversationHeader(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        Text(
            text = text,
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.labelMedium
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}

/*
@Composable
fun DatePickerMessage(
    onDatePicked: (dateInMillis: Long) -> Unit,
) {
    val datePickerState = rememberDatePickerState(
        initialDisplayMode = DisplayMode.Picker,
    )
    LaunchedEffect(datePickerState.selectedDateMillis) {
        if (datePickerState.selectedDateMillis != null) {
            onDatePicked(datePickerState.selectedDateMillis!!)
        }
    }
    Row(
        modifier = Modifier.padding(
            horizontal = 16.dp, vertical = 8.dp
        ), horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val bubbleColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.12f)
        Surface(
            shape = MaterialTheme.shapes.medium.copy(bottomStart = CornerSize(4.dp)),
            color = bubbleColor
        ) {
            Box(
                modifier = Modifier.padding(12.dp)
            ) {
                DatePicker(
                    state = datePickerState,
                    title = null,
                    headline = null,
                    showModeToggle = false
                )
            }
        }
    }
}*/
