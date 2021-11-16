package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskEnvironmentVariable {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable.Builder)
      .name(name)
      .value(value)
      .build()
}
