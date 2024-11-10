import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun Exercise2Screen(viewModel: Exercise2ViewModel = viewModel()) {
    var inputText by remember { mutableStateOf(TextFieldValue("")) }

    Column {
        // Экран для ввода
        TextField(
            value = inputText,
            onValueChange = {
                inputText = it
                viewModel.updateInput(it.text)
            }
        )

        // Экран для отображения
        Text("Output: ${viewModel.outputText.collectAsState().value}")
    }
}

class Exercise2ViewModel : ViewModel() {
    private val _outputText = MutableStateFlow("")
    val outputText: StateFlow<String> = _outputText

    fun updateInput(input: String) {
        _outputText.value = input
    }
}
