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
  .aggregate(example, core)
  .disablePublishing()

lazy val example = project
  .dependsOn(core)
  .withCdk()
  .disablePublishing()

lazy val core = project
  .in(file("modules/core"))
  .withCodegen()
  .withCdk()
  .enablePublishing()
