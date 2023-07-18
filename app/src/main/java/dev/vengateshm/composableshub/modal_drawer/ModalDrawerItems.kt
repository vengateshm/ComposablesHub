package dev.vengateshm.composableshub.modal_drawer

import dev.vengateshm.composableshub.AppScreen

data class ExpandableItem(val parent: String, val child: List<Child>)
data class Child(val child: String, val route: String)

val drawerItems = listOf(
    ExpandableItem(
        parent = AppScreen.Screens.displayName,
        child = listOf(
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
        )
    ),
    ExpandableItem(
        parent = AppScreen.Components.displayName,
        child = listOf(
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
                child = AppScreen.Components.CheckboxCard.displayName,
                route = AppScreen.Components.CheckboxCard.route
            ),
            Child(
                child = AppScreen.Components.HorizontalPager.displayName,
                route = AppScreen.Components.HorizontalPager.route
            ),
        )
    ),
    ExpandableItem(
        parent = AppScreen.Lists.displayName,
        child = listOf(
            Child(
                child = AppScreen.Lists.ListView.displayName,
                route = AppScreen.Lists.ListView.route
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
        parent = AppScreen.AutoComplete.displayName,
        child = listOf(
            Child(
                child = AppScreen.AutoComplete.AutoCompleteWithImages.displayName,
                route = AppScreen.AutoComplete.AutoCompleteWithImages.route
            ),
            Child(
                child = AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.displayName,
                route = AppScreen.AutoComplete.MultiSelectAutoCompleteWithImages.route
            ),
        )
    )
)