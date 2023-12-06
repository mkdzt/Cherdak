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
import com.example.cherdak.auth.ui.previewProvider.PasswordPreviewParameterProvider

@Composable
fun PasswordField(modifier: Modifier = Modifier, password:String, onPasswordChange:(String)->Unit){
    OutlinedTextField(
        singleLine = true,
        modifier = modifier,
        value = password,
        onValueChange = onPasswordChange,
        placeholder = {
            Text(
                text = stringResource(R.string.password),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyMedium
            )
        },
        shape = MaterialTheme.shapes.large,
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

@Preview(showBackground = true,device = "id:pixel_6a")
@Composable
fun PreviewPasswordField(
    @PreviewParameter(PasswordPreviewParameterProvider::class) password: String
){
    OutlinedTextField(
        singleLine = true,
        modifier = Modifier,
        value = password,
        onValueChange = {  },
        placeholder = {
            Text(
                text = stringResource(R.string.password),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyMedium
            )
        },
        shape = MaterialTheme.shapes.large,
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}
