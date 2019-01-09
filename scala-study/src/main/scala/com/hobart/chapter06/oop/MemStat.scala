package com.hobart.chapter06.oop

/**
  * 
  */
object MemStat {
  def main(args: Array[String]): Unit = {
    val p1 = new Person
    p1.name = "tom"
    p1.age = 21
    val p2 = p1
    println(p1 == p2)
    p2.name = "jack"
    println("p1.name="+p1.name)
    println("p2.name="+p2.name)
  }
}

class Person{
  var name = ""
  var age: Int = _ //以_做默认值必须指定变量的类型
}
