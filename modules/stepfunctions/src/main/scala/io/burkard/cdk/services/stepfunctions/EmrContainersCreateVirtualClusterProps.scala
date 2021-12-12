package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrContainersCreateVirtualClusterProps {

  def apply(
    eksCluster: software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput,
    tags: Option[Map[String, String]] = None,
    resultPath: Option[String] = None,
    virtualClusterName: Option[String] = None,
    eksNamespace: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps.Builder)
      .eksCluster(eksCluster)
      .tags(tags.map(_.asJava).orNull)
      .resultPath(resultPath.orNull)
      .virtualClusterName(virtualClusterName.orNull)
      .eksNamespace(eksNamespace.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
