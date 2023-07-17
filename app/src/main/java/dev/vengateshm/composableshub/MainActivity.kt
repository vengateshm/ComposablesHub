package dev.vengateshm.composableshub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dev.vengateshm.composableshub.components.CheckboxCard
import dev.vengateshm.composableshub.components.ChoiceCompactCard
import dev.vengateshm.composableshub.components.SocialLoginsButtons
import dev.vengateshm.composableshub.components.list_views.ListView
import dev.vengateshm.composableshub.screens.galleryProfile.GalleryProfile
import dev.vengateshm.composableshub.ui.theme.ComposablesHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposablesHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    SignUpScreen()
//                    SettingsScreen()
//                    GalleryProfile()
//                    SocialLoginsButtons()
//                    ListView()
//                    Column { ChoiceCompactCard() }
                    CheckboxCard()
                }
            }
        }
    }
}