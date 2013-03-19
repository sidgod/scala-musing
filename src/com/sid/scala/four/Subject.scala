package com.sid.scala.four

trait Subject {
  
  type observer = { def receiveUpdate(subject: Any) }
  
  private var observers = List[observer]()
  
  def addObserver(obs: observer) = observers ::= obs
  
  def notifyObservers = observers foreach (_.receiveUpdate(this))

}