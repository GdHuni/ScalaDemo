package com.huni.part07

import scala.util.Random

object MatchDemo {
  def main(args: Array[String]): Unit = {
    //对字符进行模式匹配
    val character = '*'
    character match {
      case '+' => println("加号")
      case '-' => println("减号")
      case '*' => println("乘号")
      case '/' => println("除号")
      case _ => println("不是运算符！")
    }

    //对字符串进行模式匹配
    val content = Array("hadoop", "spark", "flink")
    val project = content(Random.nextInt(content.length))

    project match {
      case "hadoop" => println("大数据计算框架")
      case "spark" => println("大数据内存框架")
      case "flink" => println("大数据实时框架")
      case _ => println("不送，慢走~~")
    }

    //守卫式匹配，添加if判断
    val char = '/'
    val num = char match {
      case '+' => 1
      case '-' => 2
      case _ if char.equals('*') => 3
      case _ => 4
    }
    println(num)

    typeMatch(Array(1,2))
  }

  //匹配类型，语法：case 变量:类型 => 代码
  def typeMatch(x: Any) = {
    x match {
      case x: String => println("这是一个字符串类型")
      case x: Int => println("是一个整型")
      case x: Boolean if (x == false) => println("是一个false的布尔类型")
      case x: Array[Int] => println("是一个整型数组")
      case _ => println("不知是啥类型！")
    }
  }
}
