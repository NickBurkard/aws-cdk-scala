package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BatchJobDependency {

  def apply(
    jobId: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency =
    (new software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency.Builder)
      .jobId(jobId.orNull)
      .`type`(`type`.orNull)
      .build()
}
