package com.hobart.chapter04.myfor

/**
  * for 的步长控制
  */
object ForRangeDemo07 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("i=" + i)
    }
    
    println("--------------------------------")
    //步长控制
    //Range(1,10,2)对应的构建方法是
    for (i <- Range(1,10,2)) {
      println("i=" + i)
    }
    println("****************")
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i=" + i)
    }
  }
}
