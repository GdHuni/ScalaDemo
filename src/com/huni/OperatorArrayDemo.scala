package com.huni

/**
 * @功能描述: 操作数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.OperatorArrayDemo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/4/27 0027 11:19
 */
object OperatorArrayDemo {
  def main(args: Array[String]): Unit = {
    //原数组
    val arrs = (1 to 10).toArray

    //使用推导式获取新的数组
    val newArrs = for (arr <- arrs) yield if(arr%2==0) arr else 0
    val result2 = for (elem <- arrs if elem %2 == 0) yield elem

    newArrs.foreach(println(_))
    result2.foreach(println(_))

    val ints = arrs.filter(_ % 2 == 0).map(_*2)

    //_ 是一个在占位符，遍历数组中的所有元素 其中下划线是占位符，两个下划线表示归约的规则是使用前后两个元素
    println("===========高阶函数")
    ints.foreach(println(_))

    println("===========reduce")
    println(ints.reduce(_*_))

    println("\n===========filter 过滤 map 重组")
    val nums2 = Array(1, 2, 3, 4, 3, 2, 1)
    val ints1 = nums2.filter(_ % 2 == 0).map(_ * 2)
    // 打印数组和 数组变字符串
    println(ints1.toBuffer)
    println(ints1.mkString(","))

    //将数组中的数据进行去重
    println(nums2.distinct.toBuffer)

    //count计数，注意：count后面必须有条件
    println(nums2.count(_ > 2))
    println(nums2.count(_ % 2 == 0))

    //take提取前N个元素
    println(nums2.take(3).toBuffer)
    //takeRight提取后N个元素
    println(nums2.takeRight(4).toBuffer)
    //takeWhile从左向右进行提取，提取出符合条件的元素，如果条件不成立就终止提取
    println(nums2.takeWhile(_ < 4).toBuffer)

    println("========================================")
    //删除前N个元素
    println(nums2.drop(3).toBuffer)
    //删除后N个元素
    println(nums2.dropRight(3).toBuffer)
    //从左向右删除符合条件的元素，如果条件不成立，就终止删除操作
    println(nums2.dropWhile(_ < 4).toBuffer)
  }

}
