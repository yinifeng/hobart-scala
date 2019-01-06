package com.hobart.chapter05.fundetail

object Details04 {
  def main(args: Array[String]): Unit = {
    println(sayOk())
    println(sayOk("jack"))
    
    println("-----------------")
    mysqlCon("127.0.0.1",3030)
    
    println("-----------------")
    //代名参数 制定替换的默认值函数调用
    mysqlCon(user = "tom",pwd ="123456")
  }
  
  //name 的形参的默认值 tom
  def sayOk(name:String = "tom"): String ={
    return name+" ok!"
  }
  
  def mysqlCon(add:String="localhost",port:Int=3306,
               user:String="root",pwd:String="root"): Unit ={
    println("add=" + add)
    println("port=" + port)
    println("user="+ user)
    println("pwd=" + pwd)
  }
}
