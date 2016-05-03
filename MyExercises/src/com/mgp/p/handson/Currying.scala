package com.mgp.p.handson

//object Currying extends App {

//  def withClose_old(closeAble: { def close(): Unit })(op: { def close(): Unit } => Unit) {
//    try {
//      op(closeAble)
//    } finally {
//      closeAble.close()
//    }
//  }

//  class Connection {
//    def close() = println("close Connection")
//  }
//
//  val conn: Connection = new Connection()
//  withClose(conn)
//
//  def withClose(closeAble: { def close(): Unit }) = {
//    try {
//      op(closeAble)
//    } finally {
//      closeAble.close()
//    }
//  }
//  
  
  
  //-----------------
  
//  trait ForEachAble[A]  {
//  def iterator: java.util.Iterator[A]
//  def foreach(f: A => Unit) = {
//    val iter = iterator
//    while (iter.hasNext)
//      f(iter.next)
//  }
//}
//
//trait JsonAble{
//  def toJson() =
//    scala.util.parsing.json.JSONFormat.defaultFormatter(this)
//}
//
//val list = new java.util.ArrayList[Int]() with ForEachAble[Int] JsonAble[Int]
//list.add(1); list.add(2)//val json = new 
//
//println("For each: "); list.foreach(x => println(x))
//println("Json: " + list.toJson())
//
//    
//}
