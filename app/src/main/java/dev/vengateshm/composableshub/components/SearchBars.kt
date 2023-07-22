package dev.vengateshm.composableshub.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.vengateshm.composableshub.materialSymbols.rememberHistory
import dev.vengateshm.composableshub.materialSymbols.rememberMic

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarNormal() {
    val suggestions = remember {
        listOf("Android", "Java", "Kotlin")
    }
    var query by remember { mutableStateOf("") }
    var onActive by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SearchBar(
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            },
            placeholder = { Text(text = "Search") },
            query = query,
            onQueryChange = {
                query = it
            }, onSearch = {
                println("Searching for $query")
            }, active = onActive, onActiveChange = {
                onActive = it
            },
            trailingIcon = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = rememberMic(),
                        contentDescription = "Mic Icon"
                    )
                    if (onActive) {
                        Icon(
                            modifier = Modifier.clickable {
                                if (query.isNotEmpty()) query = "" else onActive = false
                            },
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Clear Icon"
                        )
                    }
                }
            }) {
            suggestions.forEach {
                SearchSuggestionItem(item = it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarDocked() {
    val suggestions = remember {
        listOf("Android", "Java", "Kotlin")
    }
    var query by remember { mutableStateOf("") }
    var onActive by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        DockedSearchBar(
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            },
            placeholder = { Text(text = "Search") },
            query = query,
            onQueryChange = {
                query = it
            }, onSearch = {
                println("Searching for $query")
            }, active = onActive, onActiveChange = {
                onActive = it
            },
            trailingIcon = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = rememberMic(),
                        contentDescription = "Mic Icon"
                    )
                    if (onActive) {
                        Icon(
                            modifier = Modifier.clickable {
                                if (query.isNotEmpty()) query = "" else onActive = false
                            },
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Clear Icon"
                        )
                    }
                }
            }) {
            suggestions.forEach {
                SearchSuggestionItem(item = it)
            }
        }
    }
}

@Composable
fun SearchSuggestionItem(item: String) {
    ListItem(
        headlineContent = { Text(text = item) },
        leadingContent = { Icon(imageVector = rememberHistory(), contentDescription = "") }
    )
}