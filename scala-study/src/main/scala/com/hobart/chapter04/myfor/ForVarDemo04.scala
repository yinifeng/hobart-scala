package com.hobart.chapter04.myfor

/**
  * for 循环引用变量
  */
object ForVarDemo04 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 ; j = 4 - i){
      print(j+" ")
    }
    println()
    println("====等价于=====")
    for (i <- 1 to 3){
      var j = 4 -i
      print(j+" ")
    }

    println()
    println("====等价于=====")
    for {
      i <- 1 to 3
      j = 4 - i
    }{
      print(j+" ")
    }
  }
}
