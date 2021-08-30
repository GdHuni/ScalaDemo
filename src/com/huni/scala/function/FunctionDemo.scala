package com.huni.function

import scala.collection.immutable

/**
 * @功能描述: 函数demo
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.FunctionDemo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/5/18 0018 11:08
 */
object FunctionDemo {
  /**
   * 方法不能作为单独的表达式而存在，而函数可以；
   * 函数必须要有参数列表，而方法可以没有参数列表；
   * 方法名是方法调用，而函数名只是代表函数对象本身；
   * 在需要函数的地方，如果传递一个方法，会自动把方法转换为函数
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    m(1)
    /***
     * 匿名函数：又被称为 Lambda 表达式。 Lambda表达式的形式如下：
     * (参数名1: 类型1, 参数名2: 类型2, ... ...) => 函数体
     */
    val list: immutable.Seq[Int] = (1 to 10).toList
    //下面三个等价
    val ints = list.map((x: Int) => x + 1)
    val ints1 = list.map(x => x + 1)
    val ints2 = list.map(_ + 1)

    val ints3 = list.map(_ * 2 + 1)
    println(ints)
    println(ints3)

    list.reduce((x,y) => x+y)
  }

  /**
   * 方法
 *
   * @param a
   * @return
   */
  def m (a:Int) : Int ={
    m1
    a
  }
  def m1 = {
    println("无参数列表")
  }

  /**
   * 函数  和定义变量一样： val 变量名: 类型 = 值 ； val 函数名: 函数类型 = 函数字面量
   * val 函数名: (参数类型1，参数类型2) => (返回类型) = 函数字面量
   * val 函数名 = 函数字面量 函数字面量:(参数1：类型1，参数2：类型2) => 函数体
   * val 函数名 = (参数1：类型1，参数2：类型2) => 函数体
   */
  /**
   * 常规定义
   */
  val f: Int => Int = x =>x + 1
  /**
   * 省略函数类型
   */
  val f1 = (x:Int) => x+1


}
