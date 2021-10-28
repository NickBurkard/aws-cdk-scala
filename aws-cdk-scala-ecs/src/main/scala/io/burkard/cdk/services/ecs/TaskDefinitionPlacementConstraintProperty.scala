package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskDefinitionPlacementConstraintProperty {

  def apply(
    expression: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder)
      .expression(expression.orNull)
      .`type`(`type`.orNull)
      .build()
}
