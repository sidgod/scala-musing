package com.sid.scala.five

class OOPTrialFullName (myFirstName: String, myLastName: String) extends OOPTrial(myFirstName: String) {
  
  require(myLastName != null, "My Last name cannot be empty you moron!")
  
	def printfullname() = {
	  Console.println("My name is " + myFirstName + " " + myLastName);
	}
}