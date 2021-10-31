package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirelensConfig {

  def apply(
    options: Option[software.amazon.awscdk.services.ecs.FirelensOptions] = None,
    `type`: Option[software.amazon.awscdk.services.ecs.FirelensLogRouterType] = None
  ): software.amazon.awscdk.services.ecs.FirelensConfig =
    (new software.amazon.awscdk.services.ecs.FirelensConfig.Builder)
      .options(options.orNull)
      .`type`(`type`.orNull)
      .build()
}
