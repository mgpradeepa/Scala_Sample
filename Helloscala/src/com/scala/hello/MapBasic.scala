package com.scala.hello
object MapBasic extends App {
  // your code goes here

  val colorMap = Map("red" -> "kempu", "blue" -> "neeli", "green" -> "hasiru")
  colorMap.keys.foreach {
    i =>
      print("key =" + i)
      println("  Value: " + colorMap(i))

  }
  if (colorMap.contains("red")) {
    println("red is present and value  " + colorMap("red"))
  }
}
/*
Success	 time: 0.42 memory: 382016 signal:0
key =red  Value: kempu
key =blue  Value: neeli
key =green  Value: hasiru
red is present and value  kempu

*/ 