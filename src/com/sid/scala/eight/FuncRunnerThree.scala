package com.sid.scala.eight

object FuncRunnerThree {

  def main(args: Array[String]): Unit = {
    
    def writeName(fname: String, lname: String) : String = { fname.toUpperCase + " " + lname.toUpperCase }
    
    val first = writeName _
    
    println(first("Siddharth", "Godbole"))
    
    val two = writeName(_: String, "Godbole")
    
    println(two("Siddharth"))
    
    Predef
    
  }

}