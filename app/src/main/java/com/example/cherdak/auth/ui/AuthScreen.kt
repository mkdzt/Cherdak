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
import androidx.compose.ui.unit.dp

@Composable
fun AuthScreen(modifier: Modifier = Modifier) {
    val email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EmailField(
            modifier = Modifier
                .padding(10.dp)
            ,
            email = email,
            onNewValue = {"qwe"})
    }
}
@Preview
@Composable
fun PreviewAuthScreen(modifier: Modifier = Modifier) {
    val email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EmailField(
            modifier = Modifier
                .padding(10.dp)
            ,
            email = email,
            onNewValue = {"qwe"})
    }
}

