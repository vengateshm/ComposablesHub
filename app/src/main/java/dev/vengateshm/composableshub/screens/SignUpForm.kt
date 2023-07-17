package dev.vengateshm.composableshub.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}

@Composable
fun SignUpScreen() {
    var fullName by remember { mutableStateOf("Lewis Hamilton") }
    var userName by remember { mutableStateOf("lhamilton@gmail.com") }
    var password by remember { mutableStateOf("lhamiltonStrongPassword") }
    var errorMessage by remember { mutableStateOf("") }
    var hasAcceptedTerms by remember { mutableStateOf(true) }
    SignUpForm(fullName = { fullName },
        onFullNameChanged = { fullName = it },
        userName = { userName },
        onUserNameChanged = { userName = it },
        password = { password },
        onPasswordChanged = { password = it },
        errorMessage = { errorMessage },
        onErrorMessageChanged = { errorMessage = it },
        hasAcceptedTerms = { hasAcceptedTerms },
        hasAcceptedTermsChecked = { hasAcceptedTerms = it },
        onSubmit = {
            // TODO Handle onSubmit
        })
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun SignUpForm(
    fullName: () -> String,
    onFullNameChanged: (String) -> Unit,
    userName: () -> String,
    onUserNameChanged: (String) -> Unit,
    password: () -> String,
    onPasswordChanged: (String) -> Unit,
    errorMessage: () -> String,
    onErrorMessageChanged: (String) -> Unit,
    hasAcceptedTerms: () -> Boolean,
    hasAcceptedTermsChecked: (Boolean) -> Unit,
    onSubmit: () -> Unit,
) {
    val focus = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) { padding ->
        Column(
            Modifier
                .padding(padding)
                .padding(horizontal = 16.dp)
                .padding(top = 32.dp)
        ) {
            Text(
                text = "Create Free Account", style = MaterialTheme.typography.headlineLarge
            )
            Spacer(Modifier.height(12.dp))
            Text(
                text = "Gain access to the full Composables catalog",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(Modifier.height(24.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = fullName(),
                label = { Text("Full name") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focus.moveFocus(FocusDirection.Next)
                }),
                onValueChange = { onFullNameChanged(it) },
                singleLine = true
            )
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = userName(),
                label = { Text("E-mail") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email, imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focus.moveFocus(FocusDirection.Next)
                }),
                onValueChange = { onUserNameChanged(it) },
                singleLine = true
            )
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Password") },
                isError = errorMessage().isNotBlank(),
                supportingText = {
                    Text(errorMessage())
                },
                value = password(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text, imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focus.clearFocus()
                    keyboardController?.hide()
                    onSubmit()
                }),
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = {
                    onPasswordChanged(it)
                },
                singleLine = true
            )

            Spacer(Modifier.height(16.dp))
            val interactionSource = remember { MutableInteractionSource() }
            Row(
                Modifier
                    .fillMaxWidth()
                    .clickable(interactionSource, indication = rememberRipple(), onClick = {
                        hasAcceptedTermsChecked(hasAcceptedTerms().not())
                    })
                    .padding(horizontal = 2.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(
                    checked = hasAcceptedTerms(), onCheckedChange = {
                        hasAcceptedTermsChecked(it)
                    }, interactionSource = interactionSource
                )
                TermsAndConditions()
            }

            Spacer(Modifier.height(16.dp))
            Column(Modifier.padding(horizontal = 16.dp)) {
                Button(
                    enabled = hasAcceptedTerms() && fullName().isNotBlank() && userName().isNotBlank() && password().isNotBlank(),
                    onClick = onSubmit,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Sign Up")
                }
                Spacer(Modifier.height(8.dp))
                TextButton(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = MaterialTheme.colorScheme.onSurface.copy(
                            alpha = 0.66f
                        )
                    )
                ) {
                    Text("Already have an account? Sign in")
                }
            }
        }
    }
}

@Composable
fun TermsAndConditions() {
    val fullText = "I accept the Terms & Conditions"
    val clickableText = "Terms & Conditions"
    val tag = "terms-and-conditions"

    val annotatedString = buildAnnotatedString {
        append(fullText)
        val start = fullText.indexOf(clickableText)
        val end = start + clickableText.length

        addStyle(
            style = SpanStyle(
                color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.SemiBold
            ), start = start, end = end
        )

        addStringAnnotation(
            tag = tag, annotation = "https://www.google.com", start = start, end = end
        )
    }
    val uriHandler = LocalUriHandler.current
    ClickableText(style = MaterialTheme.typography.bodyMedium.copy(
        color = LocalContentColor.current
    ), text = annotatedString, onClick = { offset ->
        annotatedString.getStringAnnotations(tag, offset, offset).firstOrNull()?.let { string ->
            uriHandler.openUri(string.item)
        }
    })
}