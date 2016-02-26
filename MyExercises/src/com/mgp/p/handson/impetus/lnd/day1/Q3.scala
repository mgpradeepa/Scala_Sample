package com.mgp.p.handson.impetus.lnd.day1

/**
 * @author mgpradeepa
 *
 * Write a function that takes an Int array input and swaps adjacent pairs of elements. Use for loop and yield
 */
object Q3 extends App {

  // purely based on the array index of the element
  def swapArray(ar: Array[Int]): Array[Int] = {

    (for (i <- 0 until ar.length) yield if (i % 2 == 0 && (i + 1) == ar.length) ar(i)
    else if (i % 2 == 0) ar(i + 1)
    else ar(i - 1)).toArray

  }

  // Based on the group considered
  def swapArrayWithoutForYield(a: Array[Int]): Array[Int] = {
    a.grouped(3).flatMap {
      case Array(x, y, z) => Array(y, z, x)
      case Array(x) => Array(x)

    }.toArray
  }

  println(swapArray(Array(1, 3, 5, 6, 7, 2, 9)).mkString(","))

  println(swapArrayWithoutForYield(Array(1, 3, 5, 6, 7, 2, 9, 10, 13, 15)).mkString(","))

}
