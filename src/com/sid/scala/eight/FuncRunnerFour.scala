package com.sid.scala.eight

object FuncRunnerFour {

  def main(args: Array[String]): Unit = {
    
    val test: PartialFunction[String, Boolean] = { case "Siddharth" => true }
    val testAnother: PartialFunction[String, Boolean] = { case x => false }
    
    val compFunc = test orElse testAnother
    
    println(compFunc("Siddharth"))
    
    println(compFunc("Everyone else"))
    
  }

}