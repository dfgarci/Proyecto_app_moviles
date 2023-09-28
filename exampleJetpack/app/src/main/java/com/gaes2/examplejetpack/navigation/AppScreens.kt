package com.gaes2.examplejetpack.navigation

sealed class AppScreens(val route: String){
    object SeconScreen: AppScreens("second")
    object LoginScreen: AppScreens("login_screen")

}
