package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SparkSubmitJobDriver {

  def apply(
    entryPoint: software.amazon.awscdk.services.stepfunctions.TaskInput,
    entryPointArguments: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    sparkSubmitParameters: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.Builder)
      .entryPoint(entryPoint)
      .entryPointArguments(entryPointArguments.orNull)
      .sparkSubmitParameters(sparkSubmitParameters.orNull)
      .build()
}
