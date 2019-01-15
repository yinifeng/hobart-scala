package com.hobart.chapter06.constructor

/**
  * 主构造器和属性
  */
object ConstructorDemo03 {
  def main(args: Array[String]): Unit = {
    val w1 = new Worker("jack");
    w1.name

    val w2 = new Worker2("jack");
    w2.inName//只读的属性
    w2.name

    val w3 = new Worker3("jack");
    w3.inName //可读可写
    w3.name
    
  }
}

class Worker(inName: String){
  var name = inName
}

class Worker2(val inName: String){
  var name = inName
}

class Worker3(var inName: String){
  var name = inName
}
