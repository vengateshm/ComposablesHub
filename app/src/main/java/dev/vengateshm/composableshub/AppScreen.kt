package dev.vengateshm.composableshub

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

        object Search : Screens("search") {
            override val displayName: String
                get() = "Search"
        }

        object Chat : Screens("chat") {
            override val displayName: String
                get() = "Chat"
        }
    }

    sealed class Components(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Components"
        }

        object SocialLoginButtons : Components("social_login_buttons") {
            override val displayName: String
                get() = "Social Login Buttons"
        }

        object PostFeedCard : Components("post_feed_card") {
            override val displayName: String
                get() = "Post Feed Card"
        }

        object ChoiceCompactCard : Components("choice_compact_card") {
            override val displayName: String
                get() = "Choice Compact Card"
        }

        object ContentCard : Components("content_card") {
            override val displayName: String
                get() = "Content Card"
        }

        object CheckboxCard : Components("check_box_card") {
            override val displayName: String
                get() = "Checkbox Card"
        }

        object HorizontalPager : Components("horizontal_pager") {
            override val displayName: String
                get() = "Horizontal Pager"
        }

        object SearchBar : Components("search_bar") {
            override val displayName: String
                get() = "Search Bar"
        }

        object DockedSearchBar : Components("docked_search_bar") {
            override val displayName: String
                get() = "Docked Search Bar"
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

    sealed class BottomSheet(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Bottom Sheet"
        }

        object BottomSheetScaffold : AutoComplete("bottom_sheet_scaffold") {
            override val displayName: String
                get() = "Bottom Sheet - Scaffold"
        }
    }

    sealed class Picker(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Pickers"
        }

        object DateRangePicker : AutoComplete("date_range_picker") {
            override val displayName: String
                get() = "Date Range Picker"
        }
    }

    sealed class ToolTip(val route: String) : AppScreen() {
        companion object {
            const val displayName = "Tool Tip"
        }

        object Plain : AutoComplete("plain_tt") {
            override val displayName: String
                get() = "Plain Tool Tip"
        }

        object Rich : AutoComplete("plain_rt") {
            override val displayName: String
                get() = "Rich Tool Tip"
        }
    }
}