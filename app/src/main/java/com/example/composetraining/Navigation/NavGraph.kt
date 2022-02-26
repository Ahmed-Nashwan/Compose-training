package com.example.composetraining.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.composetraining.model.Person
import com.example.composetraining.screens.HomeScreen
import com.example.composetraining.screens.PersonDetailsScreen


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationRoutes.Home.route) {

        composable(route = NavigationRoutes.Home.route) {

            HomeScreen(navController = navController)

        }

        composable(
            route = NavigationRoutes.Details.route,
            arguments = listOf(navArgument(ARGUMENT_KET_PERSON) {
                type = NavType.StringType
            })
        ) {

            val json = it.arguments?.getString(ARGUMENT_KET_PERSON)
            val person = Person.fromJson(json.toString())
            PersonDetailsScreen(person)

        }
    }
}