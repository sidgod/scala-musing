package com.sid.scala.five

object Runner {

  def main(args: Array[String]): Unit = {
    try {
      val trial = new OOPTrial(null)
      trial print
    } catch {
      case e: IllegalArgumentException =>
        Console.println("Failed to run!", e);
    }
    
    try {
      val anotherTrial = new OOPTrialFullName("Siddharth", null)
      anotherTrial printfullname
    } catch {
      case e: Exception =>
      	Console.println("Another Failed to run!", e);
    }
    
  }

}