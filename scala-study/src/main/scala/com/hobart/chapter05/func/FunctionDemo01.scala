package com.hobart.chapter05.func

/**
  * 函数的定义
  * 
  * 1、函数声明的关键字为 def
  * 2、[参数名:参数类型],...:表示函数的输入，可以没有，多个参数用,隔开
  * 3、函数中的语句：表示为实现某一功能的代码块
  * 4、函数可以有返回值，也可以没有
  *     返回值形式1： : 返回值类型 =
  *     返回值形式2： = 表示返回值类型不确定，使用类型推导完成
  *     返回值形式3： 表示没有返回值，return不生效
  * 5、如果没有return，默认以执行最后一行的结果作为返回值
  * 
  */
object FunctionDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 20 
    val n2 = 30
    println("res=" + getRes(n1,n2,')'))
    
  }
  
  //定义函数和方法
  def getRes(n1 : Int,n2 : Int, oper : Char) = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-'){
      n1 - n2
    }else {
      null
    }
  }
}
 