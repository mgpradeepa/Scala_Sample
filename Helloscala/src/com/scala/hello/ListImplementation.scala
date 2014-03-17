package com.scala.hello;
object ListImplementation extends App {
  // your code goes here
  // Concatenating the lists
  //::: operator or List.:::() method 
  //List.concat() method to add two or more lists

  val fruit: List[String] = "apples" :: ("oranges" :: ("banana" :: Nil))
  val forestFruits: List[String] = "geruhannu" :: ("gorhanu" :: Nil)

  // use two or more list with ::: operator to concat
  var f1 = fruit ::: forestFruits
  println("fruit:::forestFruits : " + f1)

  // use two list with Set.:::() method
  f1 = fruit.:::(forestFruits)
  println("fruit.:::(forestFruits) : " + f1)

  // pass two or more list as parameter to the cocat method

  val dryFruits: List[String] = "dates" :: ("anjura" :: ("godambi" :: Nil))
  f1 = List.concat(fruit, forestFruits, dryFruits)
  println("concat(fruit, forestFruit, dryFruits)) : " + f1)

}
/*
Output
Success	 time: 0.37 memory: 382016 signal:0
fruit:::forestFruits : List(apples, oranges, banana, geruhannu, gorhanu)
fruit.:::(forestFruits) : List(geruhannu, gorhanu, apples, oranges, banana)
concat(fruit, forestFruit, dryFruits)) : List(apples, oranges, banana, geruhannu, gorhanu, dates, anjura, godambi)
*/

