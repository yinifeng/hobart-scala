package com.hobart.chapter02.dataconvert


/**
  * 
  * 值类型转换
  * 
  * 1、有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
  * 2、当我们把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换
  * 3、(Byte,Short) 和 Char之间不会相互自动转换
  * 4、byte ，short ，char他们三者是可以计算，在计算时首先转换为int类型
  * 5、自动提升原则：表达式结果的类型自动提升为 操作数最大的类型
  */
object ValConvertDemo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1f
    
    var n3= n1 + n2
    //(Byte,Short) 和 Char之间不会相互自动转换
    var n4:Byte =10
    //var char:Char=n4  //错误，因为byte 不能自动转换char
    
  }
}
