import sbt._
import sbt.Keys._

object ProjectPlugin extends AutoPlugin {
  val autoImport: ThingsToAutoImport.type = ThingsToAutoImport

  override val trigger: PluginTrigger = AllRequirements

  override val buildSettings: Seq[Def.Setting[_]] = Seq(
    organization := "io.burkard",
    version := "0.1.0",
    scalaVersion := "2.13.6"
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

      // TODO Implement.
      def disablePublishing(): Project =
        project

      // TODO Implement.
      def enablePublishing(): Project =
        project
    }
  }
}
