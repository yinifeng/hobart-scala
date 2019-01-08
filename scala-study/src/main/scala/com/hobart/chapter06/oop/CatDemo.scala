package com.hobart.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    //创建一只猫
    val cat = new Cat
    //给猫的属性值
    //说明
    //1.cat.name = "小白" 其实不是直接访问属性，而是 cat.name_$eq("小白")
    //2.cat.name 等价于 cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color ="白色"
    println("ok~")
    printf("小猫信息如下：%s %d %s",cat.name,cat.age,cat.color)
  }
}

//定义一个类 Cat
//一个class Cat 对应的字节码文件只有一个 cat.class，默认是public
class Cat{
  //定义声明3个属性
  //说明
  //1、当我们声明var name:String时，在底层对应 private name
  //2、同时会生成两个public方法name() =>getter public name_$eq() => setter
  var name:String = ""
  var age:Int = _ //_表示给age 一个默认值，如果Int 默认就是0
  var color:String = _ //_给color默认值，如果String，默认就是""
}
