package com.mgp.p.handson.impetus.lnd.day1

/**
 * 4. Function that returns a tuple of minimum and maximum values of an array
 *
 */
object Q4 extends App {

  val arrayData = Q1.arr

  val (a, b) = {

    arrayData.foldLeft((arrayData(0), arrayData(0))) {
      case ((min, max), e) => (math.min(min, e), math.max(max, e))
    }
  }

  val (x, y) = (arrayData.reduceLeft(_ min _), arrayData.reduceLeft(_ max _))

  println("arrayData" + arrayData)
  println((x, y))

  println((a, b) + "a,b")
}