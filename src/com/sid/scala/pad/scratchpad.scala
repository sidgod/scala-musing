package com.sid.scala.pad

object scratchpad extends App {
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
        def loop(a: Int, acc: Int): Int = {
          if (a > b) return acc
          else loop(a + 1 , f(a) + acc)
        }
        loop(a, 0)
      }
  
  println(sum(x => x * x, 1, 3))

}