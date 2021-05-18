package com.huni.function

/**
 * 部分函数
 */
object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    //[Any,Int]，偏函数接收的数据类型是Any，返回的数据类型是Int
    val partialFunction = new PartialFunction[Any, Int] {
      //如果返回true，那么就调用apply方法；如果返回的是false，就过滤掉
      override def isDefinedAt(x: Any): Boolean = {
        println(x.toString)
        x.isInstanceOf[Int]
      }

      //对传入的整数值+1，并将其返回
      override def apply(v1: Any): Int = {
        println(v1.toString)
        v1.asInstanceOf[Int] + 1
      }
    }
    val list=List(10,"hadoop",20,"spark",30,"flink")
    list.collect(partialFunction).foreach(println(_))

  }
}
