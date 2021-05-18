package com.huni.classandobject

object Object {
  println("这是单例对象的代码！")

  def printInfo: Unit = {
    println("Hello Scala Object!")
  }
}

object ObjectDemo {
  def main(args: Array[String]): Unit = {
//    val object1=Object
//    val object2=Object

    Object.printInfo
    Object.printInfo
  }
}
