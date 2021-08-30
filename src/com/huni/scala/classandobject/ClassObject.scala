package com.huni.classandobject

//伴生类和伴生对象，它们的名字是一样的，并且必须存在于同一文件中
class ClassObject {
  private var name = "lagou"

  def printInfo: Unit = {
    //在伴生类中可以访问伴生对象的私有成员
    println(ClassObject.num)
    println("Hello Object!")
  }
}

object ClassObject {
  private val num = 10

  def main(args: Array[String]): Unit = {
    val classObject = new ClassObject
    //在伴生对象中可以访问伴生类的私有成员
    println(classObject.name)
    classObject.printInfo
  }

}
