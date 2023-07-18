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

        object ContentCard : Screens("content_card") {
            override val displayName: String
                get() = "Content Card"
        }

        object CheckboxCard : Screens("check_box_card") {
            override val displayName: String
                get() = "Checkbox Card"
        }

        object HorizontalPager : Screens("horizontal_pager") {
            override val displayName: String
                get() = "Horizontal Pager"
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