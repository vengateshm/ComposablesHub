package dev.vengateshm.composableshub.modal_drawer

import dev.vengateshm.composableshub.AppScreen

data class ExpandableItem(val parent: String, val child: List<Child>)
data class Child(val child: String, val route: String)

val drawerItems = listOf(
    ExpandableItem(
        parent = AppScreen.Screens.displayName, child = listOf(
            Child(
                child = AppScreen.Screens.GalleryProfile.displayName,
                route = AppScreen.Screens.GalleryProfile.route
            ),
            Child(
                child = AppScreen.Screens.SignUpForm.displayName,
                route = AppScreen.Screens.SignUpForm.route
            ),
            Child(
                child = AppScreen.Screens.Settings.displayName,
                route = AppScreen.Screens.Settings.route
            ),
            Child(
                child = AppScreen.Screens.Search.displayName, route = AppScreen.Screens.Search.route
            ),
            Child(
                child = AppScreen.Screens.Chat.displayName, route = AppScreen.Screens.Chat.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.Components.displayName, child = listOf(
            Child(
                child = AppScreen.Components.SocialLoginButtons.displayName,
                route = AppScreen.Components.SocialLoginButtons.route
            ),
            Child(
                child = AppScreen.Components.PostFeedCard.displayName,
                route = AppScreen.Components.PostFeedCard.route
            ),
            Child(
                child = AppScreen.Components.ChoiceCompactCard.displayName,
                route = AppScreen.Components.ChoiceCompactCard.route
            ),
            Child(
                child = AppScreen.Components.ContentCard.displayName,
                route = AppScreen.Components.ContentCard.route
            ),
            Child(
                child = AppScreen.Components.CheckboxCard.displayName,
                route = AppScreen.Components.CheckboxCard.route
            ),
            Child(
                child = AppScreen.Components.HorizontalPager.displayName,
                route = AppScreen.Components.HorizontalPager.route
            ),
            Child(
                child = AppScreen.Components.SearchBar.displayName,
                route = AppScreen.Components.SearchBar.route
            ),
            Child(
                child = AppScreen.Components.DockedSearchBar.displayName,
                route = AppScreen.Components.DockedSearchBar.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.Lists.displayName, child = listOf(
            Child(
                child = AppScreen.Lists.ListView.displayName, route = AppScreen.Lists.ListView.route
            ),
            Child(
                child = AppScreen.Lists.ListViewIcon.displayName,
                route = AppScreen.Lists.ListViewIcon.route
            ),
            Child(
                child = AppScreen.Lists.ListViewWithTruncatedContent.displayName,
                route = AppScreen.Lists.ListViewWithTruncatedContent.route
            ),
            Child(
                child = AppScreen.Lists.ListViewWithStickyHeaders.displayName,
                route = AppScreen.Lists.ListViewWithStickyHeaders.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.AutoComplete.displayName, child = listOf(
            Child(
                child = AppScreen.AutoComplete.AutoCompleteWithImages.displayName,
                route = AppScreen.AutoComplete.AutoCompleteWithImages.route
            ),
            Child(
                child = AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.displayName,
                route = AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.BottomSheet.displayName, child = listOf(
            Child(
                child = AppScreen.BottomSheet.BottomSheetScaffold.displayName,
                route = AppScreen.BottomSheet.BottomSheetScaffold.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.Picker.displayName, child = listOf(
            Child(
                child = AppScreen.Picker.DateRangePicker.displayName,
                route = AppScreen.Picker.DateRangePicker.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.ToolTip.displayName, child = listOf(
            Child(
                child = AppScreen.ToolTip.Plain.displayName, route = AppScreen.ToolTip.Plain.route
            ),
            Child(
                child = AppScreen.ToolTip.Rich.displayName, route = AppScreen.ToolTip.Rich.route
            ),
        )
    ),
)