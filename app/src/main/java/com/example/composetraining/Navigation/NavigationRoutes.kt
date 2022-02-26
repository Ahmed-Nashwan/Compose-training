package com.example.composetraining.Navigation

const val ARGUMENT_KET_PERSON = "NAME"
sealed class NavigationRoutes(val route:String){
    object Home: NavigationRoutes("home")
    object Details: NavigationRoutes("details/{$ARGUMENT_KET_PERSON}"){

        fun passData(data:String) = "details/$data"

    } //required
    //object Details: NavigationRoutes("details/") //optional
}
