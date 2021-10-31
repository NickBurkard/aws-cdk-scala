package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
