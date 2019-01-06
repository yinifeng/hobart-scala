package com.hobart.chapter05

object Method2Function {
  def main(args: Array[String]): Unit = {
    
    
    //使用方法
    //先创建对象
    var dog = new Dog
    println("s1="+dog.sum(1,2))
    
    //方法转函数
    var f1 = dog.sum _
    println("f1=" + f1)
    println("f1=" + f1(10,20))
    
    //定义一个函数
    var f2 = (n1:Int,n2:Int) => {
      n1 + n2
    }
    
    println("f2="+f2)
    println("f2="+f2(30,50))
    
    
  }
}

class Dog{
  //方法
  def sum(n1:Int,n2:Int): Int ={
    n1 + n2
  }
}
