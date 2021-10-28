package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ImageConfigProperty {

  def apply(
    entryPoint: Option[List[String]] = None,
    command: Option[List[String]] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty.Builder)
      .entryPoint(entryPoint.map(_.asJava).orNull)
      .command(command.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
