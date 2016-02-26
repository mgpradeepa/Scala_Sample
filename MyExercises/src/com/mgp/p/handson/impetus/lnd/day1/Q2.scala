package com.mgp.p.handson.impetus.lnd.day1
/**
 * 2. Print list of even numbers and odd numbers from an array
 */
object Q2 extends App {

  //  def isEven(num: Int) = num % 2 == 0
  //  var odList=Nil
  //  var evenList=Nil
  val odList = Nil
  val evenList = Nil
  val data = Q1.arr()
  //  Q1.arr().foreach { x =>
  //    x match {
  //      case x: Int if x % 2 == 0 =>
  //        /*List.concat(x,evenList)*/ x:: List(evenList); println("Even : " + x)
  //      case _                    => x :: List(odList); println("Odd : " + x)
  //    }
  //  }

  data.foreach { x =>
    x match {
      case x: Int if x % 2 == 0 =>
        println("Even : " + x)
      case _ => println("Odd : " + x)
    }
  }
  println(data)
  val evenListL = data.filter { x => x % 2 == 0 }
  val oddListL = data.filter { x => x % 2 != 0 }

  println(data.filter { x => x % 2 == 0 } + " :: " + data.filter { x => x % 2 != 0 })
}