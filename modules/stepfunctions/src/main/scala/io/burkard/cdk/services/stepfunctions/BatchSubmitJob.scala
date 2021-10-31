package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BatchSubmitJob {

  def apply(
    internalResourceId: String,
    jobName: Option[String] = None,
    containerOverrides: Option[software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides] = None,
    attempts: Option[Number] = None,
    payload: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    jobQueueArn: Option[String] = None,
    resultPath: Option[String] = None,
    arraySize: Option[Number] = None,
    jobDefinitionArn: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    dependsOn: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency]] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob =
    software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder
      .create(stackCtx, internalResourceId)
      .jobName(jobName.orNull)
      .containerOverrides(containerOverrides.orNull)
      .attempts(attempts.orNull)
      .payload(payload.orNull)
      .jobQueueArn(jobQueueArn.orNull)
      .resultPath(resultPath.orNull)
      .arraySize(arraySize.orNull)
      .jobDefinitionArn(jobDefinitionArn.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .dependsOn(dependsOn.map(_.asJava).orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
