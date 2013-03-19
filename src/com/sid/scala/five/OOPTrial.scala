package com.sid.scala.five

class OOPTrial(name: String) {
  
  require(name != null, "Name has to be non-empty string you Idiot!")
  
  def print() = Console.println("My name is " + name);

}