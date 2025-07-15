package com.hvk.loginuicomposeapp.login.section

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.hvk.loginuicomposeapp.ui.theme.LoginUIComposeAppTheme

@Composable
fun LoginHeaderSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.displayLarge
        )
        Text(
            text = "Capture your through and ideas",
            style = MaterialTheme.typography.headlineSmall
        )
    }
}


@Preview(showBackground = true)
@PreviewLightDark
@PreviewFontScale
@Composable
private fun LoginHeaderPreview() {
    LoginUIComposeAppTheme {
        Surface {
            LoginHeaderSection()
        }
    }
}