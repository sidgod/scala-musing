package com.sid.scala.one

class Upper {
  
  def upper1(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }
  
  def upper2(strings: String*) = strings.map(_.toUpperCase())
  
}