import sbt._
import sbt.Keys._

import _root_.io.burkard.cdk.codegen.CdkCodegen

object ProjectPlugin extends AutoPlugin {
  val autoImport: ThingsToAutoImport.type = ThingsToAutoImport

  override val trigger: PluginTrigger = AllRequirements

  private[this] val `scala 2.12` = "2.12.16"

  private[this] val `scala 2.13` = "2.13.8"

  private[this] val `scala 3` = "3.2.0"

  override val buildSettings: Seq[Def.Setting[_]] = Seq(
    scalaVersion := `scala 2.13`,
    crossScalaVersions := Seq(`scala 2.12`, `scala 2.13`, `scala 3`)
  )

  object ThingsToAutoImport {
    final implicit class ProjectOps(private val project: Project) extends AnyVal {
      def withCdk(): Project =
        project.settings(
          libraryDependencies ++= Seq(
            Dependencies.Aws.cdk,
            Dependencies.Aws.constructs
          )
        )

      def withCodegen(): Project =
        project.settings(CdkCodegen.settings(Compile))

      def disablePublishing(): Project =
        project.settings(
          publish / skip := true,
          publishArtifact := false
        )
    }
  }
}
