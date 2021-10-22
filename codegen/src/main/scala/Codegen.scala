import com.google.common.reflect.ClassPath

import java.lang.reflect.{Method => JMethod}

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
        name -> classInfo.map(_._2.load()).filter(_.shouldRewrite)
      }
      .foreach { case (name, classes) =>
        println(s"$name:")
        classes.foreach(c => println(s"${c.getTypeName} - ${c.fieldMethods.map(_.getName)}"))
        println("---")
      }

  final implicit class ClassOps(private val c: Class[_]) extends AnyVal {
    def shouldRewrite: Boolean =
      !(c.isEnum || c.isInterface) && c.getSimpleName == "Builder"

    def fieldMethods: List[JMethod] =
      c.getMethods
        .filter(_.isFieldMethod)
        .toList
  }

  private[this] val nonFieldBuilderMethods: Set[String] =
    Set("create", "build", "equals", "getClass", "hashCode", "notify", "notifyAll", "wait", "toString")

  final implicit class MethodOps(private val m: JMethod) extends AnyVal {
    def isFieldMethod: Boolean =
      !nonFieldBuilderMethods.contains(m.getName)
  }
}
