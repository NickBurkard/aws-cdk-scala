package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerDefinitionConfig {

  def apply(
    parameters: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig.Builder)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
