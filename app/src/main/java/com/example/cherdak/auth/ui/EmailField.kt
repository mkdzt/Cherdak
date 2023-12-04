package com.example.cherdak.auth.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cherdak.R

@Composable
fun EmailField(email:String, onNewValue:(String)->Unit, modifier: Modifier = Modifier){
    OutlinedTextField(
        singleLine = true,
        modifier = modifier,
        value = email,
        onValueChange = onNewValue,
        placeholder = { Text(text = stringResource(R.string.email)) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewEmailField(modifier: Modifier = Modifier, email:String = "", onNewValue:(String)->Unit = {"qwe"}){
    OutlinedTextField(
        singleLine = true,
        modifier = modifier,
        value = email,
        onValueChange = onNewValue,
        placeholder = { Text(text = stringResource(R.string.email)) },
        shape = RoundedCornerShape(15.dp)
    )
}