package kr.update.outstagram.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kr.update.outstagram.ui.page.HomePage
import kr.update.outstagram.ui.page.ProfilePage
import kr.update.outstagram.ui.template.NavTemplate

@Composable
fun OutstagramNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    navigationActions: OutstagramNavigation,
    startDestination: String = OutstagramDestination.HOME_ROUTE,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(
            route = OutstagramDestination.HOME_ROUTE
        ) {
            NavTemplate(
                onHomeSelected = {
                    navigationActions.navigateToHome()
                },
                onSearchSelected = { /*TODO*/ },
                onAddSelected = { /*TODO*/ },
                onReelsSelected = { /*TODO*/ },
                onProfileSelected = {
                    navigationActions.navigateToProfile()
                }) {
                HomePage()
            }
        }

        composable(
            route = OutstagramDestination.PROFILE_ROUTE
        ) {
            NavTemplate(
                onHomeSelected = {
                    navigationActions.navigateToHome()
                },
                onSearchSelected = { /*TODO*/ },
                onAddSelected = { /*TODO*/ },
                onReelsSelected = { /*TODO*/ },
                onProfileSelected = {
                    navigationActions.navigateToProfile()
                }) {
                ProfilePage()
            }
        }
    }
}