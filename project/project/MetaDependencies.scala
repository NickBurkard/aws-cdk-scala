import sbt._

object MetaDependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.12.0"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.0.71"
  }

  object Google {
    val guava: ModuleID = "com.google.guava" % "guava" % "31.0.1-jre"
  }
}
