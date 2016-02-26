package com.mgp.p.handson.impetus.lnd.day2

object HigherOrderFunc extends App {

  // sum(f(x), 0,n)

  def sum(f: (Int, Int) => Double, init: Int, end: Int): Double = {
    summation(init, end)
  }

  var summer = 0.0
  def summation(init: Int, end: Int): Double = {
    if (init<=end) 0.0
    else {
    while(init <= end) {

      summer += summation(init + 1, end) * math.random
      println(summer)
    }
    summer

    }
  }
  println(sum(summation, 1, 5))
  

}