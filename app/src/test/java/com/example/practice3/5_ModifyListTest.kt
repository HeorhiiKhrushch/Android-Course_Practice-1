package com.example.practice3

import org.junit.Rule
import org.junit.Test

class `5_ModifyListTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()

    @Test
    fun modifyList() {
        val users: MutableList<User> = Utils.getTestUsersList().toMutableList()

        println(users)

        // adding

        users.add(User(11, "Mark Johnson", 24, "246 Pine St"))

        println(users)

        users.addAll(
            listOf(
                User(12, "Emily Davis", 36, "753 Maple St"),
                User(13, "Paul Wilson", 48, "986 Birch St")
            )
        )

        println(users)

        users.add(3, User(14, "Linda Kim", 28, "753 Pine St"))

        println(users)


        //replacing

        users[0] = User(1, "John Smith", 29, "123 Main St")

        users.set(0, User(1, "John Smith", 29, "123 Main St"))

        // removing

        users.remove(users[2])

        users.removeAt(2)

        users.removeAll(setOf(users[0], users[5]))

        users.removeFirst()
        users.removeLast()

        users.removeIf { it.id == 10 }

        users.clear()
    }

    @Test
    fun sublist() {
        val users = Utils.getTestUsersList().toMutableList()

        println(users)
        // Note that subList returns a view of the original list, so any changes made to the sublist will be reflected in the original list, and vice versa.
        users.forEach {
            println("ItemHashCode : ${it.hashCode()}")
        }

        val sublist = users.subList(0, 3)
        println(sublist)
        sublist.forEach {
            println("ItemHashCode : ${it.hashCode()}")
        }
        sublist[0] = sublist[0].copy(id = 100)
        println("After sublist changes")
        println(sublist)
        println(users)

        // If you want to create a new list that contains a copy of the sublist (i.e., any changes made to the sublist will not affect the original list), you can use the toList.
        val newSublist = users.subList(0, 3).toMutableList()
        println("new sublist")
        println(newSublist)
        newSublist.forEach {
            println("ItemHashCode : ${it.hashCode()}")
        }
        newSublist[0] = newSublist[0].copy(id = 200)

        println("After newSublist changes")
        println(newSublist)
        println(sublist)
        println(users)
    }
}