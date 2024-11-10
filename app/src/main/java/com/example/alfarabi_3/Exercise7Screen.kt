import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text

class Exercise7ViewModel : ViewModel() {
    val _items = MutableLiveData(listOf("User 1", "User 2", "User 3"))
    val items: LiveData<List<String>> = _items
}

@Composable
fun Exercise7Screen(viewModel: Exercise7ViewModel = viewModel()) {
    val items = viewModel.items.observeAsState(emptyList())

    LazyColumn {
        items(items.value) { item ->
            Text(item)
        }
    }
}
