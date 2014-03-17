package com.scala.hello
object Main extends App {
  // your code goes 
  val str1: String = "Hello"
  val str2: String = "world"

  println("Concatinated string : " + strcat(str1)(str2))

  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
}