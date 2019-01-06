package com.hobart.chapter05.func

/**
  * 递归 函数没办法类型推断
  */
object FunctionDemo02 {
  def main(args: Array[String]): Unit = {
    test(4)
    println("=======================")
    test2(6)
  }
  
  def test(n1 : Int): Unit ={
    if (n1 > 2){
      test(n1-1)
    }
    println("n1="+n1)
  }

  def test2(n2 : Int): Unit ={
    if (n2 > 2){
      test2(n2-1)
    }else{
      println("n1="+n2)
    }
  }
}
