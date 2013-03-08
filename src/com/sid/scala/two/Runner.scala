package com.sid.scala.two

import StringUtil._
import java.util.Map
import java.util.HashMap

object Runner {

  def main(args: Array[String]): Unit = {
    
    val trialMap : Map[String, String] = new HashMap
    
    println(joiner(List("Siddharth", "Godbole"), " "));
    println(joiner(List("Siddharth", "Godbole")));
    
  }

}