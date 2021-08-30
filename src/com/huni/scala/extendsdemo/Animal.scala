package com.huni.extendsdemo

/**
 * @功能描述:
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.extendsdemo.Animal
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/5/13 0013 11:27
 */
abstract class Animal {
 def spaker
 def spakerS:String
}

class Dog extends Animal {
  override def spaker: Unit = {
    println("helle you are dog")
  }

  override def spakerS: String = {
    println(s"ss")
    "s"
  }
}