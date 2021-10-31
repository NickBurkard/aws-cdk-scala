package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmrSetClusterTerminationProtection {

  def apply(
    internalResourceId: String,
    resultPath: Option[String] = None,
    clusterId: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    terminationProtected: Option[Boolean] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtection =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtection.Builder
      .create(stackCtx, internalResourceId)
      .resultPath(resultPath.orNull)
      .clusterId(clusterId.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .terminationProtected(terminationProtected.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
