package com.hobart.chapter06.constructor

object ConstructorDemo02 {
  def main(args: Array[String]): Unit = {
    val a: A=new B("tom")

    println("ok~")
  }
}

class A{
  
}

class B extends A{
  var name: String = _
  
  
  def this(name:String){
    this
    this.name=name
    println(this.name)
  }
}
