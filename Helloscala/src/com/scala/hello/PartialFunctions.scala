package com.scala.hello
import java.util.Date;
object PartialFunctions extends App {
  // your code goes here

  val date = new Date();
  log(date, "message_1")
  Thread.sleep(1000)
  log(date, "message_2")

  Thread.sleep(1000)
  log(date, "message_3")

  // Instead we can also use partial function
  val logWithDateBound = logg(date, _: String)
  println("Partially called executing")
  logWithDateBound("message1")
  Thread.sleep(1000)
  logWithDateBound("message2")
  Thread.sleep(1000)
  logWithDateBound("message3")

  def logg(date: Date, msg: String) = {
    println(" Partial : " + date + ":: " + msg)
  }

  def log(date: Date, msg: String) = {
    println("Non partial function " + date + "  :: " + msg + " \n")
  }
}
