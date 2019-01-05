package com.hobart.chapter04.mywhile

object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 10) {
      println("hello,hobart" + i)
      i += 1
    }
  }
}
