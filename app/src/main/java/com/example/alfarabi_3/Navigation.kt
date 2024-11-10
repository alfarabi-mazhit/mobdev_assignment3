import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("mainScreen") { MainScreen(navController) }
        composable("exercise1Screen") { Exercise1Screen() }
        composable("exercise2Screen") { Exercise2Screen() }
        composable("exercise3Screen") { Exercise3Screen(navController) }
        composable("exercise4Screen") { Exercise4Screen() }
        composable("exercise5Screen") { Exercise5Screen() }
        composable("exercise7Screen") { Exercise7Screen() }
        composable("exercise8Screen") { Exercise8Screen() }
        composable("exercise9Screen") { Exercise9Screen() }
    }
}
