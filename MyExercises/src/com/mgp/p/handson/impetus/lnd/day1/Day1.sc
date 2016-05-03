package com.mgp.p.handson.impetus.lnd.day1

object Day1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val `=` = 1                                     //> =  : Int = 1

  def myFunc(a: Int, b: Int): Boolean = {
    true
  }                                               //> myFunc: (a: Int, b: Int)Boolean

  def myfuncc: Function2[Int, Int, Boolean] = myFunc
                                                  //> myfuncc: => (Int, Int) => Boolean
  1 + 2 + "df"                                    //> res0: String = 3df
val f = ( x:Int) => x+1                           //> f  : Int => Int = <function1>




def myfunction (t: => Int)  = {
t} // lies the dfferece                           //> myfunction: (t: => Int)Int


 
def getValue () : Int ={ println ("df")
10}                                               //> getValue: ()Int


myfunction(getValue)                              //> df
                                                  //| res1: Int = 10
           
           
           val arr: Array[_] = new Array(3)       //> arr  : Array[_] = Array(null, null, null)
           
           val list1 = List(1,2,3,4)              //> list1  : List[Int] = List(1, 2, 3, 4)
           
          4 :: list1                              //> res2: List[Int] = List(4, 1, 2, 3, 4)
          
          1                                       //> res3: Int(1) = 1
 class a{
 }
 class b{}


val xx= List(1,2,3)                               //> xx  : List[Int] = List(1, 2, 3)
0::xx                                             //> res4: List[Int] = List(0, 1, 2, 3)

}