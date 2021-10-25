package io.burkard.cdk.codegen
import java.nio.file.{Path, Paths}

final case class CdkPackageObject(
  serviceName: String,
  fullPackageName: String,
  packageObjectName: String,
  types: List[CdkType]
) {

  lazy val allButLastPackageName: String = fullPackageName
    .split('.')
    .dropRight(1)
    .mkString(".")
}

object CdkPackageObject {
  implicit val sourceGenerator: SourceGenerator[CdkPackageObject] =
    new SourceGenerator[CdkPackageObject] {
      override def path(source: CdkPackageObject): Path =
        Paths.get(
          s"aws-cdk-scala-${source.serviceName}",
          s"src/main/scala/${source.fullPackageName.replaceAll("\\.", "/")}/package.scala".split("/"): _*
        )

      override def gen(source: CdkPackageObject): String =
        s"""package ${source.allButLastPackageName}
           |
           |package object ${source.packageObjectName} {
           |  ${source.types.map(_.typeAlias).mkString("\n  ")}
           |}""".stripMargin
    }
}