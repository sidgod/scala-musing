package com.sid.scala.pad

object workpad {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  println("Welcome to the Scala worksheet");$skip(45); 
  def modFunc(x: Int) = if (x >=0) x else -x;System.out.println("""modFunc: (x: Int)Int""");$skip(14); val res$0 = 
  modFunc(-1);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
  modFunc(0);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
  modFunc(1);System.out.println("""res2: Int = """ + $show(res$2));$skip(59); 
  def and(x: Boolean, y: => Boolean) = if (x) y else false;System.out.println("""and: (x: Boolean, y: => Boolean)Boolean""");$skip(56); 
	def or(x: Boolean, y: => Boolean) = if (x) true else y;System.out.println("""or: (x: Boolean, y: => Boolean)Boolean""");$skip(17); val res$3 = 
	and(true, true);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(18); val res$4 = 
	and(true, false);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(18); val res$5 = 
	and(false, true);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(19); val res$6 = 
	and(false, false);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(16); val res$7 = 
	or(true, true);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(17); val res$8 = 
	or(true, false);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(17); val res$9 = 
	or(false, true);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(18); val res$10 = 
	or(false, false);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(11); 
	val x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(23); 
	def f(y: Int) = y + 1;System.out.println("""f: (y: Int)Int""");$skip(46); 
	val result = {
		val x = f(3)
		x * x
	} + x;System.out.println("""result  : Int = """ + $show(result ))}
}
