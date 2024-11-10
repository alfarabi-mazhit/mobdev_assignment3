import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

@Composable
fun Exercise1Screen() {
    DisposableEffect(Unit) {
        Log.d("Exercise1Screen", "onCreateView")

        onDispose {
            Log.d("Exercise1Screen", "onDestroyView")
        }
    }

    Text("Hello from Fragment!")
}
