package com.hobart.chapter01

/**
  * 1、scala语言严格区分大小写
  * 2、scala的源文件以.scala结尾
  * 3、scala程序的执行入口是main()函数
  * 4、scala方法由一条条语句构成，每个语句后不需要加分号
  * 5、如果在同一行有多条语句，除最后一条语句不需要分号，其他语句需要分号
  */
object TestScala {
  def main(args: Array[String]): Unit = {
    println("hello,scala,idea...")

    var a: Int = 1
    var b: Int = 2
    println(a + b)

  }
}
