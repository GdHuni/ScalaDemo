package com.huni.extendsdemo

class Programmer(name: String, age: Int) {
  def coding(): Unit = {
    println("我在写代码。。。")
  }
}

class ScalaProgrammer(name: String, age: Int, workNo: String) extends Programmer(name, age) {
  override def coding(): Unit = {
    //调用父类的方法
    super.coding()
    //增加自己实现
    println("我在写Scala代码。。。")
  }
}

object OverrideDemo {
  def main(args: Array[String]): Unit = {
    val scalaProgrammer = new ScalaProgrammer("jacky", 30, "10010")
    scalaProgrammer.coding()
  }
}
