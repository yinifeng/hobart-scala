package com.hobart.chapter02.datatype

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("long的最大值" + Long.MaxValue + "~" + Long.MinValue )
    
    var i=10 //i int
    var j=10l //j long
    
    
    var num1:Float = 2.2345678912f  //float 保留7位
    var num2:Double = 2.2345678912
    println("num1="+num1 + "\t"+"num2="+num2)
  }
}
