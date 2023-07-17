package dev.vengateshm.composableshub.screens.settings

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.vengateshm.composableshub.screens.settings.imageVectors.rememberAutoAwesome
import dev.vengateshm.composableshub.screens.settings.imageVectors.rememberCreditCard
import dev.vengateshm.composableshub.screens.settings.imageVectors.rememberDescription
import dev.vengateshm.composableshub.screens.settings.imageVectors.rememberHandshake
import dev.vengateshm.composableshub.screens.settings.imageVectors.rememberQuestionMark
import dev.vengateshm.composableshub.screens.settings.imageVectors.rememberStyle


@Preview
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen() {
    val listState = rememberLazyListState()
    val hasScrolled by remember {
        derivedStateOf {
            listState.firstVisibleItemScrollOffset > 0
        }
    }
    val appBarElevation by animateDpAsState(
        targetValue = if (hasScrolled) {
            8.dp
        } else {
            0.dp
        }
    )
    Scaffold(
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = if (isSystemInDarkTheme()) {
                        MaterialTheme.colorScheme.surfaceVariant.copy(
                            alpha = if (hasScrolled) 1f else 0f
                        )
                    } else {
                        MaterialTheme.colorScheme.surface
                    },
                ),
                modifier = Modifier.shadow(appBarElevation),
                title = { Text(text = "Settings") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Rounded.ArrowBack,
                            contentDescription = "Go back"
                        )
                    }
                },
                actions = { },
            )
        },
    ) { padding ->
        LazyColumn(
            contentPadding = padding,
            state = listState
        ) {
            item {
                CategoryItem(
                    title = "Account",
                    icon = Icons.Outlined.AccountCircle,
                    onClick = { /*TODO*/ }
                )
            }

            item {

                CategoryItem(
                    title = "Payment methods",
                    icon = rememberCreditCard(),
                    onClick = { /*TODO*/ }
                )
            }

            item {
                CategoryItem(
                    title = "Privacy",
                    icon = Icons.Outlined.Lock,
                    onClick = { /*TODO*/ }
                )
            }

            item {
                CategoryItem(
                    title = "Notifications",
                    icon = Icons.Outlined.Notifications,
                    onClick = { /*TODO*/ }
                )
            }

            item {
                CategoryItem(
                    title = "Look & Feel",
                    icon = rememberStyle(),
                    onClick = { /*TODO*/ }
                )
            }
            item { Divider(modifier = Modifier.padding(vertical = 12.dp)) }
            item {
                CategoryItem(
                    title = "FAQ",
                    icon = rememberQuestionMark(),
                    onClick = { /*TODO*/ }
                )
            }
            item {
                CategoryItem(
                    title = "Send Feedback",
                    icon = Icons.Outlined.Email,
                    onClick = { /*TODO*/ }
                )
            }
            item {
                CategoryItem(
                    title = "See what's new",
                    icon = rememberAutoAwesome(),
                    onClick = { /*TODO*/ }
                )
            }
            item { Divider(modifier = Modifier.padding(vertical = 12.dp)) }
            item {
                CategoryItem(
                    title = "Legal",
                    icon = rememberDescription(),
                    onClick = { /*TODO*/ }
                )
            }
            item {
                CategoryItem(
                    title = "Licenses",
                    icon = rememberHandshake(),
                    onClick = { /*TODO*/ }
                )
            }
            item { Divider(modifier = Modifier.padding(vertical = 12.dp)) }
            item {
                AppVersion(
                    versionText = "Version 1.0.0",
                    copyrights = "© 2023 Your Company",
                    onClick = { /* TODO Add easter egg after 8 times is clicked */ }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryItem(
    title: String,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    Surface(
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Icon(
                icon,
                contentDescription = null,
                modifier = Modifier.size(28.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
            Text(title, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppVersion(
    versionText: String,
    copyrights: String,
    onClick: () -> Unit,
) {
    Surface(onClick = onClick) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Box(
                modifier = Modifier.size(30.dp),
            )

            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    versionText,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.44f)
                )
                Text(
                    copyrights,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.44f)
                )
            }
        }
    }
}