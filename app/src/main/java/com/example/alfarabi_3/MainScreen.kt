import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column {
        Button(onClick = { navController.navigate("exercise1Screen") }) {
            Text("Exercise 1: Basic Fragment")
        }
        Button(onClick = { navController.navigate("exercise2Screen") }) {
            Text("Exercise 2: Fragment Communication")
        }
        Button(onClick = { navController.navigate("exercise3Screen") }) {
            Text("Exercise 3: Fragment Transactions")
        }
        Button(onClick = { navController.navigate("exercise4Screen") }) {
            Text("Exercise 4: RecyclerView Basic")
        }
        Button(onClick = { navController.navigate("exercise5Screen") }) {
            Text("Exercise 5: Item Click Handling")
        }
        Button(onClick = { navController.navigate("exercise7Screen") }) {
            Text("Exercise 7: Implementing ViewModel")
        }
        Button(onClick = { navController.navigate("exercise8Screen") }) {
            Text("Exercise 8: MutableLiveData for Input Handling")
        }
        Button(onClick = { navController.navigate("exercise9Screen") }) {
            Text("Exercise 9: Data Persistence")
        }
    }
}
