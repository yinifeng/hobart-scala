package com.hobart.chapter04.myfor

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    var start = 1
    var end = 10
    //1、start 从哪个数开始循环
    //2、to 关键字
    //3、end 循环结束的值
    //4、start to end 表示前后闭合
    for (i <- start to end) {
      println("hello,hobart" + i)
    }
    
    println("======================")
    //for这种推导式，也可以直接对集合进行遍历
    var list = List("hello",30,10,"tom")
    for (item <- list){
      println("item=" + item)
    }
  }
}
