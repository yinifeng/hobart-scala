package com.hobart.chapter06.constructor

import scala.beans.BeanProperty

object ConstructorDemo04 {
  def main(args: Array[String]): Unit = {
    val car = new Car();
    car.setColor("red")
    car.getColor()
    car.color
  }
}

//类似于javaBean
//@BeanProperty 该注解会生成getter 和 setter 方法
class Car{
  @BeanProperty var color: String = _
}
