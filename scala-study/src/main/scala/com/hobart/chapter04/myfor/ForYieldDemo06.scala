package com.hobart.chapter04.myfor

/**
  * 循环返回值
  */
object ForYieldDemo06 {
  def main(args: Array[String]): Unit = {
    //说明
    //1、对1 to 10 进行遍历
    //2、yield i 将每次循环得到i 放入到集合Vector中，并返回给 res
    //3、i 这里可以是一个代码块，这就意味着我们可以对i进行逻辑处理
    //4、下面的这个方式，就体现出scala一个重要的语法特点，就是将一个集合中各个数据
    //  进行处理，并返回给新的集合
    val res = for (i <- 1 to 10) yield i
    println(res)

    val res1 = for (i <- 1 to 10) yield {
      if (i % 2 == 0){
        i
      }else {
        "不是偶素"
      }
    }
    println(res1)
  }
}
