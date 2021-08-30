package com.huni.extendsdemo

class Person(name: String, age: Int){
  println("这是父类Person！")
}

class Student(name: String, age: Int, var stuNo: String) extends Person(name, age){
  println("这是子类Student！")
}

object ExtendsDemo {
  def main(args: Array[String]): Unit = {
    val student = new Student("jacky", 30, "1001")
//    student.stuNo="1002"
//    println(student.stuNo)
  }
}
