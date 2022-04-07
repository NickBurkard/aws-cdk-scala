import sbt._

object MetaDependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.19.0"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.0.108"
  }

  object Google {
    val guava: ModuleID = "com.google.guava" % "guava" % "31.1-jre"
  }
}
