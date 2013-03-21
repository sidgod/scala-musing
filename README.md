scala-musing
============

Scala Trial Stuff

All examples coded while going through Programming Scala OFPS edition. 

So these are some of things I want to put here as a quick ref to look at. This is basically 
some awesome features of Scala as well as some basics of Scala.

val and var. Functions defined using def. "_" wildcard for foreach  / map etc.
Functions with default values for arguments. Defs inside defs. 
Need to have return type defined for some cases of functions.
Tuples - ()
Option - Some / None. Avoid using null.
import java.util.{Map, HashMap}. Can me renamed / cancelled (for cases import everything except ...)
import java.math.BigInteger.{
    ONE => _,
    TEN,
    ZERO => JAVAZERO }
    
_root_ for non-relative imports, starting from root package.
No need to use . for non-argument chaining like this:

List(1, 2, 3, 4) filter isEven foreach println

If else statements can be used with assignment as well.

Comprehensions "<-". Can be clubbed with for loop as its if clause. Also subset result can be assigned to some
other variable using "yield". Can be used with for loop and case switch for pattern matching.

match - case statement can be written in class as well. (anywhere actually)

Matching can be on basis of data type, pattern, pattern in object attributes, lists (element in lists, head :: tail)
Can also be in tuples. Used in try - catch - finally for matching exception as expression.

Uniform access principal. _= as setter of some private variable.

Companion classes - apply, unapply. apply - factories. unapply - extraction of data from object.
unapply content will be used in match greatly.

== internally calls equals. Works on everything except arrays where we have to use sameElements.

Avoid inheriting case class from other case class.

