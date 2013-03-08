package com.sid.scala.three

object CompreTrial {
  
  def doIt(name: String) : String = {
	  val newName = if (name.length() < 1) 
		  "default"
	  else 
		  name.toUpperCase()
	  return newName
  }
  
   def main(args: Array[String]): Unit = {
     println(doIt(""))
     println(doIt("Siddharth"))
     
     val days = List("Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday")
     days foreach println

     println("Comprehension all days")
     for(day <- days)
       println(day)
       
     println("All days starting with T")
     for(day <- days
         if day.startsWith("T"))
       println(day)
       
     println("Weekends")
     val weekendList = for {
       day <- days
       if(day.startsWith("S"))
     } yield day
     println(weekendList)
     weekendList foreach println
     
     println("Weekend upper case")
     for {
       day <- days
       val upperDay = day.toUpperCase()
       if(upperDay.startsWith("S"))
     } println(upperDay)
     
     println("Weekday / Weekend")
     for (day <- days) {
       day match {
         case "S*" => println("Weekend :)")
         case _ => println("Weekday :(")
       }
     }
     
   }

}