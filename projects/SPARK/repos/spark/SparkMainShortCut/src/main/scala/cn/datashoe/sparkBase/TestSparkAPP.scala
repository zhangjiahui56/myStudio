package cn.datashoe.sparkBase

object TestSparkAPP extends SparkAPP {
  override def run(): Unit = {
//    println(sc.makeRDD(Seq.range(0, 100)).reduce(_ + _))
    sqlc.createDataFrame(Seq.range(0, 100).map(Tuple1.apply)).show()

  }
}
