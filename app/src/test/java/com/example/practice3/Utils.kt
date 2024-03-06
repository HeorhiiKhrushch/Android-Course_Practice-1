package com.example.practice3

import org.junit.rules.TestWatcher
import org.junit.runner.Description

object Utils {

    fun getTestWatcher() =
        object : TestWatcher() {
            override fun starting(description: Description) {
                println(" =============== Starting test: ${description.methodName}")
            }
        }


    fun getTestUsersList(): List<User> = listOf(
        User(1, "John Doe", 27, "123 Main St"),
        User(2, "Jane Smith", 32, "456 Elm St"),
        User(3, "Bob Johnson", 45, "789 Oak St"),
        User(4, "Alice Lee", 22, "321 Pine St"),
        User(5, "Tom Davis", 38, "654 Maple St"),
        User(6, "Sara Brown", 29, "987 Cedar St"),
        User(7, "Mike Wilson", 50, "246 Birch St"),
        User(8, "Emily Kim", 26, "135 Walnut St"),
        User(9, "David Jones", 42, "864 Ash St"),
        User(10, "Karen Green", 31, "579 Hickory St")
    )
}

data class User(val id: Int, val name: String, val age: Int, val address: String)
