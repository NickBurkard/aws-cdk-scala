package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PlacementConstraintProperty {

  def apply(
    expression: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty =
    (new software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty.Builder)
      .expression(expression.orNull)
      .`type`(`type`.orNull)
      .build()
}
