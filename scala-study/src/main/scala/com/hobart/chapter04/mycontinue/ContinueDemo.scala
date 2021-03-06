package com.hobart.chapter04.mycontinue

/**
  * 替代continue
  */
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1、1 到 10
    //2、循环守卫 if (i != 2 && i != 3)这个条件为true，才执行循环体
    // 即当i == 2 或者 i == 3时，跳过
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }
    
    println("=============替代==============")
    for (i <- 1 to 10) {
      if (i != 2 && i != 3) {
        println("i=" + i)
      }
    }
  }
}
