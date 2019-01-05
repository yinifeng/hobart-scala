package com.hobart.chapter03.assignoper

/**
  * 赋值运算符
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 3
    num <<= 2  //左移
    println("num=" + num)
    
    num >>= 1 //右移
    println("num=" + num)
    
    // &= |= ^=
    
    //在scala中支持代码块返回值
    var res = {
      if (num > 1) "hello,ok" else 100
    }
    
    println("res=" + res)
    
    var n1= if (5 > 4) 5 else 4
    //var n1 = 5 > 4 ? 5 : 4 //error
  }
}
