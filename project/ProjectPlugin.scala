import sbt._
import sbt.Keys._

object ProjectPlugin extends AutoPlugin {
  val autoImport: ThingsToAutoImport.type = ThingsToAutoImport

  override val trigger: PluginTrigger = AllRequirements

  private[this] val `scala 2.12` = "2.12.15"

  private[this] val `scala 2.13` = "2.13.7"

  private[this] val `scala 3` = "3.1.0"

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

      def withGuava(): Project =
        project.settings(libraryDependencies += Dependencies.Google.guava)

      def withScalatest(): Project =
        project.settings(libraryDependencies += Dependencies.scalatest)

      def disablePublishing(): Project =
        project.settings(
          publish / skip := true,
          publishArtifact := false
        )

      def enablePublishing(): Project =
        project.settings(moduleName := s"aws-cdk-scala-${name.value}")
    }
  }
}
