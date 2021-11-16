package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PlacementStrategyProperty {

  def apply(
    `type`: String,
    field: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder)
      .`type`(`type`)
      .field(field.orNull)
      .build()
}
