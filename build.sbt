lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(
    `aws-cdk-scala`,
    codegen
  )

lazy val `aws-cdk-scala` = project
  .withCdk()

lazy val codegen = project
  .withCdk()
  .withGuava()
