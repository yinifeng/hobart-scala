package com.hobart.chapter04.myfor

/**
  * for的嵌套循环
  */
object ForForDemo05 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 ; j <- 1 to 3){
      println("i=" + i + " j=" + j)
    }
    
    println("===========等价===========")
    for (i <- 1 to 3){
      for (j <- 1 to 3) {
        println("i=" + i + " j=" + j)
      }
    }
  }
}
