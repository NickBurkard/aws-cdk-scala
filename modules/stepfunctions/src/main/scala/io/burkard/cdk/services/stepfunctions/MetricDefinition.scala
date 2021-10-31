package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDefinition {

  def apply(
    regex: Option[String] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition =
    (new software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition.Builder)
      .regex(regex.orNull)
      .name(name.orNull)
      .build()
}
