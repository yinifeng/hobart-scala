package com.hobart.chapter04.myfor

/**
  * 循环守卫
  */
object ForDemo03 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 if i != 2) {
      print(i+" ")
    }
    
    println("====等价=====")
    for (i <- 1 to 3){
      if (i != 2) {
        print(i + " ")
      }
    }
  }
}
