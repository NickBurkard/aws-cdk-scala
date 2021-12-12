package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JobDriver {

  def apply(
    sparkSubmitJobDriver: software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
  ): software.amazon.awscdk.services.stepfunctions.tasks.JobDriver =
    (new software.amazon.awscdk.services.stepfunctions.tasks.JobDriver.Builder)
      .sparkSubmitJobDriver(sparkSubmitJobDriver)
      .build()
}
