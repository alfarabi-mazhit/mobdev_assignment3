import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Exercise3Screen(navController: NavController) {
    Column() {
        Button(onClick = { navController.navigate("exercise1Screen") }) {
            Text("Show Fragment 1")
        }
        Button(onClick = { navController.navigate("exercise2Screen") }) {
            Text("Show Fragment 2")
        }
    }
}
