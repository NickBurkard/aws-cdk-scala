package io.burkard.cdk.codegen

import scala.util.Try

import sbt._

import com.google.common.base.CaseFormat

// Enum provided by the CDK.
final case class CdkEnum private (
  instanceCanonicalName: String,
  instanceSimpleName: String,
  valueNames: List[String],
  underlying: Class[_]
) {
  lazy val packageName: String = renameCdkPackage(instanceCanonicalName, dropLast = 1)

  // `case object ValueName extends EnumName(underlyingValue)`.
  lazy val valuesCases: List[String] =
    valueNames.map { valueName =>
      s"""case object ${CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, valueName)}
         |    extends $instanceSimpleName($instanceCanonicalName.$valueName)""".stripMargin
    }

  lazy val noWarnClass: String =
    if (underlying.getAnnotations.toList.exists(_.annotationType().getSimpleName == "Deprecated")) {
      "\n@scala.annotation.nowarn(\"cat=deprecation\")"
    } else {
      ""
    }

  lazy val noWarnObject: String =
    if (valueNames.exists(isDeprecated)) {
      "\n@scala.annotation.nowarn(\"cat=deprecation\")"
    } else {
      ""
    }

  private[this] def isDeprecated(valueName: String): Boolean =
    Try(underlying.getField(valueName))
      .map(_.getAnnotations.toList.exists(_.annotationType().getSimpleName == "Deprecated"))
      .getOrElse(false)
}

object CdkEnum {
  implicit val sourceGenerator: SourceGenerator[CdkEnum] =
    new SourceGenerator[CdkEnum] {
      override def baseFile(root: File, source: CdkEnum): File =
        root /~ source.packageName.replace('.', '/') / s"${source.instanceSimpleName}.scala"

      override def content(source: CdkEnum): String =
        s"""package ${source.packageName}
           |${source.noWarnClass}
           |sealed abstract class ${source.instanceSimpleName}(val underlying: ${source.instanceCanonicalName})
           |  extends Product
           |    with Serializable
           |${source.noWarnObject}
           |object ${source.instanceSimpleName} {
           |  implicit def toAws(value: ${source.instanceSimpleName}): ${source.instanceCanonicalName} =
           |    Option(value).map(_.underlying).orNull
           |
           |  ${source.valuesCases.mkString("\n\n  ")}
           |}
           |""".stripMargin
    }

  def build(underlying: Class[_]): Option[CdkEnum] =
    if (underlying.isEnum) {
      Try(
        underlying
          .getMethod("values")
          .invoke(null)
          .asInstanceOf[Array[_]]
          .toList
          .map(_.toString)
      )
        .toOption
        .map(
          CdkEnum(
            underlying.getCanonicalName,
            underlying.getSimpleName,
            _,
            underlying
          )
        )
    } else {
      None
    }
}
