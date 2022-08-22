import sbt._

object MetaDependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.38.1"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.1.81"
  }

  object Google {
    val guava: ModuleID = "com.google.guava" % "guava" % "31.1-jre"
  }
}
