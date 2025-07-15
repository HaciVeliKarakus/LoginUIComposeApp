package com.hvk.loginuicomposeapp.login.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hvk.loginuicomposeapp.design_system.MButton
import com.hvk.loginuicomposeapp.design_system.MLink
import com.hvk.loginuicomposeapp.design_system.MTextField
import com.hvk.loginuicomposeapp.ui.theme.LoginUIComposeAppTheme

@Composable
fun LoginFormSection(
    email: String,
    onEmailChange: (String) -> Unit,
    password: String,
    onPasswordChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        MTextField(
            text = email,
            onValueChange = onEmailChange,
            label = "Email",
            hint = "example@gmail.com",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        MTextField(
            text = password,
            onValueChange = onPasswordChange,
            label = "Password",
            hint = "Password",
            isInputSecret = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))
        MButton(
            text = "Log In",
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))
        MLink(
            text = "Don't have an account?",
            onClick = {},
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun Preview() {
    LoginUIComposeAppTheme {
        LoginFormSection(
            email = "email",
            onEmailChange = {},
            password = "password",
            onPasswordChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}