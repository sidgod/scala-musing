package com.sid.scala.pad

object workpad {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def modFunc(x: Int) = if (x >=0) x else -x      //> modFunc: (x: Int)Int
  modFunc(-1)                                     //> res0: Int = 1
  modFunc(0)                                      //> res1: Int = 0
  modFunc(1)                                      //> res2: Int = 1
}