package com.mgp.p.handson.impetus.lnd.day1

object Nothing extends App{
  def retVal (vall :Int )  : Int = {
    
    try{
      10/vall 
    }
    catch {
      case ex : Throwable => throw new Exception("goobe")
    }
    
  }
  
 println( retVal(10))
 println(retVal(0))
}