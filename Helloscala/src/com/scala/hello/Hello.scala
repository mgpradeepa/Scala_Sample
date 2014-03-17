/**
 *
 */
package com.scala.hello

/**
 * @author GPS
 *
 */
object Hello {

  def main(args: Array[String]) {
    println("Hello world")
    val arr = Array(2, 5, 11, 3)
    sort(arr)
    //    println(sort(arr));
  }

  //Quick sort with pivot consideration
  def sort(xs: Array[Int]) {
    def swap(i: Int, j: Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t

    }
    def sort1(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l;
      var j = r;
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1;
          j -= 1;

        }
      }
      if (l < j) sort1(l, j);
      if (j < r) sort1(i, r);
    }
    sort1(0, xs.length - 1)
  }

}