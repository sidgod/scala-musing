package com.sid.scala.one

package object shapes {
  
  import scala.actors.Actor
  
  class Point(val xVal: Double, val yVal: Double) {
    override def toString() = "Point (" + xVal + ", " + yVal + ")"
  }
  
  abstract class Shape {
    def draw() : Any
  }
  
  class Circle(val center: Point, val radius: Double) extends Shape {
    def draw() = println("Circle.draw " + this)
    override def toString() = "Circle ( " + center + ", " + radius + ")" 
  }
  
  class Rectangle(val lowerLeft: Point, val height: Double, val width: Double) extends Shape {
    def draw() = println("Rectangle.draw " + this)
    override def toString() = "Rectangle (" + lowerLeft + ", " + height + ", " + width + ")"
  }
  
  object ShapeDrawingActor extends Actor {
    def act() {
      loop {
        receive {
          case s: Shape => s.draw()
          case "exit" => println("Exiting ..."); exit
          case x: Any => println("Unknown message: " + x)
        }
      }
    }
  }

}