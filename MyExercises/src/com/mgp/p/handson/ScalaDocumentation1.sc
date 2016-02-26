package com.mgp.p.handson

object ScalaDocumentation1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // Anonymous functions
  (x: Int) => x + 1                               //> res0: Int => Int = <function1>

  // Higher order functions
  def myProc(f: Int => String, x: Int) = f(x)     //> myProc: (f: Int => String, x: Int)String

  def hf(valu: Int): String = {
    myProc(valu => valu.toString, valu)

  }                                               //> hf: (valu: Int)String

  val op = hf(6)                                  //> op  : String = 6

  // sum(f(x), 0,n)

  def sum(f: (Int, Int) => Double, init: Int, end: Int): Double = {
    summation(init, end)
  }                                               //> sum: (f: (Int, Int) => Double, init: Int, end: Int)Double

  def summation(init: Int, end: Int): Double = {
    var summer = 0.0
    if (init > end) summer
    else {
      summer + summation(init + 1, end)

    }
  }                                               //> summation: (init: Int, end: Int)Double

  sum(summation, 1, 5)                            //> res1: Double = 0.0

}