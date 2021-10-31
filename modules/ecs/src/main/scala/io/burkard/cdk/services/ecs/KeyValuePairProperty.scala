package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyValuePairProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
