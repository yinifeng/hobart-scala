package com.hobart.chapter04.myfor

object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    var start = 1
    var end = 11
    //循环的范围 start --> end-1
    for (i <- start until 11) {
      println("hello,hobart" + i)
    }
  }
}
