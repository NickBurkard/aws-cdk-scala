package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PlacementConstraintProperty {

  def apply(
    expression: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder)
      .expression(expression.orNull)
      .`type`(`type`.orNull)
      .build()
}
