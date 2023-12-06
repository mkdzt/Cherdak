package com.example.cherdak.auth.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.cherdak.R
import com.example.cherdak.auth.ui.previewProvider.EmailPreviewParameterProvider

@Composable
fun EmailField(email:String, onEmailChange:(String)->Unit, modifier: Modifier = Modifier){
    OutlinedTextField(
        singleLine = true,
        modifier = modifier,
        value = email,
        onValueChange = onEmailChange,
        placeholder = {
            Text(
                text = stringResource(R.string.email),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyMedium
            )
        },
        shape = MaterialTheme.shapes.large,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}

@Preview(showBackground = true, device = "id:pixel_6a", showSystemUi = false)
@Composable
fun PreviewEmailField(
    @PreviewParameter(EmailPreviewParameterProvider::class) email:String
){
    OutlinedTextField(
        singleLine = true,
        modifier = Modifier,
        value = email,
        onValueChange = {},
        placeholder = {
            Text(
                text = stringResource(R.string.email),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyMedium
            )
        },
        shape = MaterialTheme.shapes.large,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}