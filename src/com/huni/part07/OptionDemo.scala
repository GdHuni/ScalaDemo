package com.huni.part07

object OptionDemo {
  val grades = Map("jacky" -> 90, "tom" -> 80, "jarry" -> 60)

  def getGrade(name: String): Unit = {
    val grade: Option[Int] = grades.get(name)
    grade match {
      case Some(grade) => println("成绩是：" + grade)
      case None => println("没有此人成绩！")
    }
  }

  def main(args: Array[String]): Unit = {
    getGrade("jacky")
    getGrade("lisi")
  }
}
