package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnChannelProps {

  def apply(
    egressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty] = None,
    id: Option[String] = None,
    ingressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.mediapackage.CfnChannelProps =
    (new software.amazon.awscdk.services.mediapackage.CfnChannelProps.Builder)
      .egressAccessLogs(egressAccessLogs.orNull)
      .id(id.orNull)
      .ingressAccessLogs(ingressAccessLogs.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
