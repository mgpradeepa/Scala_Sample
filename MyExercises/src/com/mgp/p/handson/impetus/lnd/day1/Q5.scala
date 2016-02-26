package com.mgp.p.handson.impetus.lnd.day1
/**
 * *
 * 5. If a = Array(1,2,3,4) and b = Array(“a”, “b”, “c”, “d”) generate the following output ((1,”a”),(2,”b”),(3,”c”),(4, “d”)) and convert it to map
 */
object Q5 extends App {

  val a = Array(1, 2, 3, 4)
  val b = Array("a", "b", "c", "d")

  val aokb = a zip b

//  aokb.toMap
  println("a zip b " + aokb.mkString(",")  + "Mapp " + aokb.toMap )
}