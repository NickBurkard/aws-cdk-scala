package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrModifyInstanceGroupByNameProps {

  def apply(
    clusterId: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    instanceGroupName: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    resultPath: Option[String] = None,
    instanceGroup: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps.Builder)
      .clusterId(clusterId.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .instanceGroupName(instanceGroupName.orNull)
      .heartbeat(heartbeat.orNull)
      .resultPath(resultPath.orNull)
      .instanceGroup(instanceGroup.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
