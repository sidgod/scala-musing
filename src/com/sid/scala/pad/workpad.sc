package com.sid.scala.pad

object workpad {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def modFunc(x: Int) = if (x >=0) x else -x      //> modFunc: (x: Int)Int
  modFunc(-1)                                     //> res0: Int = 1
  modFunc(0)                                      //> res1: Int = 0
  modFunc(1)                                      //> res2: Int = 1
  def and(x: Boolean, y: => Boolean) = if (x) y else false
                                                  //> and: (x: Boolean, y: => Boolean)Boolean
	def or(x: Boolean, y: => Boolean) = if (x) true else y
                                                  //> or: (x: Boolean, y: => Boolean)Boolean
	and(true, true)                           //> res3: Boolean = true
	and(true, false)                          //> res4: Boolean = false
	and(false, true)                          //> res5: Boolean = false
	and(false, false)                         //> res6: Boolean = false
	or(true, true)                            //> res7: Boolean = true
	or(true, false)                           //> res8: Boolean = true
	or(false, true)                           //> res9: Boolean = true
	or(false, false)                          //> res10: Boolean = false
	val x = 0                                 //> x  : Int = 0
	def f(y: Int) = y + 1                     //> f: (y: Int)Int
	val result = {
		val x = f(3)
		x * x
	} + x                                     //> result  : Int = 16
}