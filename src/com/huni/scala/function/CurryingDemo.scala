package com.huni.function

/**
 * @功能描述: 柯里化 函数编程中，接收多个参数的函数都可以转化为接收单个参数的函数，这个转化过程就叫柯里化(Currying)。
 *        于柯里化函数拥有多组参数列表，每组参数用小括号括起来。
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.CurryingDemo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/5/18 0018 14:40
 */
object CurryingDemo {
  def main(args: Array[String]): Unit = {
    // 使用普通的方式
    def add1(x: Int, y: Int) = x + y

    // 使用闭包的方式，将其中一个函数作为返回值
    def add2(x: Int) = (y:Int) => x + y

    // 使用柯里化的方式
    def add(x: Int)(y: Int) = x + y

    add1(1,2)
    val i: Int = add2(2)(1)
    //add(1)(2)实际上第一次调用使用参数x，返回一个函数类型的值，第二次使用参数y调用这个函数类型的值。
    // 实际上最先演变成这样的函数：def add(x: Int) = (y:Int) => x + y
    // 在这个函数中，接收一个x为参数，返回一个匿名函数，这个匿名函数的定义是：接收一个Int型参数y，函数体是x+y。
    val i1 = add(1)(2)
  }
}
