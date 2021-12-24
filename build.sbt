inThisBuild(
  List(
    organization := "io.burkard",
    homepage := Some(url("https://github.com/NickBurkard/aws-cdk-scala")),
    licenses := List("Apache 2" -> url("https://github.com/NickBurkard/aws-cdk-scala/blob/master/LICENSE.txt")),
    developers := List(
      Developer(
        "NickBurkard",
        "Nick Burkard",
        "burkard.foss@gmail.com",
        url("https://burkard.io")
      )
    ),
    sonatypeCredentialHost := Sonatype.sonatype01
  )
)

lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(example, `aws-cdk-scala`)
  .disablePublishing()

lazy val example = project
  .dependsOn(`aws-cdk-scala`)
  .withCdk()
  .disablePublishing()

lazy val `aws-cdk-scala` = project
  .in(file("modules/aws-cdk-scala"))
  .withCodegen()
  .withCdk()
  .enablePublishing()
