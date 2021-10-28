package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskEnvironmentVariable {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
