package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretProperty {

  def apply(
    name: String,
    valueFrom: String
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.Builder)
      .name(name)
      .valueFrom(valueFrom)
      .build()
}
