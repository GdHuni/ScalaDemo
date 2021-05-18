package com.huni.classandobject

/**
 * apply方法通常定义在伴生对象中，目的是通过伴生类的构造函数功能，来实现伴生对象的构造函数功能；
 * 通常我们会在类的伴生对象中定义apply方法，当遇到类名(参数1,...参数n)时apply方法会被调用；
 * 在创建伴生对象或伴生类的对象时，通常不会使用new class/class() 的方式，而是直接使用 class()隐式的调用
 * 伴生对象的 apply 方法，这样会让对象创建的更加简洁；
 *
 * @param name
 * @param age
 */
class Student(name: String, age: Int) {
  private var gender: String = _

  def sayHi(): Unit = {
    println(s"大家好，我是$name,$gender 生")
  }
}

object Student {
  //apply方法需要定义在伴生对象中
  def apply(name: String, age: Int): Student = new Student(name, age)

  def main(args: Array[String]): Unit = {
    //直接使用class(参数...)这种方式隐式调用伴生对象中的apply方法来创建class Student对象
    val student = Student("jacky", 30)
    //伴生类与伴生对象可以相互访问私有成员
    student.gender = "男"

    student.sayHi()
  }
}
