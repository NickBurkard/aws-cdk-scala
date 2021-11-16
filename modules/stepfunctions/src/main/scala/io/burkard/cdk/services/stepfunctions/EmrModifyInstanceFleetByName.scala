package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrModifyInstanceFleetByName {

  def apply(
    internalResourceId: String,
    instanceFleetName: String,
    targetOnDemandCapacity: Number,
    clusterId: String,
    targetSpotCapacity: Number,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName.Builder
      .create(stackCtx, internalResourceId)
      .instanceFleetName(instanceFleetName)
      .targetOnDemandCapacity(targetOnDemandCapacity)
      .clusterId(clusterId)
      .targetSpotCapacity(targetSpotCapacity)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
