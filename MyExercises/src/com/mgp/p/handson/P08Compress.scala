package com.mgp.p.handson
/**
 * *
 * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
 * Example:
 *
 * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */

object P08Compress extends App {

//  
//  def compressTailRecurise[A] (ls: List[A] ) : List[A] = {
//    def compacc(result : List[A], curList : List[A]): List[A] = curList match{
//      case  Nil => result.reverse
//      case h :: tail => compacc(h::result, tail.dropWhile(_==h))
//          
//    }compacc(Nil, ls)
//  }
  
  
//  val op1 = compressTailRecurise(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  
  
}