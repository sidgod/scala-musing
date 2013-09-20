package com.sid.scala.pad

object workpad {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  println("Welcome to the Scala worksheet");$skip(45); 
  def modFunc(x: Int) = if (x >=0) x else -x;System.out.println("""modFunc: (x: Int)Int""");$skip(14); val res$0 = 
  modFunc(-1);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
  modFunc(0);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
  modFunc(1);System.out.println("""res2: Int = """ + $show(res$2))}
}
