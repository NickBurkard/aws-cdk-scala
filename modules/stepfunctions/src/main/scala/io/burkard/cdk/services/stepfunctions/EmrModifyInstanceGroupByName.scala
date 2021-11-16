package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrModifyInstanceGroupByName {

  def apply(
    internalResourceId: String,
    clusterId: String,
    instanceGroupName: String,
    instanceGroup: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    resultPath: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder
      .create(stackCtx, internalResourceId)
      .clusterId(clusterId)
      .instanceGroupName(instanceGroupName)
      .instanceGroup(instanceGroup)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .resultPath(resultPath.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
