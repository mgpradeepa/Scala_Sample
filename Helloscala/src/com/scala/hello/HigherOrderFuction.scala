package com.scala.hello

object HigherOrderFuction {
  // your code goes here

  def main(args: Array[String]) {

    println("Layout " + apply(layout, 10))

  }
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
}