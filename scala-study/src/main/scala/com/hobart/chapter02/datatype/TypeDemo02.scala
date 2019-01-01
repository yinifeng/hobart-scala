package com.hobart.chapter02.datatype


/**
  * 1、在scala中有一个根类型Any，他是所有类的父类
  * 2、scala中一切皆为对象，分为两大类AnyVal(值类型) (一般的数据类型 Byte Int)，
  *   AnyRef(引用类型)，他们都是Any的子类
  * 3、Null类型是scala的特别类型，它只有一个值null，他是bottom class，
  *   是所有AnyRef类型的子类
  * 4、Nothing类型也是bottom class，它是所有类的子类，
  *   在开发中通常可以将Nothing类型的值返回给任意变量或函数，这里抛出异常使用很多
  *   
  * 5、在scala中仍然遵守，低精度的值，向高精度的值自动转换(implicit conversion 隐式转换)
  */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayHello)
  }

  //比如开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
  //即当我们Nothing做返回值，就是明确说明该方法没有正常返回值
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }
}
