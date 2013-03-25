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
    
    def startsWithA(entry: (String, String)) : Boolean = { entry._1 startsWith "A"}
    
    // TODO try out all filtering defs in Iterable
    val filteredMap = stateCapitals filter(startsWithA)
    println("Filtered map: " + filteredMap)
    
    // TODO try out all fold / reduce operations
  }

}