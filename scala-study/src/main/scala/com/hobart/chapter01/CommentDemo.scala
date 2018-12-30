package com.hobart.chapter01

object CommentDemo {

  def main(args: Array[String]): Unit = {
    var num = sum(1, 2)
    println(num)
  }

  /**
    * 求和
    *
    * @param n1
    * @param n2
    * @return
    */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

}
