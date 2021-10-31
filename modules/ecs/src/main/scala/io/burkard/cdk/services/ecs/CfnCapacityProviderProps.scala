package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCapacityProviderProps {

  def apply(
    name: Option[String] = None,
    autoScalingGroupProvider: Option[software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ecs.CfnCapacityProviderProps =
    (new software.amazon.awscdk.services.ecs.CfnCapacityProviderProps.Builder)
      .name(name.orNull)
      .autoScalingGroupProvider(autoScalingGroupProvider.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
