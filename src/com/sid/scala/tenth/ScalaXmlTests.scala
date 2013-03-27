package com.sid.scala.tenth

import scala.xml._

object ScalaXmlTests {

  def main(args: Array[String]): Unit = {
    val someXML =
      <sammich>
        <bread good="nope">wheat</bread>
        <meat>salami</meat>
        <condiments>
          <condiment expired="true">mayo</condiment>
          <condiment expired="false">mustard</condiment>
        </condiments>
      </sammich>
      
      println(someXML.isInstanceOf[scala.xml.Elem])
      
      val data1 = someXML \ "meat"
      println(data1)
      
      val data2 = (someXML \ "bread").text
      println(data2)
    
      val data22 = (someXML \ "bread") \ "@good"
      println("Good ? " + data22)
    
      val data3 = someXML \\ "condiment"
      println(data3)
      
      val data4 = (someXML \\ "condiment")(1)
      println(data4)
      
      val data5 = (someXML \\ "condiment")(1) \ "@expired"
      val data6 = (someXML \\ "condiment")(1).text
      println(data6 + " ? " + data5)
    
      someXML match {
      case <sammich>{ing @ _*}</sammich> => {
        for (cond @ <condiments>{_*}</condiments> <- ing) {
          println("|" + cond.text + "|")
        }
      }
    }
  }

}