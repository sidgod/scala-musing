package com.sid.scala.nine

import scala.actors.Actor
import scala.actors.Actor._

object ActorOne {

  def main(args: Array[String]): Unit = {
    
    val smallActor = actor {
      loop {
        receive {
          case "mailBox" => println("Current mailbox size is " + mailboxSize)
          case x: String => println("Got string data as " + x)
          case i: Int => println("Got some integer as " + i)
          case _ => println("I've no idea what in god's name I got!")
        }
      }
    }
    
    smallActor.start
    
    smallActor ! "Siddharth"
    smallActor ! 9.631
    smallActor ! "mailBox"
    smallActor ! 10
    
  }

}