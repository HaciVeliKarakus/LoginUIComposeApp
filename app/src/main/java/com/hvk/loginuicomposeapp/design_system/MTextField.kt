package com.hvk.loginuicomposeapp.design_system

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hvk.loginuicomposeapp.ui.theme.LoginUIComposeAppTheme

@Composable
fun MTextField(
    text: String,
    label: String,
    hint: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    isInputSecret: Boolean = false
) {
    var isPasswordVisible by rememberSaveable {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(6.dp))

        OutlinedTextField(
            value = text,
            onValueChange = onValueChange,
            visualTransformation = if (isPasswordVisible) {
                PasswordVisualTransformation(mask = '*')
            } else VisualTransformation.None,
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text = hint,
                    style = MaterialTheme.typography.bodyLarge
                )
            },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            trailingIcon = {
                if (isInputSecret) {
                    IconButton(
                        onClick = {
                            isPasswordVisible = !isPasswordVisible
                        }
                    ) {
                        Icon(
                            imageVector = if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                            contentDescription = if (isPasswordVisible) "Hide Password" else "Show Password"
                        )
                    }
                }
            }
        )
    }
}


@Composable
@Preview(showBackground = true)
private fun Preview() {
    LoginUIComposeAppTheme {
        MTextField(
            text = "preview text",
            hint = "preview hint",
            label = "preview label",
            isInputSecret = false,
            onValueChange = {}
        )
    }
}