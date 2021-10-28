package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SystemControlProperty {

  def apply(
    value: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.Builder)
      .value(value.orNull)
      .namespace(namespace.orNull)
      .build()
}
