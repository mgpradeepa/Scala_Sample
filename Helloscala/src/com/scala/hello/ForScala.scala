package com.scala.hello

object ForScala extends App {
  //  def main(args: Array[String]) {

  val array = Array(1, 2, 3)
  val names = List("a", "v", "hul")
  for (n <- array; name <- names) {
    println(n + " " + name)

    println(factorial(3))
  }
  //  }

  def factorial(i: Int): Int = {
    def fact(i: Int, acc: Int): Int = {
      if (i <= 1)
        acc;
      else fact(i - 1, i * acc)
    }
    fact(i, 1)
  }
}