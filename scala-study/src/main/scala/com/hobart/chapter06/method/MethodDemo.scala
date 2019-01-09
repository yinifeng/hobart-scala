package com.hobart.chapter06.method

/**
  * 方法测试
  */
object MethodDemo {
  def main(args: Array[String]): Unit = {
    val dog= new Dog
    println(dog.cal(10,20))
  }
}

class Dog{
  private var name: String = _
  var flood: String = _
  
  def cal(n1: Int,n2: Int): Int ={
    return n1 + n2
  }
}
