package com.sid.scala.one

import com.sid.scala.one.shapes._

object ShapeDrawer {

  def main(args: Array[String]): Unit = {
    ShapeDrawingActor.start()
    
    ShapeDrawingActor ! new Circle(new Point(0.0, 0.0), 10.0)
    ShapeDrawingActor ! new Rectangle(new Point(3.0, 4.0), 10.0, 20.0)
    ShapeDrawingActor ! "SomeCrap"
    ShapeDrawingActor ! 3.142
    ShapeDrawingActor ! "exit"
  }

}