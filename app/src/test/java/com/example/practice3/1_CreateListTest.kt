package com.example.practice3

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class `1_CreateListTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()

    /* Create List section */

    @Test
    fun createList_plain() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(list)
    }

    @Test
    fun createList_range() {
        val list = (1..10 step 1).toList()
        println(list)
    }

    @Test
    fun createList_mutableList() {
        val list = mutableListOf<Int>()
        for (i in 1..10){
            list.add(i)
        }
        println(list)
        assertEquals(list.size, 10)
    }

    @Test
    fun createList_range_until() {
        val list = (1 until 10).toList()
        println(list)
    }

    @Test
    fun createList_range_reversed() {
        val list = (10 downTo 1).toList()
        println(list)
    }

    @Test
    fun createList_range_with_step() {
        val list = (1..10 step 2).toList()
        println(list)
    }
}