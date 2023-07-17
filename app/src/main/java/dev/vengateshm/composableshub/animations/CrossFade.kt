package dev.vengateshm.composableshub.animations

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CrossFadeSample() {
    var selectedScreen by remember { mutableStateOf("A") }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "Completed",
                modifier = Modifier
                    .clickable { selectedScreen = "A" })
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Cancelled",
                modifier = Modifier
                    .clickable { selectedScreen = "B" })
        }
        Crossfade(targetState = selectedScreen) { screen ->
            when (screen) {
                "A" -> Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Blue),
                    contentAlignment = Alignment.Center
                ) {
                    Text("No Completed Bookings")
                }

                "B" -> Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Gray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("No Cancelled Bookings")
                }
            }
        }
    }
}
