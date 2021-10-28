package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmrModifyInstanceFleetByNameProps {

  def apply(
    instanceFleetName: Option[String] = None,
    targetOnDemandCapacity: Option[Number] = None,
    resultPath: Option[String] = None,
    clusterId: Option[String] = None,
    targetSpotCapacity: Option[Number] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByNameProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByNameProps.Builder)
      .instanceFleetName(instanceFleetName.orNull)
      .targetOnDemandCapacity(targetOnDemandCapacity.orNull)
      .resultPath(resultPath.orNull)
      .clusterId(clusterId.orNull)
      .targetSpotCapacity(targetSpotCapacity.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
