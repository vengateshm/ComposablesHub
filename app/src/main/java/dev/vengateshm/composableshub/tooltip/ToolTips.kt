package dev.vengateshm.composableshub.tooltip

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.PlainTooltipBox
import androidx.compose.material3.RichTooltipBox
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberPlainTooltipState
import androidx.compose.material3.rememberRichTooltipState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlainToolTipSample() {
    val tooltipState = rememberPlainTooltipState()
    val scope = rememberCoroutineScope()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PlainTooltipBox(
            tooltip = { Text("Add to list") },
            tooltipState = tooltipState
        ) {
            Icon(
                imageVector = Icons.Filled.AddCircle,
                contentDescription = "Localized Description"
            )
        }
        Spacer(Modifier.requiredHeight(30.dp))
        OutlinedButton(
            onClick = { scope.launch { tooltipState.show() } }
        ) {
            Text("Display tooltip")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RichToolTipSample() {
    val tooltipState = rememberRichTooltipState(isPersistent = true)
    val scope = rememberCoroutineScope()
    RichTooltipBox(
        title = { Text("Sub Heading Text") },
        action = {
            TextButton(
                onClick = { scope.launch { tooltipState.dismiss() } }
            ) { Text("Dismiss") }
        },
        text = { Text("Heading Text") },
        tooltipState = tooltipState
    ) {
        IconButton(
            onClick = { /* Icon button's click event */ },
            modifier = Modifier.tooltipTrigger()
        ) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "Localized Description"
            )
        }
    }
}