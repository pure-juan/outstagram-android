package kr.update.outstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import kr.update.outstagram.ui.OutstagramNavGraph
import kr.update.outstagram.ui.OutstagramNavigation
import kr.update.outstagram.ui.theme.OutstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OutstagramApp()
        }
    }
}

@Composable
fun OutstagramApp() {
    OutstagramTheme(darkTheme = true) {
        val navController = rememberNavController()
        val navigationActions = remember(navController) {
            OutstagramNavigation(navController)
        }
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//        val currentRoute = navBackStackEntry?.destination?.route ?: OutstagramDestination.HOME_ROUTE

        Scaffold { innerPadding ->
            Box(Modifier.padding(innerPadding)) {
                OutstagramNavGraph(
                    navController = navController,
                    navigationActions = navigationActions
                )
            }
        }
    }
}