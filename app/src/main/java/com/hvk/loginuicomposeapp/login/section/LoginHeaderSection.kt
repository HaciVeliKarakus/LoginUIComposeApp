package com.hvk.loginuicomposeapp.login.section

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hvk.loginuicomposeapp.ui.theme.LoginUIComposeAppTheme

@Composable
fun LoginHeaderSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Log In",
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "Capture your through and ideas",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun LoginHeaderPreview() {
    LoginUIComposeAppTheme {
        LoginHeaderSection()
    }
}