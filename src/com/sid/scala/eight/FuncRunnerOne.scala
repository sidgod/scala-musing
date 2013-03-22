package com.sid.scala.eight

object FuncRunnerOne {

  def main(args: Array[String]): Unit = {
    var factor = 3
    val multiplier = (i: Int) => i * factor

    val l1 = List(1, 2, 3, 4, 5) map multiplier

    factor = 5
    val l2 = List(1, 2, 3, 4, 5) map multiplier

    println(l1)
    println(l2)
    
    factor = 10
    
    def multiply(j: Int) : Int = j * factor
    
    val l3 = List(1, 2, 3, 4, 5) map multiply
    println(l3)
    
  }

}