package dev.vengateshm.composableshub.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CheckboxCardPreview() {
    CheckboxCard()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckboxCard() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp),
    modifier = Modifier.padding(16.dp)) {
        var checked by remember { mutableStateOf(false) }
        var checked2 by remember { mutableStateOf(true) }

        OutlinedCard(
            onClick = { checked = checked.not() },
            modifier = Modifier.fillMaxWidth(),
            colors = if (checked) {
                CardDefaults.outlinedCardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                )
            } else {
                CardDefaults.outlinedCardColors()
            },
            border = if (checked) {
                CardDefaults.outlinedCardBorder().copy(
                    brush = SolidColor(MaterialTheme.colorScheme.primary)
                )
            } else {
                CardDefaults.outlinedCardBorder()
            },
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(16.dp)
            ) {
                if (checked) {
                    Icon(
                        Icons.Rounded.CheckCircle,
                        contentDescription = "Checked icon",
                        modifier = Modifier.size(36.dp)
                    )
                }

                Text(
                    "Android",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                )
            }
        }
        OutlinedCard(
            onClick = { checked2 = checked2.not() },
            modifier = Modifier
                .fillMaxWidth(),
            colors = if (checked2) {
                CardDefaults.outlinedCardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                )
            } else {
                CardDefaults.outlinedCardColors()
            },
            border = if (checked2) {
                CardDefaults.outlinedCardBorder().copy(
                    brush = SolidColor(MaterialTheme.colorScheme.primary)
                )
            } else {
                CardDefaults.outlinedCardBorder()
            },
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(16.dp)
            ) {
                if (checked2) {
                    Icon(
                        Icons.Rounded.CheckCircle,
                        contentDescription = "Checked icon",
                        modifier = Modifier.size(36.dp)
                    )
                }

                Text(
                    "Kotlin",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                )
            }
        }
    }
}