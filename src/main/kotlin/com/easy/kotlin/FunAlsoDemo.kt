/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.easy.kotlin

fun testAlsoFun() {
    val a = "ABC".also {
        println(it) // ABC
    }
    println(a) // ABC
    a.let {
        println(it) // ABC
    }
}

fun main(args: Array<String>) {
    testAlsoFun()
}
