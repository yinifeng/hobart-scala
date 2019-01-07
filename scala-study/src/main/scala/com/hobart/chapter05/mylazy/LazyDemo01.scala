package com.hobart.chapter05.mylazy

/**
  * 惰性函数
  * 懒加载
  */
object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    //lazy不能修饰var变量
    lazy val res = sum(10,20)
    println("--------------")
    println("res=" + res)//在要使用res前,才执行
  }
  //sum函数，返回和
  def sum(n1 :Int,n2 :Int): Int ={
    println("sum() 执行了...")//输出一句话
    n1 + n2
  }
}
