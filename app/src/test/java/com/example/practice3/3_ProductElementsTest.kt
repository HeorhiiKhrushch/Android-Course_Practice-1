package com.example.practice3

import org.junit.Rule
import org.junit.Test


class `3_ProductElementsTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()

    /* Find List product cases */

    @Test
    fun findProduct_forLoop() {
        val list = createTestList()

        var product = 1
        for (element in list) {
            product *= element
        }

        println("Product is: $product")
    }


    @Test
    fun findProduct_forEach() {
        val list = createTestList()

        var product = 1
        list.forEach { element -> product *= element }

        println("Product is: $product")
    }

    @Test
    fun findProduct_reduce() {
        val list = createTestList()

        val product = list.reduce { acc, element -> acc * element }

        println("Product is: $product")
    }

    @Test
    fun findProduct_fold() {
        val list = createTestList()

        val product = list.fold(1) { acc, element -> acc * element }

        println("Product is: $product")
    }

    @Test
    fun findProduct_fold_withIndex() {
        val list = createTestList()

        val product = list.foldIndexed(1) { index, acc, element -> if (index == 0) element else acc * element }

        println("Product is: $product")
    }


    private fun createTestList() = (1..10).toList()
}