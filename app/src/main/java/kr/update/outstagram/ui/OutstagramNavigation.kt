package kr.update.outstagram.ui

import android.util.Log
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object OutstagramDestination {
    const val HOME_ROUTE = "home"
    const val PROFILE_ROUTE = "profile"
}

class OutstagramNavigation(navController: NavHostController) {
    val navigateToHome: () -> Unit = {
        Log.d("navigation", "Go to home")
        navController.navigate(OutstagramDestination.HOME_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToProfile: () -> Unit = {
        Log.d("navigation", "Go to profile")
        navController.navigate(OutstagramDestination.PROFILE_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}