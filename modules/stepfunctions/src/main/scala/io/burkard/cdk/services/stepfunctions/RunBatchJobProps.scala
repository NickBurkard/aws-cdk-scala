package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunBatchJobProps {

  def apply(
    jobName: Option[String] = None,
    containerOverrides: Option[software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides] = None,
    attempts: Option[Number] = None,
    payload: Option[Map[String, _]] = None,
    jobQueueArn: Option[String] = None,
    arraySize: Option[Number] = None,
    jobDefinitionArn: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    dependsOn: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.JobDependency]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.RunBatchJobProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.RunBatchJobProps.Builder)
      .jobName(jobName.orNull)
      .containerOverrides(containerOverrides.orNull)
      .attempts(attempts.orNull)
      .payload(payload.map(_.asJava).orNull)
      .jobQueueArn(jobQueueArn.orNull)
      .arraySize(arraySize.orNull)
      .jobDefinitionArn(jobDefinitionArn.orNull)
      .timeout(timeout.orNull)
      .integrationPattern(integrationPattern.orNull)
      .dependsOn(dependsOn.map(_.asJava).orNull)
      .build()
}
