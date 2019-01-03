package com.hobart.chapter02.dataconvert

/**
  * 值类型转换
  *
  * 强制类型转换
  */
object ValConvertDemo02 {
  def main(args: Array[String]): Unit = {
    val num1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    val num2: Int = (10 * 3.5 + 6 * 1.5).toInt

    println(num1 + "\t" + num2)

    val char1: Char = 1

    val num3 = 1
    //val char2: Char = num3 //错误
  }
}
