package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StoppingCondition {

  def apply(
    maxRuntime: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition =
    (new software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition.Builder)
      .maxRuntime(maxRuntime.orNull)
      .build()
}
