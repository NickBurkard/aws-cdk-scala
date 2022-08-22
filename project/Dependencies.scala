import sbt._

object Dependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.38.1"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.1.81"
  }
}
