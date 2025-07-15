package com.hvk.loginuicomposeapp.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hvk.loginuicomposeapp.login.section.LoginFormSection
import com.hvk.loginuicomposeapp.login.section.LoginHeaderSection
import com.hvk.loginuicomposeapp.ui.theme.LoginUIComposeAppTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    val (email, setEmail) = rememberSaveable { mutableStateOf("") }
    val (password, setPassword) = rememberSaveable { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets.statusBars
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp
                    )
                )
                .background(color = MaterialTheme.colorScheme.surfaceContainerLowest)
                .padding(
                    horizontal = 16.dp,
                    vertical = 24.dp
                )
                .consumeWindowInsets(insets = WindowInsets.navigationBars)
                .padding(top = 56.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            LoginHeaderSection(
                modifier = Modifier.fillMaxWidth()
            )
            LoginFormSection(
                email = email,
                onEmailChange = setEmail,
                password = password,
                onPasswordChange = setPassword
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun Preview() {
    LoginUIComposeAppTheme {
        LoginScreen()
    }
}