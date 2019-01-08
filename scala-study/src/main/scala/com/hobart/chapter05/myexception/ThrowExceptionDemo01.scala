package com.hobart.chapter05.myexception

object ThrowExceptionDemo01 {
  def main(args: Array[String]): Unit = {
    //val res = test()
    
    //如果希望test()抛出异常后，代码继续执行，捕获异常
    try {
      test()
    } catch {
      case ex:Exception => println("捕获异常："+ex.getMessage)
    } finally {}
    
    println("ok~~~")
  }

  /**
    * 自定义抛出异常
    * @return
    */
  def test(): Nothing ={
    throw new Exception("NO1异常出现")
  }
}
