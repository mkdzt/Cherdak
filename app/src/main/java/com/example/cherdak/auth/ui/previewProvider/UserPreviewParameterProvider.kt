package com.example.cherdak.auth.ui.previewProvider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.cherdak.auth.domain.User

class UserPreviewParameterProvider:PreviewParameterProvider<User> {
    override val values: Sequence<User> = sequenceOf(
        User("max.detchik@gmail.com","q1w2e3r4"),
        User("test@gmail.com","111111111"),
        User("boltach2000@mail.ru","260520")
    )

}
