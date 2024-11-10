import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items

@Composable
fun Exercise8Screen(viewModel: Exercise7ViewModel = viewModel()) {
    var input by remember { mutableStateOf("") } // Правильный способ инициализации состояния
    val items by viewModel.items.observeAsState(emptyList())

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = input,
            onValueChange = {
                input = it
                viewModel.addItem(it) // Передаем текст в ViewModel
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Enter item") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(items) { item ->
                Text(item)
            }
        }
    }
}

// Обновленный метод в ViewModel для добавления элемента
fun Exercise7ViewModel.addItem(item: String) {
    val currentList = _items.value.orEmpty().toMutableList()
    currentList.add(item)
    _items.value = currentList
}
