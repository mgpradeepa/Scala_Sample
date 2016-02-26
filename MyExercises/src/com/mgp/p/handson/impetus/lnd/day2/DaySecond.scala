package com.mgp.p.handson.impetus.lnd.day2

import scala.annotation.tailrec

object DaySecond extends App {

  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) {
      1
    } else {
      n * factorial(n - 1)
    }

  }

  def factorialTaiRec(n: Int): Int = {
    @tailrec
    def factorialTaiRec(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else
        factorialTaiRec(n * acc, n - 1)
    }
    factorialTaiRec(1, n)

  }

  println("tail rec `" + factorialTaiRec(4))
  println(factorial(4))

}