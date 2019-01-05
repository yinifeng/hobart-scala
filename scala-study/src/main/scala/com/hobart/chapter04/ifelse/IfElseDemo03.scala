package com.hobart.chapter04.ifelse

/**
  * 多分支
  */
object IfElseDemo03 {
  def main(args: Array[String]): Unit = {
    var score= 80
    if (score == 100){
      println("成绩为100分时,奖励BWM")
    }else if (score > 80 && score <= 99){
      println("成绩为(80,99]时,奖励一台iPhone7plus")
    }else if(score >= 60 && score <= 80){
      println("奖励一个ipad")
    }else{
      println("没有任何奖励")
    }
  }
}
