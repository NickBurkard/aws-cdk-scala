package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskDefinitionPlacementConstraintProperty {

  def apply(
    `type`: String,
    expression: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder)
      .`type`(`type`)
      .expression(expression.orNull)
      .build()
}
