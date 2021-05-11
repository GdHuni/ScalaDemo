package com.huni



/**
 * @功能描述:
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.Demo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/3/13 0013 10:12
 */
object Demo {
  def main(args: Array[String]): Unit = {
/*    print("aa");
    println("ss");
    var y = 0
    val x = y = 1
    print("x:"+x)*/
/*
    val subject = "Spark"
    val str1 = s"Hello, $subject"
    println(str1)

    println("=========================")

    val arr = (1 to 10).toArray
    val str2 = s"arr.length = ${arr.length}"
    println(str2)
    println(s"The answer is ${6*6}")

    println("=========================")

    val year=2020
    val month=6
    val day=9
    println(s"$year-$month-$day")
    println(f"$year-$month%02d-$day%02d")

    println("a\nb\tc")
    println(raw"a\nb\tc")
    println("""a\nb\tc""")
*/

    println("=========================")

    /**
     * 块表达式
     */
    val s = {
      val a =3;
      val b =4;
      a+b
    }
    val year=2020
    val month=6
    val day=9
    /**
     * 插值器
     */
    println("s"+s);
    println(s"s+$s");
    println(f"$year-$month%02d-$day%02d")
    println(raw"$s \n");

    /**
     * if else
     */
    val a = if(1>2){
      1
    }  else{
      ()
    }
    println("a: "+a)

    /**
     * for 循环
     */

      for (i <- 1 until 4; j <- 2 until 4){
        println(s"i * j = $i * $j = ${i * j}")
        println(i * j )
      }

      for (i <- 1 to 10; j <- 1 to 10 if i==j){
        println(s"i * j = $i * $j = ${i * j}")
      }
    //守卫语句。增加 if 条件语句
    for(i <- 1 to 10 if i<3){
      println(s"守卫语句: $i")
    }
    // 使用 yield 接收返回的结果，这种形式被称为for推导式
    val result = for(i <- 1 to 10 ) yield i
    print("result: "+ result )
    for (i <- 0 to result.length-1){
      print( i+"\t")
    }

    /** break 关键字*/
    import util.control.Breaks._
    for(i<-0 until 10){
      breakable{
        if(i==3||i==6) {
          break()
        }
        println(i)
      }
    }

    //等价与myFunction(1,2)
    val as =  (a:Int,b:Int) =>  a+b
    println("=="+as(1,2))

    println("函数： "+myFunction(1,2))
    println("函数： "+myFunction2(1,2))

    val doubleSalary = (x: Int) => x * 2
    println("=="+doubleSalary(1))

  }

  /**函数*/
  def myFunction(a:Int,b:Int):Int = {
    a+b
  }



  /**函数*/
  def myFunction2(a:Int,b:Int):Unit = {
    a+b
  }


}
