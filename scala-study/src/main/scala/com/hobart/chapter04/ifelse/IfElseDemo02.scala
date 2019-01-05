package com.hobart.chapter04.ifelse

/**
  * 双分支
  */
object IfElseDemo02 {
  def main(args: Array[String]): Unit = {
    var age = 6
    if (age > 18){
      println("age > 18")
    }else{
      println("age <= 18")
    }
  }
}
