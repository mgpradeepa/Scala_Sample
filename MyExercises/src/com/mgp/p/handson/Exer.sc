package com.mgp.p.handson

object Exer {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1                                               //> res0: Int(1) = 1

  val ls = List(2, 4, 6, 8, 9)                    //> ls  : List[Int] = List(2, 4, 6, 8, 9)

  ls.exists { _ % 2 == 1 }                        //> res1: Boolean = true

  val file = List("Pradeep is good", "Smart is not bad", "Dreams warns you to move ahead")
                                                  //> file  : List[String] = List(Pradeep is good, Smart is not bad, Dreams warns 
                                                  //| you to move ahead)
  file.filter(_.contains("bad")).filter(_.contains("not"))
                                                  //> res2: List[String] = List(Smart is not bad)

  // Implementing Map reduce in terms of scala
  def wordcount(str: String): Int = str.split(" ").count("is" == _)
                                                  //> wordcount: (str: String)Int

  val num = file.map(wordcount).reduceRight(_ + _)//> num  : Int = 2



// tail recursion word count

def foldLeft(ls : List[Int] ) (init:Int) (f: (Int, Int) => Int) : Int = {
ls match {

case List() => init

case head :: tail => foldLeft(tail)(f(init , head))(f)
}

}                                                 //> foldLeft: (ls: List[Int])(init: Int)(f: (Int, Int) => Int)Int

foldLeft(file.map ( wordcount)) (0) (_+_)         //> res3: Int = 2



///Implementing Option


val str = "  Pradeep"                             //> str  : String = "  Pradeep"
 def trim(s:String)= s.trim()                     //> trim: (s: String)String
 str.trim()                                       //> res4: String = Pradeep
 
 
}