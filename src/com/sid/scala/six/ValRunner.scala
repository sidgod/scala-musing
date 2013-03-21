package com.sid.scala.six

object ValRunner {

  def main(args: Array[String]): Unit = {
    val test = new ValBox
    Console.println("Old value of data is " + test.dataVal)
    test.dataVal = 20;
    Console.println("New value of data is " + test.dataVal)
    val anontest = new ValBoxExtn
    Console.println("New value of extended data is " + anontest.dataVal)
  }

}