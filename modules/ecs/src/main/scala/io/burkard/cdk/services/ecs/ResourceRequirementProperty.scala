package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceRequirementProperty {

  def apply(
    `type`: String,
    value: String
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.Builder)
      .`type`(`type`)
      .value(value)
      .build()
}
