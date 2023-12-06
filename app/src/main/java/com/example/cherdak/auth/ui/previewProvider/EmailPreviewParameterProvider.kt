package com.example.cherdak.auth.ui.previewProvider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class EmailPreviewParameterProvider:PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "max.detchik@gmail.com",
        "test@gmail.com",
        "boltach2000@mail.ru"
    )
}