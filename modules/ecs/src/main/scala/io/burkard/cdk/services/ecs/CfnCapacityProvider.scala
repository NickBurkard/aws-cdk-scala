package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCapacityProvider {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    autoScalingGroupProvider: Option[software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnCapacityProvider =
    software.amazon.awscdk.services.ecs.CfnCapacityProvider.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .autoScalingGroupProvider(autoScalingGroupProvider.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
