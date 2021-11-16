package io.burkard.cdk.services.codeguruprofiler

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProfilingGroup {

  def apply(
    internalResourceId: String,
    profilingGroupName: String,
    computePlatform: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    agentPermissions: Option[AnyRef] = None,
    anomalyDetectionNotificationConfiguration: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup =
    software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.Builder
      .create(stackCtx, internalResourceId)
      .profilingGroupName(profilingGroupName)
      .computePlatform(computePlatform.orNull)
      .tags(tags.map(_.asJava).orNull)
      .agentPermissions(agentPermissions.orNull)
      .anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.map(_.asJava).orNull)
      .build()
}
