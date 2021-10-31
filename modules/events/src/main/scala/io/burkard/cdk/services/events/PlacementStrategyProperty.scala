package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PlacementStrategyProperty {

  def apply(
    field: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty =
    (new software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty.Builder)
      .field(field.orNull)
      .`type`(`type`.orNull)
      .build()
}
