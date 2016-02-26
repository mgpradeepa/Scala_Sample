package com.mgp.p.handson.impetus.lnd.day1
/**
 * 1. Create an array of random numbers and print them it in a sorted order
 */
object Q1 extends App {

  val rand = scala.util.Random

  def arr(): Seq[Int] = {
    for (i <- 0 until 10) yield (i * math.random * 13 * 10).toInt
  }

  
  println(arr().sorted)
  //  val arr = for (i <- 0 to 10) yield (i * math.random * 13 * 10).toInt
//  println("Orig gen array" + arr)
//
//  println("sorted " + arr.sorted)

}