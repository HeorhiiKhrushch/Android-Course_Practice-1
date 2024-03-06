package com.example.practice3

import org.junit.Rule
import org.junit.Test

class `7_ModifyMapTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()

    @Test
    fun modifyList() {
        val users = Utils.getTestUsersList()

        val userMap = mutableMapOf<Int, User>()

        // Add each user to the map using their id as the key
        users.forEach { user -> userMap[user.id] = user }

        // adding
        val newUser = User(11, "Chris Brown", 34, "246 Cherry St")
        userMap[newUser.id] = newUser

        val newMap = listOf(
            User(12, "Emily Davis", 36, "753 Maple St"),
            User(13, "Paul Wilson", 48, "986 Birch St")
        ).associateBy { it.id }
        userMap.putAll(newMap)

        // updating
        userMap[10] = newUser

        // removing
        userMap.remove(2)

        userMap.clear()
    }
}