package com.hobart.chapter02.iden

object IdenDemo {
  def main(args: Array[String]): Unit = {
    //首字符为操作符(比如+ - * /),后续字符也需要跟操作符，至少一个
    val ++ = "hello,world!"
    println(++)
    
    val -+ = 10
    println("res=" + -+)
    
    //val +a = "aaa" //error
    
    //用反引号`....`包括任意字符串，即使是关键字也可以
    val `true` = "hello,scala!"
    println("内容=" + `true`)
  }
}
