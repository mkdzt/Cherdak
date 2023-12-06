package com.example.cherdak.auth.ui.previewProvider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class PasswordPreviewParameterProvider:PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "111111111",
        "q1w2e3r4",
        "260520"
    )

}
