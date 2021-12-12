package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrContainersStartJobRun {

  def apply(
    internalResourceId: String,
    jobDriver: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver,
    releaseLabel: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel,
    virtualCluster: software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput,
    jobName: Option[String] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    applicationConfig: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration]] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    monitoring: Option[software.amazon.awscdk.services.stepfunctions.tasks.Monitoring] = None,
    tags: Option[Map[String, String]] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun.Builder
      .create(stackCtx, internalResourceId)
      .jobDriver(jobDriver)
      .releaseLabel(releaseLabel)
      .virtualCluster(virtualCluster)
      .jobName(jobName.orNull)
      .executionRole(executionRole.orNull)
      .applicationConfig(applicationConfig.map(_.asJava).orNull)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .monitoring(monitoring.orNull)
      .tags(tags.map(_.asJava).orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
