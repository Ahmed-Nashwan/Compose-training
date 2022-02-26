package com.example.composetraining.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composetraining.R
import com.example.composetraining.model.Person

@Composable
fun PersonDetailsScreen(person: Person) {

    Surface(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {


            Card(
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                    .shadow(5.dp, RoundedCornerShape(10.dp))
            ) {

                Column(
                    modifier = Modifier
                        .padding(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly,
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.icon_24),
                        contentDescription = "aaa"
                    )

                    Text(person.name, color = Color.Black)
                    Text(
                        if (person.isMarried) "is married" else "is not married",
                        color = Color.Black
                    )
                    Text("Salary= ${person.salary}", color = Color.Black)
                    Text("Age = ${person.age}", color = Color.Black)


                }
            }
        }
    }
}