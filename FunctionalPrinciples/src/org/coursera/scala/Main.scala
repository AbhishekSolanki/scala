package org.coursera.scala

object Main {

  def isGoodEnough(guess: Double,x:Double): Boolean = Math.abs(guess * guess - x) /x  < 0.0000001

  def impove(guess: Double, x: Double): Double =   (guess+x/guess)/2

  def SquareRoot(guess: Double,x:Double) : Double =
    if(isGoodEnough(guess,x)) guess
    else SquareRoot(impove(guess,x),x)

  def main(args: Array[String]): Unit = {
    // newton's square root
    println(SquareRoot(1.0,4.0))
  }
}
