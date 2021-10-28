package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FirelensConfigurationProperty {

  def apply(
    options: Option[Map[String, String]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.Builder)
      .options(options.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
