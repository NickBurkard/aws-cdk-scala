lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(
    `aws-cdk-scala-core`,
    codegen,
  )

lazy val `aws-cdk-scala-core` = project
  .withCdk()
  .enablePublishing()

lazy val codegen = project
  .withCdk()
  .withGuava()
  .disablePublishing()
