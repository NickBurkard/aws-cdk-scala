import sbt._

object Dependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.0.0-rc.24"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.0.9"
  }

  object Google {
    val guava: ModuleID = "com.google.guava" % "guava" % "31.0.1-jre"
  }
}
