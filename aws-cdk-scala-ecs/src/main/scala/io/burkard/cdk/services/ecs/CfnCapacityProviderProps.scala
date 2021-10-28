package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
