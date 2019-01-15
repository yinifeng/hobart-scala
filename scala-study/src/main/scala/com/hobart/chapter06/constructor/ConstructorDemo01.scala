package com.hobart.chapter06.constructor

/**
  * 构造器测试
  * 
  * 主构造器
  *   class A(){}
  *   
  * 辅构造器
  *   class A(){
  *     def this(name: String){
  *       this()
  *     }
  *   }
  */
object ConstructorDemo01 {
  def main(args: Array[String]): Unit = {
    val d1 = new Dog()
    println(d1.toString)
    
    val c1 = new Cat
  }
}

//主构造器写在类的后面
class Dog(inName: String,inAge: Int){
  var name: String = inName
  var age: Int = inAge
  
  println("ok~~~")
  
  age +=10
  
  def this(){
    //首行显示的调用主构造器 或 辅构造器
    //要么直接或间接的调用主构造器
    this("tom",21)
    println("辅构造器....")
  }
  
  def this(name: String){
    this()//这个调用的辅构造器，间接调用了主构造器
    this.name = name
  }
  
  //重写toString
  override def toString: String = {
    "name="+this.name+"\t"+"age="+this.age
  }
  
  println("ok~ok~")
}

class Cat(){
  
}