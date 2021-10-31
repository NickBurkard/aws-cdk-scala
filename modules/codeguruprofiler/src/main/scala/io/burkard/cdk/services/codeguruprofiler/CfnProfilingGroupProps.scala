package io.burkard.cdk.services.codeguruprofiler

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProfilingGroupProps {

  def apply(
    profilingGroupName: Option[String] = None,
    computePlatform: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    agentPermissions: Option[AnyRef] = None,
    anomalyDetectionNotificationConfiguration: Option[List[_]] = None
  ): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps =
    (new software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps.Builder)
      .profilingGroupName(profilingGroupName.orNull)
      .computePlatform(computePlatform.orNull)
      .tags(tags.map(_.asJava).orNull)
      .agentPermissions(agentPermissions.orNull)
      .anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.map(_.asJava).orNull)
      .build()
}
