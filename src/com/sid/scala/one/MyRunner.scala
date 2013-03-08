package com.sid.scala.one

object MyRunner {

  def main(args: Array[String]): Unit = {
    val upper = new StringUpper
    println(upper.upper("my", "first", "scala", "code"))
    println(upper.upperOne("my", "first", "scala", "code"))
    println(upper.printAll("my", "first", "scala", "code"))
  }

}