package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskEnvironmentVariable {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable =
    (new software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
