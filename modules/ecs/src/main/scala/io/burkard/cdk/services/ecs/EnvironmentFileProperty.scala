package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentFileProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
