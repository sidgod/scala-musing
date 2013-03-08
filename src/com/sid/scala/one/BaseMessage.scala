package com.sid.scala.one

abstract class BaseMessage(msgType: String, rawMsg: String) {
  override def toString() = "Msg Type: " + msgType + " Raw Msg contents: " + rawMsg;
}