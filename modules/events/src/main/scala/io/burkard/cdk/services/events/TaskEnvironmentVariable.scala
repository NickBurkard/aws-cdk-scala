package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskEnvironmentVariable {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable =
    (new software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable.Builder)
      .name(name)
      .value(value)
      .build()
}
