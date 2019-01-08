package com.hobart.chapter05.myexception

/**
  * throws 抛出异常注解
  */
object ThrowsCommentDemo01 {
  def main(args: Array[String]): Unit = {
    f11()
  }

  /**
    * 这个方法可能会抛出NumberFormatException
    * @throws java.lang.NumberFormatException
    * @return
    */
  @throws(classOf[NumberFormatException]) //等同于java NumberFormatException.class
  def f11() ={
    "abc".toInt
  }
}
