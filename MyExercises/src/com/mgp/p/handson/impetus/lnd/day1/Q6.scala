package com.mgp.p.handson.impetus.lnd.day1

/**
 * *
 * 6. Create a class called Connection( connectionId, url, port). How will you ensure that you will not create more than 10 connection objects?
 */
object Q6 extends App{

private var i =10
//def createConnection () : Connection = {
//  
//  case S
//  try{
//    
//	  if(i<10) {   
//		  new Connection("connectionId", "http://mysql", "3030")
//	  }else {
//	    
//		  
//	  }
//	  }catch {
//	    case i > 10: Throwable => i > 10.printStackTrace() // TODO: handle error
//  }
//}


}
  class Connection (var  connectionId : String, var url: String, var port : String) {
    
  }