package com.hobart.chapter04.mybreak

import util.control.Breaks._

/**
  * break 中断循环
  *
  * scala中已经去掉了 break 和 continue 关键字
  */
object BreakDemo01 {
  def main(args: Array[String]): Unit = {
    var n = 1
    
    //1、breakable是一个高阶函数
    //2、    def breakable(op: => Unit) {
    //      try {
    //        op
    //      } catch {
    //        case ex: BreakControl =>
    //          if (ex ne breakException) throw ex
    //      }
    //    }
    //3、breakable 对 break()抛出的异常做了处理，代码就继续执行
    //4、当我们传入的是代码块，scala程序员一般会将() 改成{}
    breakable {
      while (n <= 20) {
        n += 1
        println("n=" + n)
        if (n == 18) {
          //中断while
          //说明
          //1、在scala中使用函数式的break函数中断循环
          //2、def break() Nothing = {throw breakException}
          break()
        }
      }
    }
    println("ok~~")
    
    println("*********************")
    var loop = true
    for (i <- 1 to 10 if loop == true){
      if (i > 5) {
        println("循环守卫实现中断 第一次大于20的当前数=" + i)
        loop = false
      }
      println("i=" + i)
    }
  }
}
