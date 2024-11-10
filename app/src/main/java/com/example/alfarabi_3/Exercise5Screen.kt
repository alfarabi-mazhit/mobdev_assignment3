import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.lazy.items

@Composable
fun Exercise5Screen() {
    val context = LocalContext.current
    val movies = listOf("Movie 1", "Movie 2", "Movie 3")

    LazyColumn {
        items(movies) { movie ->
            Text(
                movie,
                modifier = Modifier.clickable {
                    Toast.makeText(context, "$movie clicked", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}
