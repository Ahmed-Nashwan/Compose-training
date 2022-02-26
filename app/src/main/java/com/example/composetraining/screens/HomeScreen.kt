package com.example.composetraining.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composetraining.Navigation.NavigationRoutes
import com.example.composetraining.model.Person
import com.example.composetraining.widgets.PersonItem

@Composable
fun HomeScreen(navController: NavController) {


    val persons = Person.generateFakeItem()

    LazyColumn(modifier = Modifier.padding(10.dp), contentPadding = PaddingValues(5.dp)) {
        items(persons.size) { pos ->
            PersonItem(
                person = persons[pos],
                onClick = {
                    navController.navigate(
                        NavigationRoutes.Details.passData(
                           Person.toJson(person =persons[pos])
                        )
                    )
                })
            Spacer(modifier = Modifier.height(10.dp))

        }
    }


}





