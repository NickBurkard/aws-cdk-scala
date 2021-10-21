import com.google.common.reflect.ClassPath

import scala.jdk.CollectionConverters._

object Codegen {
  private[this] val serviceRegex = raw"^software\.amazon\.awscdk\.services\.([a-zA-Z0-9]+)(\..+)*".r

  def main(args: Array[String]): Unit = {
    val classInfoPerService = ClassPath
      .from(ClassLoader.getSystemClassLoader)
      .getAllClasses
      .asScala
      .toList
      .collect { classInfo =>
        classInfo.getPackageName match {
          case serviceRegex(name, _) =>
            name -> classInfo
        }
      }
      .groupBy(_._1)
      .view
      .mapValues(_.map(_._2))

    classInfoPerService.foreach { case (k, v) => println(s"$k: $v") }
  }
}
