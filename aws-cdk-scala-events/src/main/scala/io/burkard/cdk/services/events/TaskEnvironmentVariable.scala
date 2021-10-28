package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
