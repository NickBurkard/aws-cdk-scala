package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirelensConfig {

  def apply(
    `type`: software.amazon.awscdk.services.ecs.FirelensLogRouterType,
    options: Option[software.amazon.awscdk.services.ecs.FirelensOptions] = None
  ): software.amazon.awscdk.services.ecs.FirelensConfig =
    (new software.amazon.awscdk.services.ecs.FirelensConfig.Builder)
      .`type`(`type`)
      .options(options.orNull)
      .build()
}
