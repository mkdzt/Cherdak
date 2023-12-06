package com.example.cherdak.auth.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.cherdak.auth.domain.User
import com.example.cherdak.auth.ui.previewProvider.UserPreviewParameterProvider

@Composable
fun AuthScreen(modifier: Modifier = Modifier) {
    val user by remember {
        mutableStateOf<User>(User("",""))
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EmailField(
            modifier = Modifier
                .padding(5.dp)
            ,
            email = user.email,
            onEmailChange = {}
        )
        PasswordField(
            modifier = Modifier
                .padding(5.dp)
            ,
            password = user.password,
            onPasswordChange = {}
        )
    }
}
@Preview(showBackground = true, device = "id:pixel_6a")
@Composable
fun PreviewAuthScreen(
    @PreviewParameter(UserPreviewParameterProvider::class) user:User
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EmailField(
            modifier = Modifier
                .padding(5.dp),
            email = user.email,
            onEmailChange = {}
        )
        PasswordField(
            modifier = Modifier
                .padding(5.dp),
            password = user.password,
            onPasswordChange = {}
        )
    }
}

