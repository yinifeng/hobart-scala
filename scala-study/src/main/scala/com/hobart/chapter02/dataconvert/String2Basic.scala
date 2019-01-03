package com.hobart.chapter02.dataconvert

object String2Basic {
  def main(args: Array[String]): Unit = {
    val d1=10
    val s1=d1 + ""
    
    val s2="12"
    val num1= s2.toInt
    val num2= s2.toByte
    val num3= s2.toDouble
    val num4= s2.toLong
    
    println("ok~")
    
    val s3="hello"
    println(s3.toInt)
  }
}
