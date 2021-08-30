/**
 * @功能描述:
 * @项目版本: 1.0.0
 * @项目名称: 大数据数据接入平台
 * @相对路径: com.huni.FileDemo
 * @author: <a href="mailto:zhouhu@leyoujia.com">周虎</a>
 * @创建日期: 2021/4/26 0026 15:33
 */
object FileDemo {
  def main(args: Array[String]): Unit = {
    readTextFile
    readUrl
    writerTextFile

  }

  /**
   * Scala没有内建的对写入文件的支持。要写入文本文件，可使用 java.io.PrintWriter
   */
  def writerTextFile(): Unit={
    val writer = new PrintWriter("src\\t.text")
    for(i <- 1 to 100){
      writer.println(i)
      writer.flush()
    }
    writer.close()

  }
  /**
   * 讀取網絡資源
   */
  def readUrl(): Unit={
    val source = Source.fromURL("http://www.baidu.com")

    val strings = source.getLines()
    for (s <- strings){
      println(s)
    }
    println("=========================")
    val string = source.mkString
    println(string)

  }
  /**
   * 讀取文件
   */
  def readTextFile(): Unit={
    /**文件读取*/
    val file = Source.fromFile("src\\t.text")
    val lines: Iterator[String] = file.getLines()
    for (line <- lines) {
      println(line)
    }

    val source = Source.fromFile("F:\\1哈.txt")
    val strings = source.getLines()
    for(s <- strings){
      println("messgae: "+s)
    }

    //关闭文件
    file.close()
    source.close()
  }
}
