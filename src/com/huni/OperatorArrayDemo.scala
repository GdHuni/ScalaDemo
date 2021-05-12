package com.huni
import scala.collection.mutable

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



    println("========================================")
    //将数组分为两部分，前N个为一部分，剩下的为另一部分 splitAt 底层就是take(n) drop(n)
    val tuple1: (Array[Int], Array[Int]) = nums2.splitAt(4)

    val tuple: (Array[Int], Array[Int]) = nums2.splitAt(3)
    println(tuple._1.toBuffer + "  " + tuple._2.toBuffer)
    //对数组进行切片操作，取出从索引2到索引4的元素，不包括索引为5的元素
    println(nums2.slice(2, 5).toBuffer)


    println("========================================")
    val array1 = Array("A", "B", "C")
    val array2 = Array(1, 2, 3, 4)
    //拉链操作，当两个数组的长度不一样时，截取相同的长度
    val z1: Array[(String, Int)] = array1.zip(array2)
    println(z1.toBuffer)
    //拉链操作，当两个数组长度不一样时，array1用*填充，array2用-1填充
    val z2 = array1.zipAll(array2, "*", -1)
    //拉链操作，当两个数组长度不一样时，array2用*填充，array1用-1填充
    val z3 = array2.zipAll(array1, "*", -1)
    //用数组索引进行填充
    val z4 = array1.zipWithIndex
    println(z2.toBuffer)
    println(z3.toBuffer)
    println(z4.toBuffer)

    println("========================================")
    //通过unzip进行拆分数组的操作
    // 通过unzip把z4拆分成两个数组
    val (l1, l2) = z4.unzip
    println(l1.toBuffer)
    println(l2.toBuffer)

    val (l3, l4, l5) = Array((1, "one", '1'), (2, "two", '2'), (3, "three", '3')).unzip3
    println(l3.toBuffer)
    println(l4.toBuffer)
    println(l5.toBuffer)

    //数组的操作符：:+  +:  ++
    // :+用于在数组的尾部追加元素； +：用于在数组的头部追加元素
    // ++用于连接两个集合（比如：数组、列表等）

    val n1: Array[Int] = (1 to 4 ).toArray

    val n2: mutable.Buffer[Int] = (1 to 4 ).toBuffer
    n2.append(3)

    val nums3 = n1 :+ 10
    val nums4 = 10 +: n2
    println("========================================")
    println(nums3.toBuffer)
    println(nums4)

    println("===========数组排序==============")
    val sortNums=Array(1,3,5,2,7,8,6,9)
    //升序
    println(sortNums.sorted.toBuffer)
    println(sortNums.sortWith(_<_).toBuffer)
    //降序
    println(sortNums.sorted.reverse.toBuffer)
    println(sortNums.sorted.toBuffer.reverse)
    println(sortNums.sortWith(_>_).toBuffer)

  }

}
