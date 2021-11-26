package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SystemControl {

  def apply(
    value: String,
    namespace: String
  ): software.amazon.awscdk.services.ecs.SystemControl =
    (new software.amazon.awscdk.services.ecs.SystemControl.Builder)
      .value(value)
      .namespace(namespace)
      .build()
}
