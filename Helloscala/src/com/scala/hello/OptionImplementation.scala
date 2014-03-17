package com.scala.hello
object OptionImplementation extends App {
  // your code goes here
  val capital = Map("France" -> "Paris", "Japan" -> "Tokyo");
  println("show capitals.get(Japan) : " + show(capital.get("Japan")))
  println("show capitals.get(India) : " + show(capital.get("India")))

  val a: Option[Int] = Some(5)
  val b: Option[Int] = None
  println("1--> " + a.getOrElse(0))

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

}
/*
Success	 time: 0.42 memory: 382016 signal:0
show capitals.get(Japan) : Tokyo
show capitals.get(India) : ?
1--> 5
*/ 