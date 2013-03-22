package com.sid.scala.eight

object FuncRunnerTwo {

  def main(args: Array[String]): Unit = {
    List(1, 2, 3, 4, 5) foreach { me => print(me + " ") }
    println()
    val output = List(1, 2, 3, 4, 5) map ( me => me * 10 )
    println(output)
    val stateCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska" -> "Juneau",
      "Wyoming" -> "Cheyenne")
      
    // TODO sortby ?
    val outKey = stateCapitals map { entry => entry._1.toUpperCase() }
    val outVal = stateCapitals map { entry => entry._2.endsWith("u") }
    val out = (outKey, outVal)
    println(out)
  }

}