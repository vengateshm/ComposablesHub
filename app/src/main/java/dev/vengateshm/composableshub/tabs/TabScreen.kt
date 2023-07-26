package dev.vengateshm.composableshub.tabs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabLayoutSample() {
    val tabItems = remember {
        listOf(
            TabItem(title = "Dashboard", icon = TabIcons.Dashboard),
            TabItem(title = "Bookmarks", icon = TabIcons.Bookmarks),
            TabItem(title = "Settings", icon = TabIcons.Settings),
            TabItem(title = "Cloud Sync", icon = TabIcons.CloudSync),
        )
        /*listOf(
            TabItem(title = "Dashboard", icon = null),
            TabItem(title = "Bookmarks", icon =null),
            TabItem(title = "Settings", icon = null),
            TabItem(title = "Cloud Sync", icon = null),
        )*/
    }

    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = {
            tabItems.size
        }
    )
    val scope = rememberCoroutineScope()

    Column {
//        TabRow(selectedTabIndex = pagerState.currentPage) {
        ScrollableTabRow(selectedTabIndex = pagerState.currentPage,
            edgePadding = 0.dp) {
            tabItems.forEachIndexed { index, item ->
                TabView(
                    title = item.title,
                    icon = item.icon,
                    isSelected = pagerState.currentPage == index,
                    onClicked = {
                        scope.launch { pagerState.animateScrollToPage(index) }
                    }
                )
            }
        }
        HorizontalPager(state = pagerState) { currentPage ->
            TabScreen(title = tabItems[currentPage].title)
        }
    }
}

@Composable
fun TabView(
    title: String,
    icon: ImageVector?,
    isSelected: Boolean,
    onClicked: () -> Unit,
) {
    Tab(
        selected = isSelected,
        onClick = onClicked,
        text = {
            Text(text = title)
        },
        icon = if (icon != null) {
            {
                Icon(imageVector = icon, contentDescription = "$title tab icon")
            }
        } else null
    )
}

@Composable
fun TabScreen(title: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            fontSize = 32.sp
        )
    }
}