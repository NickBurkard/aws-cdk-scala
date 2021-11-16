package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCapacityProvider {

  def apply(
    internalResourceId: String,
    autoScalingGroupProvider: software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnCapacityProvider =
    software.amazon.awscdk.services.ecs.CfnCapacityProvider.Builder
      .create(stackCtx, internalResourceId)
      .autoScalingGroupProvider(autoScalingGroupProvider)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
