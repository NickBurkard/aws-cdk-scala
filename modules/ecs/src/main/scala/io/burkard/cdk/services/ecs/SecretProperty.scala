package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretProperty {

  def apply(
    name: Option[String] = None,
    valueFrom: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.Builder)
      .name(name.orNull)
      .valueFrom(valueFrom.orNull)
      .build()
}
