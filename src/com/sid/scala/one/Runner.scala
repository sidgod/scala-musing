package com.sid.scala.one

object Runner {

  def main(args: Array[String]): Unit = {
    val up = new Upper
    Console.println(up.upper1("Mr", "Siddharth", "Godble"))
    
    Console.println(up.upper2("Mr", "Siddharth", "Godble"))
    
    up.upper2("Mr", "Siddharth", "Godble").foreach(printf("%s ", _))
  }

}