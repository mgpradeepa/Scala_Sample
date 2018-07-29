Scala Collections 
################################################################

1.) Can you figure out what method you can use to find out if the list:
List(1,2,3,4,5) contains the number 3?

scala> val myList = List(1,2,3,4,5)
myList: List[Int] = List(1, 2, 3, 4, 5)

scala> myList contains 3
res25: Boolean = true

---------------------------------------------------------------------------

2.) How can you add all the elements of the previous list?

scala> myList.sum
res26: Int = 15
------------------------------------------------------------------

3.) Create an Array of all the odd numbers from 0 to 15

scala> val rangeArray = Range(1,15,2)
rangeArray: scala.collection.immutable.Range = Range(1, 3, 5, 7, 9, 11, 13)
------------------------------------------------------------------------

4.) What are the unique elements in the list: List(2,3,1,4,5,6,6,1,2)?

scala> uniqList toSet
warning: there was one feature warning; re-run with -feature for details
res29: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)

scala> uniqList.toSet
res30: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)


-----------------------------------------------------------------------------
5.) Create a mutable map that maps together Names to Ages.
It should have the following key value pairs:
Sammy, 3
Frankie, 7
John, 45

5a) Print out all the keys

5b) Add the key value pair ("Mike",27)

scala> val mutMap = collection.mutable.Map(("Sammy",3),("Frankie",7),("John",45))
mutMap: scala.collection.mutable.Map[String,Int] = Map(Sammy -> 3, Frankie -> 7, John -> 45)

scala> mutMap keys
warning: there was one feature warning; re-run with -feature for details
res27: Iterable[String] = Set(Sammy, Frankie, John)

scala> mutMap += ("Mike" ->27)
res28: mutMap.type = Map(Sammy -> 3, Mike -> 27, Frankie -> 7, John -> 45)
