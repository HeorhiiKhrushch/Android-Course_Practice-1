package com.example.practice3

import com.example.practice3.Utils.getTestUsersList
import org.junit.Rule
import org.junit.Test
import java.util.*

class `4_ModifyListTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()


    /* .map cases*/

    @Test
    fun map_doubledNumbers() {
        val numbers = (1..5).toList()

        val doubledNumbers = numbers.map { it * 2 }

        println("Original numbers: $numbers")
        println("Doubled numbers: $doubledNumbers")
    }

    @Test
    fun map_userNames() {
        val users = getTestUsersList()
        val userNames = users.map { it.name }
        println(userNames)
    }

    @Test
    fun map_addressToUpperCase() {
        val users = getTestUsersList()
        val userAddressesUppercase = users.map { it.address.uppercase(Locale.getDefault()) }
        println(userAddressesUppercase)
    }

    @Test
    fun map_modifyId() {
        val users = getTestUsersList()
        val usersWithShiftedIds = users.map { it.copy(id = it.id + 1000) }
        println(usersWithShiftedIds)
    }

    @Test
    fun map_addRandomCityToAddress() {
        val users = getTestUsersList()
        val cities = listOf("New York", "London", "Paris", "Tokyo", "Sydney", "Berlin", "Dubai", "Rio de Janeiro", "Toronto")

        val usersWithCities = users.map { user ->
            val city = cities.random()
            User(user.id, user.name, user.age, "${user.address}, $city")
        }

        println(usersWithCities)

        val usersWithCitiesCopy = users.map { user ->
            val city = cities.random()
            user.copy(address = "${user.address}, $city")
        }

        println(usersWithCitiesCopy)
    }

    // on you: map list to list of names without surnames


    /* .filter cases */

    @Test
    fun filter_nameStartsWith() {
        val users = getTestUsersList()
        val jNames = users.filter { it.name.startsWith("J") }

        println("Names that start with J: $jNames")
    }

    @Test
    fun filter_ageMoreThan30() {
        val users = getTestUsersList()

        val oldUsers = users.filter { it.age >= 30 }

        println("Age >= 30: $oldUsers")
    }

    @Test
    fun filter_hasStreetInAddress() {
        val users = getTestUsersList()

        val filteredUsers = users.filter { it.address.contains("St") }

        println(filteredUsers)
    }

    // on you: filter id > 5 and name length > 9
}