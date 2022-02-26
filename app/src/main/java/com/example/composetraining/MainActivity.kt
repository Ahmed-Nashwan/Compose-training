package com.example.composetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composetraining.Navigation.SetupNavGraph
import com.example.composetraining.ui.theme.ComposeTrainingTheme

class MainActivity : ComponentActivity() {


    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            navController = rememberNavController()
            ComposeTrainingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {

                 SetupNavGraph(navController = navController)

                }
            }
        }
    }

//    private fun navigateToAnotherActivity() {
//
//        val intent = Intent(applicationContext, AnotherActivity::class.java)
//        startActivity(intent)
//    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTrainingTheme {
      
    }
}

