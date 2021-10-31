package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowLogProps {

  def apply(
    trafficType: Option[String] = None,
    deliverLogsPermissionArn: Option[String] = None,
    logGroupName: Option[String] = None,
    maxAggregationInterval: Option[Number] = None,
    resourceId: Option[String] = None,
    resourceType: Option[String] = None,
    logDestinationType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    logFormat: Option[String] = None,
    logDestination: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnFlowLogProps =
    (new software.amazon.awscdk.services.ec2.CfnFlowLogProps.Builder)
      .trafficType(trafficType.orNull)
      .deliverLogsPermissionArn(deliverLogsPermissionArn.orNull)
      .logGroupName(logGroupName.orNull)
      .maxAggregationInterval(maxAggregationInterval.orNull)
      .resourceId(resourceId.orNull)
      .resourceType(resourceType.orNull)
      .logDestinationType(logDestinationType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .logFormat(logFormat.orNull)
      .logDestination(logDestination.orNull)
      .build()
}
