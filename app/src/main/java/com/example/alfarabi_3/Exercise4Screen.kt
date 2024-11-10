import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

@Composable
fun Exercise4Screen() {
    val movies = listOf("Movie 1", "Movie 2", "Movie 3")

    LazyColumn {
        items(movies) { movie ->
            Text(movie)
        }
    }
}
