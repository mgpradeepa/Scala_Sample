package com.mgp.p.handson

object FlattenList extends App {

  def flatten(ls: List[Any]): List[Any] = ls.flatMap {

    case ms: List[_] => flatten(ms)
    case e           => List(e)
  }
  val op = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  println(op)

}



  
  
  
