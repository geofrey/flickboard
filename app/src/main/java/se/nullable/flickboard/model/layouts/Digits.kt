package se.nullable.flickboard.model.layouts

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import se.nullable.flickboard.model.Action
import se.nullable.flickboard.model.Direction
import se.nullable.flickboard.model.KeyM
import se.nullable.flickboard.model.Layer
import se.nullable.flickboard.model.Layout
import se.nullable.flickboard.ui.KeyboardLayoutPreview

val DIGITS_MAIN_LAYER = Layer(
    keyRows = listOf(
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[1].toString())
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[2].toString())
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[3].toString())
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[4].toString())
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[5].toString())
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[6].toString())
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[7].toString())
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[8].toString())
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[9].toString())
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text(digits[0].toString())
                ),
                colspan = 2
            )
        )
    )
)

val DIGITS = Layout(
    mainLayer = DIGITS_MAIN_LAYER,
    controlLayer = CONTROL_MESSAGEASE_LAYER
)

@Composable
@Preview
fun DigitsKeyboardPreview() {
    KeyboardLayoutPreview(layout = Layout(DIGITS_MAIN_LAYER))
}

@Composable
@Preview
fun DigitsFullKeyboardPreview() {
    KeyboardLayoutPreview(layout = DIGITS, showAllModifiers = true)
}
