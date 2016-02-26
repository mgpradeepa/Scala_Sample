package com.mgp.p.handson

object Check {
  
  def main (args:Array[String]) {
    
	  val s = "  Pradeep"
			  println(MyUtil.trim(s))
  }

  def multi[A](a:Array[Array[A]], b:Array[Array [A]]) (implicit n: Numeric[A]) =
  {
    import n._

    for(row <-a )
      yield
       for (col <- b.transpose)
      yield row zip   col map Function.tupled(_*_) reduceLeft(_+_)

  }

  println(multi[Int](Array(Array(1, 2), Array(3, 4)),Array(Array(-3, -8, 3), Array(-2, 1, 4))).mkString(" "))


  def multiGenerics()


}