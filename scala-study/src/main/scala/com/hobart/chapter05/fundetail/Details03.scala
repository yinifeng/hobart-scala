package com.hobart.chapter05.fundetail

object Details03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit ={//ok private final
      println("f1")
    }
    
    println("ok~")
    
    def sayHello(): Unit ={//private final sayHello$1()
      println("main sayHello")
      def sayHello(): Unit ={
        println("sayHello sayHello")//private final sayHello$2()
      }
    }
  }
  
  def sayHello(): Unit ={//成员
    println("main sayHello")
  }
}
