package com.example.composetraining.widgets

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetraining.R
import com.example.composetraining.model.Person


@Composable
fun PersonItem(person: Person,onClick:()->Unit) {

    val fakeIcon = painterResource(id = R.drawable.icon_24)


    Card(
        border = BorderStroke(1.dp, color = Color.Black), elevation = 5.dp, modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .background(color = Color.White)
            .clickable { onClick() }

    ) {


        Column(
            Modifier
                .fillMaxSize()
                .padding(10.dp)
            ,
            verticalArrangement = Arrangement.Top,
        )
        {

            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = fakeIcon,
                    contentDescription = "fake description",
                    contentScale = ContentScale.Crop,
                )

                Text(person.name, color = Color.Black)


            }
            Spacer(modifier = Modifier.height(5.dp))
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text(if (person.isMarried) "is married" else "is not married", color = Color.Black)
                Text("salary = ${person.salary}", color = Color.Black)
                Text("age = ${person.age}", color = Color.Black)

            }


//        Divider(color = Color.Blue, thickness = 1.dp)
        }

    }



}

