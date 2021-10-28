package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PlacementStrategyProperty {

  def apply(
    field: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder)
      .field(field.orNull)
      .`type`(`type`.orNull)
      .build()
}
