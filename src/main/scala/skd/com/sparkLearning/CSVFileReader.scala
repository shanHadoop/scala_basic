package skd.com.sparkLearning

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DataTypes, StructField, StructType}

object CSVFileReader extends App {

  System.setProperty("hadoop.home.dir", "C:\\ING_CODEBASE\\winutil\\")
  val spark: SparkSession = SparkSession.builder().appName("cassandraTokenProcessor").master("local[3]").getOrCreate()
  val tp = StructType(Seq(StructField("app", DataTypes.StringType), StructField("contactpoints", DataTypes.StringType),
    StructField("devicetype", DataTypes.StringType), StructField("deviceid", DataTypes.StringType), StructField("token", DataTypes.StringType)))
  //val rawData = spark.read.option("header",true).csv("H:\\Shantanu\\Test\\casandrareport\\tst\\test.csv")
  val rawData = spark.read.option("header", false).schema(tp).csv("H:\\Shantanu\\Test\\casandrareport\\tokensbycontactpoint.csv")
  rawData.show(5)
  //rawData.repartition(10)
  rawData.printSchema()
  // println(rawData.count())   --- 4527020
  //rawData.groupBy("app","devicetype").count().orderBy("app","devicetype").show
  //  +---------------+----------+-------+
  //  |            app|devicetype|  count|
  //  +---------------+----------+-------+
  //  | insidebusiness|   Android|    735|
  //  | insidebusiness|       Ios|   7648|
  //  |insidebusiness2|   Android|   3445|
  //  |  mobileBanking|   Android|2092931|
  //  |  mobileBanking|       Ios|2343916|
  //  |           yolt|   Android|  47337|
  //  |           yolt|       Ios|  31008|
  //  +---------------+----------+-------+
  //
  //rawData.select("app","deviceid").groupBy("app").count().distinct().show
  //
  //  +---------------+-------+
  //  |            app|  count|
  //  +---------------+-------+
  //  |           yolt|  78345|
  //  |  mobileBanking|4436847|
  //  |insidebusiness2|   3445|
  //  | insidebusiness|   8383|
  //  +---------------+-------+

  //  rawData.select("contactpoints","token").groupBy("contactpoints").count().distinct().
  //    withColumnRenamed("count","tokensCountpercontact").groupBy("tokensCountpercontact").count().orderBy("tokensCountpercontact").foreach(println(_))


  println(rawData.select("deviceid").distinct().count())
  println(rawData.select("token").distinct().count())
  println(rawData.select("contactpoints").distinct().count())

}
