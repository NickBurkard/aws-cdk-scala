package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunBatchJob {

  def apply(
    jobName: String,
    jobQueueArn: String,
    jobDefinitionArn: String,
    containerOverrides: Option[software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides] = None,
    attempts: Option[Number] = None,
    payload: Option[Map[String, _]] = None,
    arraySize: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    dependsOn: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.JobDependency]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.RunBatchJob =
    software.amazon.awscdk.services.stepfunctions.tasks.RunBatchJob.Builder
      .create()
      .jobName(jobName)
      .jobQueueArn(jobQueueArn)
      .jobDefinitionArn(jobDefinitionArn)
      .containerOverrides(containerOverrides.orNull)
      .attempts(attempts.orNull)
      .payload(payload.map(_.asJava).orNull)
      .arraySize(arraySize.orNull)
      .timeout(timeout.orNull)
      .integrationPattern(integrationPattern.orNull)
      .dependsOn(dependsOn.map(_.asJava).orNull)
      .build()
}
