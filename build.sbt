lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(`aws-cdk-scala`)

lazy val `aws-cdk-scala` = project
  .withCdk()
