package com.mgp.p.handson.impetus.lnd.day2

object Day2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val prod = 10                                   //> prod  : Int = 10
  def func1 (a:Int, b: Int) : Int = {
  prod* a+b
  }                                               //> func1: (a: Int, b: Int)Int
  def m1() : (Int, Int ) => Int = {
  //val prod = 10
  func1
  }                                               //> m1: ()(Int, Int) => Int
  
  val f = m1                                      //> f  : (Int, Int) => Int = <function2>
  val r = f(10, 20)                               //> r  : Int = 120
}