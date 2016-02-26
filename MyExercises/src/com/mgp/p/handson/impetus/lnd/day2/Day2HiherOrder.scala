package com.mgp.p.handson.impetus.lnd.day2

/**
 * *
 *
 * Take functoin as parameters
 * Retrun functions as return objects
 */
object Day2HiherOrder extends App {
  // Higher Order function example

  def cubes(x: Int) = x * x * x
  def squares (x: Int)= x * x

  def sumOfCubes(f: Int => Int, x: Int): Int = {
    if (x <= 0) x
    else {
      f(x) + sumOfCubes( f, x+1)
    }

  }
  
  println(sumOfCubes(cubes, 3  ))
}