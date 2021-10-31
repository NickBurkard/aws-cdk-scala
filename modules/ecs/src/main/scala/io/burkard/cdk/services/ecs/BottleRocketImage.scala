package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BottleRocketImage {

  def apply(
    cachedInContext: Option[Boolean] = None,
    variant: Option[software.amazon.awscdk.services.ecs.BottlerocketEcsVariant] = None,
    architecture: Option[software.amazon.awscdk.services.ec2.InstanceArchitecture] = None
  ): software.amazon.awscdk.services.ecs.BottleRocketImage =
    software.amazon.awscdk.services.ecs.BottleRocketImage.Builder
      .create()
      .cachedInContext(cachedInContext.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .variant(variant.orNull)
      .architecture(architecture.orNull)
      .build()
}
