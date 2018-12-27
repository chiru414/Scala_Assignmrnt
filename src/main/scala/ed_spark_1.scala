// Databricks notebook source
val a = spark.sparkContext.parallelize(List("dog","salmon","elephant","rat","salmon"))
val b = a.map(_.length)
b.collect

// COMMAND ----------

a.collect.foreach(println)

// COMMAND ----------

val zipped = a.zip(b)
zipped.collect.foreach(println)

// COMMAND ----------

val a = spark.sparkContext.parallelize( 1 to 9)

// COMMAND ----------

val b = a.groupBy(x => {if(x % 2 == 0) "even" else "odd"}).collect //notice this creates compactbuffer

// COMMAND ----------

val a = spark.sparkContext.parallelize(List("dog","salmon","elephant","rat","salmon"))
val b = a.keyBy(_.length)
b.collect.foreach(println)

// COMMAND ----------

val c = spark.sparkContext.parallelize(List("dog","salmon","donkey","rat","monkey"))
val d = c.keyBy(_.length)

// COMMAND ----------

d.collect.foreach(println)

// COMMAND ----------

val joined = b.join(d)
joined.collect.foreach(println)

// COMMAND ----------

val words = Array("one","two","two","three","three","three")
val wordsPairRDD = spark.sparkContext.parallelize(words).map(word => (word,1))
wordsPairRDD.collect.foreach(println)

// COMMAND ----------

val wcount_reduce = wordsPairRDD.reduceByKey(_ + _).collect //optimized version of groupbykey as it uses combiner reducing network IO
// first _ is accumulator and second _ is current value. In the above code, the first _ will start with value 0 and second _ will be 1, 0 + 1 = 1 will be stored in accumulator

// COMMAND ----------

val wcount_grp = wordsPairRDD.groupByKey().collect

// COMMAND ----------

val wcount_grp_sum = wordsPairRDD.groupByKey().map(t => (t._1,t._2.sum)).collect

// COMMAND ----------

//map will be applied on each element
val x = spark.sparkContext.parallelize(List("This is spark","Hello stranger"))
val y = x.map(x => x.split(" ")) // returns a collection object for eahc individual element
y.collect

// COMMAND ----------

val y = x.flatMap(x => x.split(" ")) //returns a single collection object for all elements
y.collect

// COMMAND ----------

val myrdd = spark.sparkContext.parallelize(1 to 100,5)
//here 5 is the minimum number of partitions into which myrdd shud b divided

// COMMAND ----------

myrdd.toDebugString //shows number of partitions

// COMMAND ----------

val myrdd = spark.sparkContext.parallelize(1 to 100)
myrdd.toDebugString // in yarn by default rdd will be created as 2 partitions

// COMMAND ----------

spark.sparkContext.getConf.toDebugString //view complete details of spark context , spark.master=local[8] says spark mode is local with default 8 partitions

// COMMAND ----------

//The coalesce method reduces the number of partitions in a DataFrame
myrdd.coalesce(2)

// COMMAND ----------

res12.toDebugString

// COMMAND ----------

//actions
myrdd.first //returns first element
myrdd.take(5) // returns 1st 5
myrdd.reduce(_ + _) // sum of all elemets

// COMMAND ----------

myrdd.saveAsTextFile("tmpout")

// COMMAND ----------

// RDD persistence
val data = spark.sparkContext.parallelize( 1 to 100)
data.cache()

// COMMAND ----------

data.getStorageLevel // by default the cache method stores the data in memory with deserialized format and 1 replica
//Storage levels supported by RDD
/*
MEMORY_ONLY
MEMORY_AND_DISK
MEMORY_ONLY_SER
MEMORY_AND_DISK_SER
DISK_ONLY
MEMORY_ONLY_n (n replicas in memory)
*/

// COMMAND ----------

import org.apache.spark.storage.StorageLevel

// COMMAND ----------

data.persist(StorageLevel.MEMORY_AND_DISK) // cannot change storage level once it is already assigned e.g. cache

// COMMAND ----------

data.unpersist()
data.persist(StorageLevel.MEMORY_AND_DISK)

// COMMAND ----------

data.getStorageLevel

// COMMAND ----------

val a = sc.parallelize(Array(("A",0),("A",1),("B",0),("B",1),("B",2),("C",0)))

// COMMAND ----------

a.foldByKey(1)(_ + _).collect.foreach(println) // Adds 1 to the accumulator each time

// COMMAND ----------

a.foldByKey(3)(_ + _).collect.foreach(println)

// COMMAND ----------

a.lookup("B") // looks the values of "B"

// COMMAND ----------

val input = sc.parallelize(Seq(("maths",50),("maths",60),("english",65)))

// COMMAND ----------

val a = sc.parallelize(List(1,2,1,3))
val b = a.zip(a)
b.collectAsMap

// COMMAND ----------

a.sum
a.count
a.mean
a.stats

// COMMAND ----------


