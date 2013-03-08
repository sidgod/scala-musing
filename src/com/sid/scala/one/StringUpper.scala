package com.sid.scala.one

class StringUpper {
  
  def upper(strings: String*) : Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }
  
  def upperOne(strings: String*) = strings.map(_.toUpperCase())
  
  def printAll(strings: String*) = strings.map(_.toUpperCase()).foreach(printf("%s ", _))
  
}