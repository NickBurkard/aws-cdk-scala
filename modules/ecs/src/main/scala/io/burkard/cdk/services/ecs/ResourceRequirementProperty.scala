package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceRequirementProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
