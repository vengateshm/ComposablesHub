package dev.vengateshm.composableshub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.vengateshm.composableshub.components.AutocompleteWithImages
import dev.vengateshm.composableshub.components.CheckboxCard
import dev.vengateshm.composableshub.components.ChoiceCompactCard
import dev.vengateshm.composableshub.components.FeedPostCard
import dev.vengateshm.composableshub.components.MultiselectAutocomplete
import dev.vengateshm.composableshub.components.SocialLoginsButtons
import dev.vengateshm.composableshub.components.list_views.ListView
import dev.vengateshm.composableshub.components.list_views.ListViewWithIcon
import dev.vengateshm.composableshub.components.list_views.ListViewWithStickyHeaders
import dev.vengateshm.composableshub.components.list_views.ListViewWithTruncatedContent
import dev.vengateshm.composableshub.screens.SignUpScreen
import dev.vengateshm.composableshub.screens.galleryProfile.GalleryProfile
import dev.vengateshm.composableshub.screens.settings.SettingsScreen
import dev.vengateshm.composableshub.ui.theme.ComposablesHubTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposablesHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ComposableHubApp()
//                    SampleAppDrawer()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposableHubApp() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val navController = rememberNavController()
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(
                    navController = navController,
                    closeDrawer = {
                        scope.launch { drawerState.close() }
                    })
            }
        }
    ) {
        NavHost(
            navController = navController, startDestination = AppScreen.Screens.GalleryProfile.route
        ) {
            composable(AppScreen.Screens.GalleryProfile.route) {
                GalleryProfile()
            }
            composable(AppScreen.Screens.SignUpForm.route) {
                SignUpScreen()
            }
            composable(AppScreen.Screens.Settings.route) {
                SettingsScreen()
            }
            composable(AppScreen.Components.SocialLoginButtons.route) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    SocialLoginsButtons()
                }
            }
            composable(AppScreen.Components.PostFeedCard.route) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    FeedPostCard()
                }
            }
            composable(AppScreen.Components.ChoiceCompactCard.route) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    ChoiceCompactCard()
                }
            }
            composable(AppScreen.Components.CheckboxCard.route) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CheckboxCard()
                }
            }
            composable(AppScreen.Lists.ListView.route) {
                ListView()
            }

            composable(AppScreen.Lists.ListViewIcon.route) {
                ListViewWithIcon()
            }

            composable(AppScreen.Lists.ListViewWithTruncatedContent.route) {
                ListViewWithTruncatedContent()
            }

            composable(AppScreen.Lists.ListViewWithStickyHeaders.route) {
                ListViewWithStickyHeaders()
            }

            composable(AppScreen.AutoComplete.AutoCompleteWithImages.route) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp)
                ) {
                    AutocompleteWithImages()
                }
            }

            composable(AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.route) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp)
                ) {
                    MultiselectAutocomplete()
                }
            }
        }
    }
}

@Composable
fun DrawerContent(
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
                    when (it) {
                        AppScreen.Screens.GalleryProfile.displayName -> {
                            navController.navigate(AppScreen.Screens.GalleryProfile.route)
                        }

                        AppScreen.Screens.SignUpForm.displayName -> {
                            navController.navigate(AppScreen.Screens.SignUpForm.route)
                        }

                        AppScreen.Screens.Settings.displayName -> {
                            navController.navigate(AppScreen.Screens.Settings.route)
                        }

                        AppScreen.Components.SocialLoginButtons.displayName -> {
                            navController.navigate(AppScreen.Components.SocialLoginButtons.route)
                        }

                        AppScreen.Components.PostFeedCard.displayName -> {
                            navController.navigate(AppScreen.Components.PostFeedCard.route)
                        }

                        AppScreen.Components.ChoiceCompactCard.displayName -> {
                            navController.navigate(AppScreen.Components.ChoiceCompactCard.route)
                        }

                        AppScreen.Components.CheckboxCard.displayName -> {
                            navController.navigate(AppScreen.Components.CheckboxCard.route)
                        }

                        AppScreen.Lists.ListView.displayName -> {
                            navController.navigate(AppScreen.Lists.ListView.route)
                        }

                        AppScreen.Lists.ListViewIcon.displayName -> {
                            navController.navigate(AppScreen.Lists.ListViewIcon.route)
                        }

                        AppScreen.Lists.ListViewWithTruncatedContent.displayName -> {
                            navController.navigate(AppScreen.Lists.ListViewWithTruncatedContent.route)
                        }

                        AppScreen.Lists.ListViewWithStickyHeaders.displayName -> {
                            navController.navigate(AppScreen.Lists.ListViewWithStickyHeaders.route)
                        }

                        AppScreen.AutoComplete.AutoCompleteWithImages.displayName -> {
                            navController.navigate(AppScreen.AutoComplete.AutoCompleteWithImages.route)
                        }

                        AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.displayName -> {
                            navController.navigate(AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.route)
                        }
                    }
                })
        }
    }
}

@Composable
fun ExpandableContent(
    expandableItem: ExpandableItem,
    isExpanded: Boolean,
    onArrowClicked: (String) -> Unit,
    onChildItemClicked: (String) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onArrowClicked(expandableItem.parent)
            }
            .padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = expandableItem.parent)
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = if (isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                contentDescription = "Drop down icon"
            )
        }
        AnimatedVisibility(
            visible = isExpanded
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                expandableItem.child.forEach { child ->
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                onChildItemClicked(child)
                            }
                            .padding(start = 24.dp, end = 16.dp)
                            .padding(vertical = 8.dp),
                        text = child
                    )
                }
            }
        }
    }
}

data class ExpandableItem(val parent: String, val child: List<String>)

val items = listOf(
    ExpandableItem(
        parent = AppScreen.Screens.displayName,
        child = listOf(
            AppScreen.Screens.GalleryProfile.displayName,
            AppScreen.Screens.SignUpForm.displayName,
            AppScreen.Screens.Settings.displayName
        )
    ),
    ExpandableItem(
        parent = AppScreen.Components.displayName,
        child = listOf(
            AppScreen.Components.SocialLoginButtons.displayName,
            AppScreen.Components.PostFeedCard.displayName,
            AppScreen.Components.ChoiceCompactCard.displayName,
            AppScreen.Components.CheckboxCard.displayName,
        )
    ),
    ExpandableItem(
        parent = AppScreen.Lists.displayName,
        child = listOf(
            AppScreen.Lists.ListView.displayName,
            AppScreen.Lists.ListViewIcon.displayName,
            AppScreen.Lists.ListViewWithTruncatedContent.displayName,
            AppScreen.Lists.ListViewWithStickyHeaders.displayName,
        )
    ),
    ExpandableItem(
        parent = AppScreen.AutoComplete.displayName,
        child = listOf(
            AppScreen.AutoComplete.AutoCompleteWithImages.displayName,
            AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.displayName,
        )
    )
)

sealed class AppScreen {
    open val displayName: String = ""

    sealed class Screens(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Screens"
        }

        object GalleryProfile : Screens("gallery_profile") {
            override val displayName: String
                get() = "GalleryProfile"
        }

        object SignUpForm : Screens("sign_up_form") {
            override val displayName: String
                get() = "SignUpForm"
        }

        object Settings : Screens("settings") {
            override val displayName: String
                get() = "Settings"
        }
    }

    sealed class Components(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Components"
        }

        object SocialLoginButtons : Screens("social_login_buttons") {
            override val displayName: String
                get() = "Social Login Buttons"
        }

        object PostFeedCard : Screens("post_feed_card") {
            override val displayName: String
                get() = "Post Feed Card"
        }

        object ChoiceCompactCard : Screens("choice_compact_card") {
            override val displayName: String
                get() = "Choice Compact Card"
        }

        object CheckboxCard : Screens("check_box_card") {
            override val displayName: String
                get() = "Checkbox Card"
        }
    }

    sealed class Lists(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Lists"
        }

        object ListView : Screens("list_view") {
            override val displayName: String
                get() = "List View"
        }

        object ListViewIcon : Screens("list_view_icon") {
            override val displayName: String
                get() = "List View - Icon"
        }

        object ListViewWithTruncatedContent : Screens("list_view_truncated_content") {
            override val displayName: String
                get() = "List View - Truncated Content"
        }

        object ListViewWithStickyHeaders : Screens("list_view_sticky_header") {
            override val displayName: String
                get() = "List View - Sticky Header"
        }
    }

    sealed class AutoComplete(val route: String) : AppScreen() {
        companion object {
            const val displayName = "AutoComplete"
        }

        object AutoCompleteWithImages : AutoComplete("ac_with_images") {
            override val displayName: String
                get() = "AutoComplete - Images"
        }

        object MultiSelectAutoCompleteWithImages : AutoComplete("ms_ac") {
            override val displayName: String
                get() = "Multiselect AutoComplete"
        }
    }
}