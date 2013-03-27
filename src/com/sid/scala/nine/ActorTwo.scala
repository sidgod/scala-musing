package com.sid.scala.nine

object ActorTwo {

  def main(args: Array[String]): Unit = {
    import scala.actors.Actor
    import scala.actors.Actor._

    val countActor = actor {
      loop {
        react {
          case x: Int => println("Int")
          case "how many?" => {
            println("I've got " + mailboxSize.toString + " messages in my mailbox.")
          }
          case _ => println("Got unexpected ")
        }
      }
    }

    countActor ! 1
    countActor ! 2
    countActor ! 3
    countActor ! "how many?"
    countActor ! "how many?"
    countActor ! 4
    countActor ! "how many?"
  }

}