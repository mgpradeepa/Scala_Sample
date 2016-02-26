package com.mgp.p.handson.impetus.lnd.day2

object Day2AnonymousFunc extends App {

  def sum(f: Int => Int, a: Int, b: Int): Int = {

    if (a > b) 0
    else
      f(a) + sum(f, a + 1, b)
  }

  val result = sum((a: Int) => a * a, 1, 5)

  val result2 = sum((b) => b * b, 1, 5)

  val result3 = sum(_+0  , 1, 5)

  println(result + "  " + result2 + " " + result3)

}