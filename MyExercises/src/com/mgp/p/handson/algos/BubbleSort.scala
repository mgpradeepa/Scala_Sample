package com.mgp.p.handson.algos

import scala.Double

object BubbleSort extends App {

  def bubbleSort(a: Array[Double]): Unit = {
    for (i <- 0 until a.length - 1) {

      for (j <- 0 until a.length - 1 - i) {

        if (a(j) > a(j + 1)) {

          val tmp = a(j)
          a(j) = a(j + 1)
          a(j + 1) = tmp

        }
      }
    }
   println(a.mkString)
  }

  val arrayData = Array.fill(10)(math.random)
  println(arrayData.mkString)
  bubbleSort(arrayData)
}