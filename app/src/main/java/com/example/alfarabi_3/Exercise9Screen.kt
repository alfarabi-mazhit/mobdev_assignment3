import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.alfarabi_3.Room.NoteViewModel
import android.app.Application
import androidx.compose.ui.platform.LocalContext
import com.example.alfarabi_3.Room.NoteViewModelFactory

@Composable
fun Exercise9Screen() {
    val context = LocalContext.current.applicationContext as Application
    val noteViewModel: NoteViewModel = viewModel(factory = NoteViewModelFactory(context))

    var inputText by remember { mutableStateOf("") }
    val notes by noteViewModel.allNotes.collectAsState(initial = emptyList())

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = inputText,
            onValueChange = { inputText = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Enter note content") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                if (inputText.isNotEmpty()) {
                    noteViewModel.addNote(inputText)
                    inputText = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Add Note")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(notes) { note ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(note.content)
                    Button(onClick = { noteViewModel.deleteNoteById(note.id) }) {
                        Text("Delete")
                    }
                }
            }
        }
    }
}
