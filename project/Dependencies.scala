import sbt._

object Dependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.5.0"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.0.31"
  }
}
