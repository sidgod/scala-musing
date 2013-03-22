package com.sid.scala.three

import com.sid.scala.three.WeekDays._

object EnumRunner {
  
  def main(args: Array[String]): Unit = {

    println(WeekDays toString)
    println(WeekDays maxId)
    
    for(i <- 0 until WeekDays.maxId)
      println((i+1) + " = " + WeekDays.apply(i))
      
    for(day <- WeekDays.values)
      println(day)
        
  }
  
}