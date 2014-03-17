package com.scala.hello
object ListBasicExample extends App {
  // your code goes here
  // List implementation samples
  val fruit: List[String] = "apples" :: ("oranges" :: ("banana" :: Nil))
  val nums: List[Int] = Nil

  System.out.println("Head of fruits : " + fruit.head)
  System.out.println("Tail of fruits : " + fruit.tail)
  System.out.println("check if fruits are empty : " + fruit.isEmpty)
  System.out.println("check if num is empty : " + nums.isEmpty)

}
/*
/Output : 
Success	 time: 0.23 memory: 381760 signal:0
Head of fruits : apples
Tail of fruits : List(oranges, banana)
check if fruits are empty : false
ceheck if num is empty : true

*/ 