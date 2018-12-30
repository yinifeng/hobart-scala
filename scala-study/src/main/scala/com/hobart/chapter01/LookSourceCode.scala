package com.hobart.chapter01

/**
  * 测试查看源代码
  */
object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var array: Array[Int] = new Array(10)
    for (item <- array) {
      println("item=" + item)
    }
  }
}
