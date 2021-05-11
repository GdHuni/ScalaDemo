package com.huni

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @功能描述: 数组Demo
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.ArraysDemo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/4/27 0027 10:33
 */
object ArraysDemo {

  def main(args: Array[String]): Unit = {
    /**
     *定长数组
     */
    //定义长度为10的整型数组，初始值为0
    val nums = new Array[Int](10)
    //定义长度为10的字符串数组，初始值为null
    val strs = new Array[String](10)
    //访问数组元素，索引从0开始，使用()而不是[]来访问元素
    println(strs(0))


    //省略了关键字new，那么Scala会进行自动类型推断
    val arrays: Array[Int] = Array(1, 2, 3, 4)
    val arrays2: Array[Nothing] = Array()
    println(arrays.length)

    //通过toArray快速定义数组，用于测试
    val numsList: Array[Int] = (1 to 10).toArray

    /**
     *变长数组
     */

      println("====================变长数组==========================")
    val myArrayBf = ArrayBuffer[Int]()
    // 在尾端添加元素
    myArrayBf += 2
    // 在尾端添加多个元素
    myArrayBf += (2,2,3)
    // 在尾端添加一个数组
    myArrayBf ++= Array(1,2,3)

    // 在指定位置添加一个元素/多个元素
    myArrayBf.insert(0,100,200)
    // 使用append追加一个或者多个元素
    myArrayBf.append(4)
    println("===========移除前")
    myArrayBf.foreach(println(_))
    // 移除最后2元素
    myArrayBf.trimEnd(2)
    println("===========移除后")
    myArrayBf.foreach(println(_))



    //toArray，变长数组转换为定长数组
    val numArray: Array[Int] = myArrayBf.toArray
    //toBuffer，定长数组转换为变长数组
    val arrayBuffer: mutable.Buffer[Int] = arrays.toBuffer

    println("==================数组遍历=======================")
    println("===============使用until进行数组遍历==============")
    for(i <- 0 until(arrays.length)){
      println(arrays(i))
    }
    println("===============使用to进行数组遍历==============")
    for (i <- 0 to arrays.length-1){
      println(arrays(i))
    }
    println("===============使用增强for循环的方式进行数组遍历==============")
    for(elem <- arrays) println(elem)
    println("===============使用foreach进行数组遍历==============")
    arrays.foreach(println(_))

  }

}
