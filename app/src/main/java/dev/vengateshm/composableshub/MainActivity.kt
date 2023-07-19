package dev.vengateshm.composableshub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.vengateshm.composableshub.bottomsheet.SimpleBottomSheetScaffoldSample
import dev.vengateshm.composableshub.components.AutocompleteWithImages
import dev.vengateshm.composableshub.components.CheckboxCard
import dev.vengateshm.composableshub.components.ChoiceCompactCard
import dev.vengateshm.composableshub.components.ContentCard
import dev.vengateshm.composableshub.components.FeedPostCard
import dev.vengateshm.composableshub.components.HorizontalPagerIndicator
import dev.vengateshm.composableshub.components.MultiselectAutocomplete
import dev.vengateshm.composableshub.components.SocialLoginsButtons
import dev.vengateshm.composableshub.components.list_views.ListView
import dev.vengateshm.composableshub.components.list_views.ListViewWithIcon
import dev.vengateshm.composableshub.components.list_views.ListViewWithStickyHeaders
import dev.vengateshm.composableshub.components.list_views.ListViewWithTruncatedContent
import dev.vengateshm.composableshub.modal_drawer.Child
import dev.vengateshm.composableshub.modal_drawer.DrawerContent
import dev.vengateshm.composableshub.modal_drawer.ExpandableItem
import dev.vengateshm.composableshub.modal_drawer.drawerItems
import dev.vengateshm.composableshub.pickers.DateRangePickerSample
import dev.vengateshm.composableshub.screens.ChatScreen
import dev.vengateshm.composableshub.screens.SearchScreen
import dev.vengateshm.composableshub.screens.SignUpScreen
import dev.vengateshm.composableshub.screens.galleryProfile.GalleryProfile
import dev.vengateshm.composableshub.screens.settings.SettingsScreen
import dev.vengateshm.composableshub.tooltip.PlainToolTipSample
import dev.vengateshm.composableshub.tooltip.RichToolTipSample
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
                    items = drawerItems,
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
            composable(AppScreen.Screens.Search.route) {
                SearchScreen()
            }
            composable(AppScreen.Screens.Chat.route) {
                ChatScreen()
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
            composable(AppScreen.Components.ContentCard.route) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    ContentCard()
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
            composable(AppScreen.Components.HorizontalPager.route) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    HorizontalPagerIndicator()
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
            composable(AppScreen.BottomSheet.BottomSheetScaffold.route) {
                SimpleBottomSheetScaffoldSample()
            }
            composable(AppScreen.Picker.DateRangePicker.route) {
                DateRangePickerSample()
            }
            composable(AppScreen.ToolTip.Plain.route) {
                PlainToolTipSample()
            }
            composable(AppScreen.ToolTip.Rich.route) {
                RichToolTipSample()
            }
        }
    }
}

@Composable
fun ExpandableContent(
    expandableItem: ExpandableItem,
    isExpanded: Boolean,
    onArrowClicked: (String) -> Unit,
    onChildItemClicked: (Child) -> Unit,
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
                        text = child.child
                    )
                }
            }
        }
    }
}