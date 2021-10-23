import com.google.common.reflect.ClassPath

import scala.jdk.CollectionConverters._

object Codegen {
  def main(args: Array[String]): Unit =
    codegen()

  private[this] val serviceRegex = raw"^software\.amazon\.awscdk\.services\.([a-zA-Z0-9]+)(\..+)*".r

  private[this] def codegen(): Unit =
    ClassPath
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
      .map { case (name, classInfo) =>
        name -> classInfo.map(_._2.load()).flatMap(CdkBuilder.build(name))
      }
      .toList
      .sortBy(_._1)
      .foreach { case (name, builders) =>
        println(name)
        builders.foreach(_.writeToSource())
      }
}
