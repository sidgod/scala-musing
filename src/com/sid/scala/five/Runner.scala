package com.sid.scala.five

object Runner {

  def main(args: Array[String]): Unit = {
    try {
      val trial = new OOPTrial(null)
      trial print
    } catch {
      case e: IllegalArgumentException =>
        Console.print("Failed to run!", e);
    }
  }

}