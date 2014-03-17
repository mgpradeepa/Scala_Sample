package com.scala.hello
object RecursionFactorial extends App {

  for (i <- 1 to 10) {
    println("factorial of " + i + " --> " + factorial(i))
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      1
    } else n * factorial(n - 1)
  }
}