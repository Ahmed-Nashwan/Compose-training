package com.example.composetraining.model

import com.google.gson.Gson

data class Person(var name: String, var age: Int, var isMarried: Boolean, var salary: Int) {

    companion object {
        fun generateFakeItem(): MutableList<Person> {
            return mutableListOf(
                Person(name = "Ahmed", age = 20, isMarried = false, 100),
                Person(name = "Ahmed1", age = 20, isMarried = false, 200),
                Person(name = "Ahmed2", age = 20, isMarried = false, 300),
                Person(name = "Ahmed3", age = 20, isMarried = false, 400),
                Person(name = "Ahmed4", age = 20, isMarried = false, 500),
                Person(name = "Ahmed5", age = 20, isMarried = false, 600),
                Person(name = "Ahmed6", age = 20, isMarried = false, 700),
                Person(name = "Ahmed7", age = 20, isMarried = false, 800),
                Person(name = "Ahmed8", age = 20, isMarried = false, 900),
                Person(name = "Ahmed9", age = 20, isMarried = false, 1000),
                Person(name = "Ahmed10", age = 20, isMarried = false, 2000),
                Person(name = "Ahmed11", age = 20, isMarried = false, 3000),
                Person(name = "Ahmed12", age = 20, isMarried = false, 4000)
            )
        }

         fun toJson(person:Person) = Gson().toJson(
            person,
            Person::class.java
        )

         fun fromJson(json:String) = Gson().fromJson(
            json,
            Person::class.java
        )
    }
}




