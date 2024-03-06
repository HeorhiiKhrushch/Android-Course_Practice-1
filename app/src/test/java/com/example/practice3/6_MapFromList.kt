package com.example.practice3

import org.junit.Rule
import org.junit.Test

class `6_MapFromListTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()

    @Test
    fun mapFromList_associateBy() {
        val users = Utils.getTestUsersList()
        val mapById = users.associateBy { it.id }

        println(mapById)
    }

    @Test
    fun mapFromList_associate() {
        val users = Utils.getTestUsersList()
        val mapById = users.associate { it.id to it }
        val pair: Pair<Int, String> = 1 to "one" // Pair(1, "one")
        println(mapById)
    }

    @Test
    fun mapFromList_forLoop() {
        val users = Utils.getTestUsersList()
        val mapById = mutableMapOf<Int, User>()
        for (user in users) {
            mapById[user.id] = user
        }

        println(mapById)
    }

    @Test
    fun mapFromList_toMap() {
        val users = Utils.getTestUsersList()
        val mapById = users.map { it.id to it }.toMap()

        println(mapById)
    }
}