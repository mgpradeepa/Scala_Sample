package com.scala.hello

object Looping {

  def main(args: Array[String]) {

    //    println("Browser tiibgs" + add(123, 333))
    delayed(time());
    printStrings("Hello", "Scala", "World")

  }
  def add(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b;
    return sum
  }
  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime();
  }

  def delayed(t: => Long) = {
    println("delayed")
    println("param " + t)
    t
  }

  def printStrings(args: String*) {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }
}