package com.mgp.p.handson.impetus.lnd.day1
import scala.sys.process._

/**
 * *
 * 7.Print the list of files in a directory using cmd/shell
 */

/**
 * @author mgpradeepa
 */
object Q7 extends App {

  def checkFilesinMe(path: String) = {
    val cmd1 = "ls " + path

    val opinter1 = cmd1.!

  }

  checkFilesinMe("/Users/mgpradeepa/Library")

}
