package com.huni.function

/**
 * @功能描述: 高阶函数 接收一个或多个函数作为输入 或 输出一个函数
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.HighFunctionDemo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/5/18 0018 14:21
 */
object HighFunctionDemo {
  def main(args: Array[String]): Unit = {
    //定义一个函数
    val func = n => "*" * n
    //接收函数作为输入
    (1 to 5).map(func(_)).foreach(println)
    //输出一个函数
    val urlBuilder= (ssl: Boolean, domainName: String) => {
      val schema = if (ssl) "https://" else "http://"
      //返回一个匿名函数
      (endPoint: String, query: String) => s"$schema$domainName/$endPoint?$query"
    }
    val domainName = "www.lagou.com"
    def getURL: (String, String) => String = urlBuilder(true, domainName)

    val str: String = getURL("show", "id=1")
    println(getURL)
    println(str)

    //=======================闭包

    /**
     * 闭包是在其上下文中引用了自由变量的函数；
     * 1、闭包是一个函数
     * 2、函数必须要有返回值
     * 3、返回值依赖声明在函数外部的一个或多个变量，用Java的话说，就是返回值和定义的全局变量有关
     */

    // 普通的函数
    val addMore1 = (x: Int) => x + 10
    // 外部变量，也称为自由变量
    var more = 10
    // 闭包
    val addMore2 = (x: Int) => x + more
    // 调用addMore1函数
    println(addMore1(5))
    // 每次addMore2函数被调用时，都会去捕获外部的自由变量
    println(addMore2(10))
    more = 100
    println(addMore2(10))


  }
}
