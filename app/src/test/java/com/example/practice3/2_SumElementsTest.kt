package com.example.practice3

import org.junit.Rule
import org.junit.Test


class `2_SumElementsTest` {

    @get:Rule
    val watcher = Utils.getTestWatcher()

    /* Find List sum cases */

    @Test
    fun findSum_forLoop() {
        val list = createTestList()

        var sum = 0
        for (element in list) {
            sum += element
        }

        println("Sum is: $sum")
    }

    @Test
    fun findSum_forEach() {
        val list = createTestList()

        var sum = 0
        list.forEach { sum += it }

        println("Sum is: $sum")
    }

    @Test
    fun findSum_kotlinSum() {
        val list = createTestList()

        val sum = list.sum()

        println("Sum is: $sum")
    }

    @Test
    fun findSum_reduce() {
        val list = createTestList()

        val sum = list.reduce { sum, element -> sum + element }

        println("Sum is: $sum")
    }

    @Test
    fun findSum_fold() {
        val list = createTestList()

        val sum = list.fold(0) { acc, element -> acc + element }

        println("Sum is: $sum")
    }

    @Test
    fun sumMoney() {
        val list = listOf(Money(10.0), Money(20.0))
        list.sum()
    }

    private fun createTestList() = (1..10).toList()
}

data class Money(val amount: Double)

fun Iterable<Money>.sum(): Double {
    var sum = 0.0
    this.forEach { sum += it.amount }
    return sum
}