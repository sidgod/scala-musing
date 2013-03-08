package com.sid.scala.two

object StringUtil {
  
  def joiner(strings: List[String], sep: String) : String = strings.mkString(sep)
  
  def joiner(strings: List[String]) : String = joiner(strings, " ")

}