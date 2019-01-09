package com.hobart.chapter06.oop

/**
  * 对象的属性
  */
object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val a =new A
    println(a.p1) //null
    println(a.p2) // ""

    println(a.v1)
    println(a.v2)
    println(a.v3)
  }
}

/**
  * 属性必须初始化值
  */
class A{
  // _ 默认值
  var v1 : Int = _ //0
  var v2 : Boolean = _ //false
  var v3 : String = _ //null
  
  var p1 = null //类型推断 Null 不建议这样写
  var p2 = ""
  
}
