package com.huni.classandobject

class Dog {
  private var _leg = 0

  //自定义getter方法
  def leg: Int = _leg

  //自定义的setter方法
  def leg_=(newLeg: Int): Unit = {
    _leg = newLeg
  }
}

object GetterAndSetterDemo {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    //调用自定义的setter方法
    dog.leg_=(4)
    //调用自定义的getter方法
    println(dog.leg)
  }
}
