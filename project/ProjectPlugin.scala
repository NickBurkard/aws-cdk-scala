import sbt._
import sbt.Keys._

object ProjectPlugin extends AutoPlugin {
  val autoImport: ThingsToAutoImport.type = ThingsToAutoImport

  override val trigger: PluginTrigger = AllRequirements

  private[this] val `scala 2.12` = "2.12.16"

  private[this] val `scala 2.13` = "2.13.8"

  private[this] val `scala 3` = "3.1.3"

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

      def withCodegen(): Project = {
        val cdkSourceGenerator = taskKey[Seq[File]]("generate AWS CDK source files")
        project.settings(
          Compile / cdkSourceGenerator := ServiceCodegen((Compile / sourceManaged).value),
          Compile / sourceGenerators += (Compile / cdkSourceGenerator),
          Compile / packageSrc / mappings ++= {
            val base = (Compile / sourceManaged).value
            (Compile / managedSources).value.map(file => file -> file.relativeTo(base).get.getPath)
          }
        )
      }

      def disablePublishing(): Project =
        project.settings(
          publish / skip := true,
          publishArtifact := false
        )
    }
  }
}
