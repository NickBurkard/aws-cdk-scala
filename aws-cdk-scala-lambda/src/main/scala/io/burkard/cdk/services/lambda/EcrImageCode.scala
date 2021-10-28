package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcrImageCode {

  def apply(
    repository: software.amazon.awscdk.services.ecr.IRepository,
    tag: Option[String] = None,
    cmd: Option[List[String]] = None,
    entrypoint: Option[List[String]] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.lambda.EcrImageCode =
    software.amazon.awscdk.services.lambda.EcrImageCode.Builder
      .create(repository)
      .tag(tag.orNull)
      .cmd(cmd.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
