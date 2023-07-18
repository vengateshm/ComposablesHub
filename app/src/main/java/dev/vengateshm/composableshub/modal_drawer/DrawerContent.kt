package dev.vengateshm.composableshub.modal_drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import dev.vengateshm.composableshub.ExpandableContent

@Composable
fun DrawerContent(
    items: List<ExpandableItem>,
    navController: NavController,
    closeDrawer: () -> Unit,
) {
    val isExpanded = remember { mutableStateMapOf<String, Boolean>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        items(items, key = { it.hashCode() }) { item ->
            ExpandableContent(expandableItem = item,
                isExpanded = isExpanded[item.parent] ?: false,
                onArrowClicked = { brand ->
                    if (isExpanded[brand] == null) {
                        isExpanded[brand] = true
                    } else {
                        isExpanded[brand] = !isExpanded.getValue(brand)
                    }
                    //Clear others
                    isExpanded.forEach {
                        if (isExpanded[it.key] != null && it.key != brand) {
                            isExpanded[it.key] = false
                        }
                    }
                },
                onChildItemClicked = {
                    closeDrawer()
                    navController.navigate(it.route)
                })
        }
    }
}