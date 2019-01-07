package com.hobart.chapter05.fundetail

/**
  * 可变参数
  */
object VarParameters {
  def main(args: Array[String]): Unit = {
    println(sum(10,30,20,65,80,73))
    
    //这是一个函数
    def f1 = "sfdsfs"
    println(f1)
  }

  /**
    * 可变参数只能写在参数的最后
    * @param n1
    * @param args
    * @return
    */
  def sum(n1 : Int,args : Int *): Int ={
    println("args.length="+args.length)
    var sum = n1
    for (item <- args){
      sum += item
    }
    sum
  }
}
