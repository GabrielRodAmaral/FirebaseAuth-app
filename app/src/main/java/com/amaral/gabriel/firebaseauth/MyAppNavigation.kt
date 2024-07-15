package com.amaral.gabriel.firebaseauth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.amaral.gabriel.firebaseauth.pages.HomePage
import com.amaral.gabriel.firebaseauth.pages.LoginPage
import com.amaral.gabriel.firebaseauth.pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login") {
            LoginPage(Modifier, navController, authViewModel)
        }
        composable("signup") {
            SignupPage(Modifier, navController, authViewModel)
        }
        composable("home") {
            HomePage(Modifier, navController, authViewModel)
        }
    })
}